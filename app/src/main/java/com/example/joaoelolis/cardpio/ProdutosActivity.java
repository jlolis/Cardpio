package com.example.joaoelolis.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.joaoelolis.cardpio.modelos.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {


    private TextView textViewTitulo;
    private LinearLayout linearLayout;
    private ArrayList<Produto> produtos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        textViewTitulo = findViewById(R.id.textViewTitulo);
        linearLayout = findViewById(R.id.layout);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        textViewTitulo.setText(titulo);

        criarProdutos(titulo);

    }

    public void criarProdutos(String titulo){

        if(titulo.equals("Batata Recheada")){
            produtos.add(new Produto("Batata Recheada",10.00,"Batata recheada com bacon","COMIDA"));
        }

        else if(titulo.equals("Pão de Banana")){
            produtos.add(new Produto("Pão de Banana",15.00,"Pão caseiro feito com banana"));
        }

        else if(titulo.equals("Pudim")){
            produtos.add(new Produto("Pudim",6.00));
        }

        else if(titulo.equals("Quibe")){
            produtos.add(new Produto("Quibe"));
        }

        listaProdutos(produtos);
    }

    public void listaProdutos(ArrayList<Produto> lista){
        for(int i=0; i<lista.size(); i++){
            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);
            TextView textViewDescricao = new TextView(this);
            TextView textViewCategoria = new TextView(this);

            textViewNome.setText(lista.get(i).getNome());
            textViewNome.setTextSize(18);

            textViewPreco.setText(lista.get(i).getPreco().toString());
            textViewDescricao.setText(lista.get(i).getDescricao());
            textViewCategoria.setText(lista.get(i).getCategoria());

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDescricao);
            linearLayout.addView(textViewCategoria);

        }

    }



}
