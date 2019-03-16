package com.example.week2assesment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText namein;
    EditText no1;
    EditText no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namein = findViewById(R.id.namein);
        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);
    }

    public void showMyToast (View my_view){
        String name = namein.getText().toString();
        if(name.isEmpty()){

        }
        else {
            Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
        }

    }

    public void addToast(View view){
        try {
            int noo1 = Integer.parseInt(no1.getText().toString());
            int noo2 = Integer.parseInt(no2.getText().toString());
            int addition = noo1 + noo2;
            Toast.makeText(getApplicationContext(), String.valueOf(addition), Toast.LENGTH_LONG).show();
        } catch(Exception e){
            Toast.makeText(getApplicationContext(), "Invaid input", Toast.LENGTH_LONG).show();
        }
    }
}
