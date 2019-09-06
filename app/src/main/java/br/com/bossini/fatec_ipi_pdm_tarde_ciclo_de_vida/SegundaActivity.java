package br.com.bossini.fatec_ipi_pdm_tarde_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclo_de_vida", "SegundaActivity:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclo_de_vida", "SegundaActivity:onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclo_de_vida", "SegundaActivity:onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclo_de_vida", "SegundaActivity:onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo_de_vida", "SegundaActivity:onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo_de_vida", "SegundaActivity:onStart");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.i("ciclo_de_vida", "SegundaActivity:onCreate");
    }
}
