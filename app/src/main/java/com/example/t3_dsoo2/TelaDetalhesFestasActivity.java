package com.example.t3_dsoo2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaDetalhesFestasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_detalhes_festas);

        String nome = getIntent().getExtras().getString("nome");
        String descricao = getIntent().getExtras().getString("descricao");
        String data = getIntent().getExtras().getString("data");
        String horario = getIntent().getExtras().getString("horario");
        String valor = getIntent().getExtras().getString("valor");
        String faixaEtaria = getIntent().getExtras().getString("faixaEtaria");

        // Nome do Evento
        TextView textViewNome = findViewById(R.id.textViewNome);
        textViewNome.setText(nome);

        // Data do Evento
        TextView textViewVlData = findViewById(R.id.textViewVlData);
        textViewVlData.setText(data);

        // Horário do Evento
        TextView textViewVlHorario = findViewById(R.id.textViewVlHorario);
        textViewVlHorario.setText(horario);

        // Valor do Evento
        TextView textViewVlValor = findViewById(R.id.textViewVlValor);
        textViewVlValor.setText(valor);

        // Descrição do Evento
        TextView textViewVlDescricao = findViewById(R.id.textViewVlDescricao);
        textViewVlDescricao.setText(descricao);

        // Faixa Etária do Evento
        TextView textViewFaixaEtaria = findViewById(R.id.textViewVlFaixaEtaria);
        textViewFaixaEtaria.setText(faixaEtaria);



    }

    public void abrirTelaGoogleMaps(View view) {
        String endereco = "http://maps.google.co.in/maps?q=" + getIntent().getExtras().getString("endereco");;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
        startActivity(intent);
    }

    public void abrirTelaYoutube(View view){
        String videoId = getIntent().getExtras().getString("videoId");
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + videoId));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + videoId));

        // Tentar abrir o APP do Youtube
        try {
            getApplicationContext().startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            // Tentar abrir via app WEB
            getApplicationContext().startActivity(webIntent);
        }

    }
}
