package com.example.applistacurso.view;

//import são as classes necessárias
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.applistacurso.R;
import com.example.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    // outro objeto. tem que instanciar esse objeto, na MainActivty
    //Classe-Pessoa objeto-pessoa
    Pessoa pessoa;
    Pessoa outrapessoa;
    String dadosPessoa;
    String dadosOutraPessoa;

    EditText edit_primeiroNome;
    EditText edit_SobrenomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;




     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //criou os objetos (estanciou os objetos)
        pessoa = new Pessoa();
        //atribuir dados, valores ao objetos, conforme Pessoa (generate > getts and setts)
        /* pessoa.setPrimeiroNome("Nico");
         pessoa.setSobreNome("Vitor");
         pessoa.setCursoDesejado("Android");
         pessoa.setTelefoneContato("85-11002020203");*/

         outrapessoa = new Pessoa();
         outrapessoa.setPrimeiroNome("Juazrez");
         outrapessoa.setSobreNome("Silva");
         outrapessoa.setCursoDesejado("Java");
         outrapessoa.setTelefoneContato("11-32020202");

        edit_primeiroNome = findViewById(R.id.edit_primeiroNome);
        edit_SobrenomeAluno = findViewById(R.id.edit_SobrenomeAluno);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);


        edit_primeiroNome.setText(pessoa.getPrimeiroNome());
        edit_SobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_primeiroNome.setText("");
                edit_SobrenomeAluno.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");

            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            pessoa.setPrimeiroNome(edit_primeiroNome.getText().toString());
            pessoa.setSobreNome(edit_SobrenomeAluno.getText().toString());
            pessoa.setCursoDesejado(editNomeCurso.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo "+pessoa.toString(), Toast.LENGTH_LONG).show();


            }
        });


        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();


         dadosOutraPessoa = "Primeiro nome: ";
         dadosOutraPessoa += outrapessoa.getPrimeiroNome();
         dadosOutraPessoa += " Sobrenome: ";
         dadosOutraPessoa += outrapessoa.getSobreNome();
         dadosOutraPessoa += " Curso Desejado: ";
         dadosOutraPessoa += outrapessoa.getCursoDesejado();
         dadosOutraPessoa += " Telefone de Contato: ";
         dadosOutraPessoa += outrapessoa.getTelefoneContato();


//visualizar pelo tostring
        Log.i("POOAndroid", pessoa.toString());
        Log.i("POOAndroid", outrapessoa.toString());



    }
}