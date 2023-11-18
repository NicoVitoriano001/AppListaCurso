package com.example.applistacurso.view;

//import são as classes necessárias
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.applistacurso.R;
import com.example.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    // outro objeto. tem que instanciar esse objeto, na MainActivty
    //Classe-Pessoa objeto-pessoa
    Pessoa pessoa;
    Pessoa outrapessoa;
    String dadosPessoa;
    String dadosOutraPessoa;



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

         outrapessoa = new Pessoa();
         outrapessoa.setPrimeiroNome("Juazrez");
         outrapessoa.setSobreNome("Silva");
         outrapessoa.setCursoDesejado("Java");
         outrapessoa.setTelefoneContato("11-32020202");


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


         int parada = 0;




    }
}