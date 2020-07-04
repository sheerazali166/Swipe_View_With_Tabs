package com.example.swipeviewwithtabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment extends Fragment {

    TextView textViewMessage;

    public DemoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);

        textViewMessage = view.findViewById(R.id.textViewMessage);
        String message = getArguments().getString("message");
        textViewMessage.setText(message);

        return view;
    }
}