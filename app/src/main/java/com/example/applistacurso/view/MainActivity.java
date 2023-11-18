package com.example.applistacurso.view;

//import são as classes necessárias
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.applistacurso.R;
import com.example.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa; //Classe-Pessoa objeto-pessoa

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //criou os objetos (estanciou os objetos)
        pessoa = new Pessoa();

        //atribuir dados, valores ao objetos, conforme Pessoa (generate > getts and setts)
 pessoa.setPrimeiroNome("Nico");
 pessoa.setSobreNome("Vitor");
 pessoa.setCursoDesejado("Android");
 pessoa.setTelefoneContato("85-11002020203");
    }
}