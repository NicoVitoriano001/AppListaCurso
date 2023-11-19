package com.example.applistacurso.Controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller Iniciado...");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

    }
}
