package com.example.saveme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt4);
        Intent i = new Intent(this, MainActivity2.class);
        new CountDownTimer(10000,1000)
        {
            @Override
            public void onTick(long l)
            {
                txt.setText("ESPERANDO..."+l/1000);
            }

            @Override
            public void onFinish()
            {
                txt.setText("¡COMIENZA!");
                startActivity(i);
            }
        }.start();
    }

}