package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int PICK_IMAGE =100;
    Uri imageuri ;
    Button buttongalery;
    GridView gridView;
    List<Uri>listaImagenes=new ArrayList<>();
    //GridViewAdapter baseadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttongalery= findViewById(R.id.gv_imagenes);
        gridView=findViewById(R.id.buton_galeria);

        buttongalery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirGaleria();
            }
        });
    }

    private void abrirGaleria() {
    }
}