package arq.ifsp.dmo.dadosentretelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ciclo", getClassName() + " .onCreate() - Tela 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo", getClassName() + " .onStart() - Tela 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo", getClassName() + " .onResume() - Tela 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo", getClassName() + " .onPause() - Tela 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo", getClassName() + " .onStop() - Tela 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo", getClassName() + " .onRestart() - Tela 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo", getClassName() + " .onDestroy() - Tela 1");
    }

    private String getClassName() {
        String nomeClasse = getClass().getName();
        return nomeClasse.substring(nomeClasse.lastIndexOf("."));
    }

    public void btnClickBtnEnviar(View view) {
        Intent intent = new Intent(getBaseContext(), Tela2Activity.class);

        //Envio de dados pelo objeto Intent
        //intent.putExtra("nome", "Flor");
        //intent.putExtra("idade", 20);

        //Envio de dados pelo objeto Pessoa
        Pessoa pessoa = new Pessoa("Flor", 20);
        intent.putExtra("pessoa", pessoa);

        startActivity(intent);
    }
}