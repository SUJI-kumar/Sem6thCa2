package com.example.sujitassignmenttwo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment2 extends Fragment {
    TextView txt0,txt1,txt2;
    Button button1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_fragment2,container,false);
        txt0=v.findViewById(R.id.t0);
        txt1=v.findViewById(R.id.t1);
        txt2=v.findViewById(R.id.t2);
        button1=v.findViewById(R.id.buttonReceive);
        button1.setOnClickListener(C);
        return v;

    }
    View.OnClickListener  C=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle b =getArguments();
            if(b!=null)
            {
                String valueReceived[]=b.getStringArray("key");
                txt0.setText(valueReceived[0]);
                txt1.setText(valueReceived[1]);
                txt2.setText(valueReceived[2]);
            }
            else
            {
                Toast.makeText(getContext(),"not recived any value from the fragment",Toast.LENGTH_LONG).show();
            }
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