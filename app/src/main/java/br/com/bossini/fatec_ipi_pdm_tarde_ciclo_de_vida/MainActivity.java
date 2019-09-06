package br.com.bossini.fatec_ipi_pdm_tarde_ciclo_de_vida;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclo_de_vida", "MainActivity:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclo_de_vida", "MainActivity:onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclo_de_vida", "MainActiviy:onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclo_de_vida", "MainActivity:onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo_de_vida", "MainActivity:onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo_de_vida", "MainActivity:onStart");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i("ciclo_de_vida", "MainActivity:onCreate");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent
                        = new Intent (MainActivity.this, SegundaActivity.class);

                startActivity(intent);
            }
        });

    }


}
