package com.dpenny.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** Called when the user touches the button */
    public void sendMessage(View view)
    {
        TextView tv = findViewById(R.id.textDisplay);
        tv.setText("Hello");
    }

}
