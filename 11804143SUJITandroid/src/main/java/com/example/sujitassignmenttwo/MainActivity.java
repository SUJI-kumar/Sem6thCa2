package com.example.sujitassignmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("MR SINGH");
        LayoutInflater inflater=getLayoutInflater();
        ViewGroup footer=(ViewGroup)inflater.inflate(R.layout.footer,ll,false);
        ll=findViewById(R.id.ll);
        ll.addView(footer);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        ll = findViewById(R.id.ll);
        int id = item.getItemId();
        switch (id) {
            case R.id.bt:
                ll.setBackgroundColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.auto:
                ll.setBackgroundColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.gallery:
                ll.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(), "opening:" + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.call_action:
                ll.setBackgroundColor(Color.LTGRAY);
                Toast.makeText(this, "Calling Sujit", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:8929944156"));
                startActivity(i);
                return true;
            case R.id.SMS_action:
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contact:
                Toast.makeText(this, "contact Selected", Toast.LENGTH_SHORT).show();
                Intent i3 = new Intent();
                i3.setAction(Intent.ACTION_VIEW);
                i3.setData(Uri.parse("content://contacts/people/"));
                startActivity(i3);
                return true;
            case R.id.gal:
                Toast.makeText(getApplicationContext(),"opening:"+item.getTitle(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), fragmentmain.class);
                startActivity(intent);
                return true;
            case R.id.alarm:
                Toast.makeText(getApplicationContext(),item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplicationContext(), "COVID19 Helpline Number\t1950\n" +
                        "Police Control Room\t0124-2316100\n" +
                        "SMS to Police Control Room\t0124100\n" +
                        "Cyber Crime Cell\t0124-2211033\n" +
                        "Traffic Helpline Numbers\t9213020404", Toast.LENGTH_SHORT).show();
                return true;

            default:

                return super.onOptionsItemSelected(item);

        }
    }
}
