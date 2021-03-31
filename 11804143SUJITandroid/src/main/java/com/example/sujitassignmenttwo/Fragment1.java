package com.example.sujitassignmenttwo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    EditText ed0,ed1,ed2;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_fragment1,container,false);
        ed0=v.findViewById(R.id.name);
        ed1=v.findViewById(R.id.phone);
        ed2=v.findViewById(R.id.password);
        ed1.setText("");
        ed2.setText("");
        button=v.findViewById(R.id.send);
        button.setOnClickListener(C);
        return v;
    }
    View.OnClickListener C = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(CheckAllFields())
            {
                String value[]={ed0.getText().toString(),ed1.getText().toString(),ed2.getText().toString()};
                Fragment2 g=new Fragment2();
                Bundle b=new Bundle();
                b.putStringArray("key",value);
                g.setArguments(b);
                getFragmentManager().beginTransaction().replace(R.id.f5,g).addToBackStack("some text").commit();
            }
            else {
                Toast.makeText(getContext(), "Enter valid details", Toast.LENGTH_SHORT).show();
            }

        }
    };
     boolean CheckAllFields() {
         if (ed0.length() == 0) {
             ed0.setError("This field is required");
             return false;
         }

        if (ed1.length() == 0) {
            ed1.setError("This field is required");
            return false;
        }
        else if (ed1.length() < 10) {
            ed1.setError("Mobile no can't be below 10");
            return false;
        }else if(ed1.length()>10) {
            ed1.setError("Mobile no can't be above 10");
            return false;
        }




        if (ed2.length() == 0) {
            ed2.setError("Password is required");
            return false;
        } else if (ed2.length() < 6) {
            ed2.setError("Password must be minimum 6 characters");
            return false;
        }

        return true;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
