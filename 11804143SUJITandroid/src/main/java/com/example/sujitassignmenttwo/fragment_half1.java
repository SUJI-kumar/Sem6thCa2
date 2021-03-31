package com.example.sujitassignmenttwo;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class fragment_half1 extends Fragment {
    Button b1,b2,b3;
    Fragment1 fragment1;
    Fragment2 fragment2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_half1,container,false);
        b1=v.findViewById(R.id.b1);
        b2=v.findViewById(R.id.b2);
        b3=v.findViewById(R.id.b3);

        fragment1=new Fragment1();
        fragment2=new Fragment2();
        b1.setOnClickListener(c1);
        b2.setOnClickListener(c2);
        b3.setOnClickListener(c3);
        return v;
    }
    View.OnClickListener c1=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.f5,fragment1).addToBackStack(null).commit();
        }
    };
    View.OnClickListener c2=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.f5,fragment2).addToBackStack(null).commit();

        }
    };
    View.OnClickListener c3=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getContext(), "open it from option menu", Toast.LENGTH_SHORT).show();

        }
    };

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}