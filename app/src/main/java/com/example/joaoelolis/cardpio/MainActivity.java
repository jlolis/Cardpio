package com.example.joaoelolis.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.joaoelolis.cardpio.modelos.Produto;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.joaoelolis.cardpio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBatata (View view){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Batata Recheada");
        startActivity(intent);

    }

    public void abrirPaoDeBanana (View view){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Pão de Banana");
        startActivity(intent);
    }

    public void abrirPudim (View view){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Pudim");
        startActivity(intent);
    }

    public void abrirQuibe (View view){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Quibe");
        startActivity(intent);
    }
}
