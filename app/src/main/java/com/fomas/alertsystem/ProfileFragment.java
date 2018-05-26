package com.fomas.alertsystem;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;


public class ProfileFragment extends Fragment {

    private FirebaseAuth mAuth;


    private TextView userEmail;

    public ProfileFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        mAuth = FirebaseAuth.getInstance();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        getActivity().setTitle("My Profile");

        userEmail = view.findViewById(R.id.view_user_email);
        userEmail.setText(mAuth.getCurrentUser().getEmail());
        return view;
    }

}


