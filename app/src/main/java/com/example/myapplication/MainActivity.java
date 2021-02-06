package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b ;
    EditText t ;
    TextView tv ;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        t = (EditText) findViewById(R.id.editText) ;
        tv = (TextView) findViewById(R.id.textView) ;



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "Hello, ";
                String s = t.getText().toString();
                tv.setText(s1 + s);
            }

        });
    }
}


