package com.example.t3_dsoo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        String endereco = getIntent().getExtras().getString("endereco");
        String faixaEtaria = getIntent().getExtras().getString("faixaEtaria");

        // Nome
        TextView textViewNome = findViewById(R.id.textViewNome);
        textViewNome.setText(nome);

        TextView textViewVlData = findViewById(R.id.textViewVlData);
        textViewVlData.setText(data);

        TextView textViewVlHorario = findViewById(R.id.textViewVlHorario);
        textViewVlHorario.setText(horario);

        TextView textViewVlValor = findViewById(R.id.textViewVlValor);
        textViewVlValor.setText(valor);

        TextView textViewVlDescricao = findViewById(R.id.textViewVlDescricao);
        textViewVlDescricao.setText(descricao);

        TextView textViewFaixaEtaria = findViewById(R.id.textViewVlFaixaEtaria);
        textViewFaixaEtaria.setText(faixaEtaria);

//        TextView textViewEndereco = findViewById(R.id.textViewEndereco);
//        textViewNome.setText(nome);
//

    }
}
