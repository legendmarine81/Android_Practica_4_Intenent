package com.example.saveme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void abrirNavegador(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.symbolab.com/"));
        startActivity(i);
    }

    public void soyelMapa(View view)
    {
        Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-31.47, -64.183"));
        startActivity(in);
    }

    public void abrirCamara(View view)
    {
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }

    public void abrirTelefono(View view)
    {
        Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8711158601"));
        startActivity(in);
    }
}