package com.example.applistacurso.view;

//import são as classes necessárias
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.applistacurso.R;

import com.example.applistacurso.model.Pessoa;
import com.example.applistacurso.model.So;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa; //Classe-Pessoa objeto-pessoa
    So so;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //criou os objetos (estanciou os objetos)
        pessoa = new Pessoa();
        so = new So();



    }
}