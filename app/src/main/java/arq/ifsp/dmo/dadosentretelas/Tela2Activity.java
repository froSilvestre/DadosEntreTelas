package arq.ifsp.dmo.dadosentretelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        //Recebimento de dados pelo objeto Intent
        //String nome = intent.getStringExtra("nome");
        //int idade = intent.getIntExtra("idade", -1);

        //Recebimento de dados pelo objeto Pessoa
        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");

        String msg = String.format("Nome: %s\nIdade: %d", pessoa.getNome(), pessoa.getIdade());
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

        Log.d("ciclo", getClassName() + " .onCreate() - Tela 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo", getClassName() + " .onStart() - Tela 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo", getClassName() + " .onResume() - Tela 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo", getClassName() + " .onPause() - Tela 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo", getClassName() + " .onStop() - Tela 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo", getClassName() + " .onRestart() - Tela 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo", getClassName() + " .onDestroy() - Tela 2");
    }

    private String getClassName() {
        String nomeClasse = getClass().getName();
        return nomeClasse.substring(nomeClasse.lastIndexOf("."));
    }
}