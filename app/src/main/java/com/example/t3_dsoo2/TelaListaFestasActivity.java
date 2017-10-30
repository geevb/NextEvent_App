package com.example.t3_dsoo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaListaFestasActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Eventos> eventos = new ArrayList<>();


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lista_festas);

        // Get ListView object from xml
        listView = findViewById(R.id.list);

        // ArrayList de Eventos
        preencherArrayFestas();

        // Defined Array values to show in ListView
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        final ArrayAdapter<Eventos> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, eventos);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                //String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
//                Toast.makeText(getApplicationContext(),
//                        "Position :"+position+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//                        .show();

                Intent intent = new Intent(getApplicationContext(), TelaDetalhesFestasActivity.class);

                intent.putExtra("nome", adapter.getItem(position).getNome());
                intent.putExtra("descricao", adapter.getItem(position).getDescricao());
                intent.putExtra("data", adapter.getItem(position).getDataDaFesta());
                intent.putExtra("horario", adapter.getItem(position).getHorario());
                intent.putExtra("valor", adapter.getItem(position).getValor());
                intent.putExtra("endereco", adapter.getItem(position).getEndereco());
                intent.putExtra("faixaEtaria", adapter.getItem(position).getFaixaEtaria());
                startActivity(intent);

            }

        });
    }

    public void preencherArrayFestas(){
        Eventos ccxp = new Eventos("Comic Con Experience",
                "Comic Con Experience é um evento brasileiro de cultura pop " +
                        "nos moldes da San Diego Comic-Con cobrindo as principais áreas dessa indústria " +
                        "como: jogos, quadrinhos, filmes e TV.",
                "7 a 10 Dez. 2017",
                "11h ~ 21h",
                "R$150,00/dia",
                "São Paulo Expo Exhibition & Convention Center - Rodovia dos Imigrantes, Km 1,5.",
                "Livre");

        Eventos rockinrio = new Eventos("Rock in Rio VII",
                "Rock in Rio é um festival de música idealizado pelo empresário brasileiro Roberto Medina pela primeira vez em 1985, sendo, " +
                        "desde sua criação, reconhecidamente, o maior festival musical do planeta.",
                "15 a 24 Set. 2017",
                "12h ~ 02h",
                "R$250,00",
                "Parque Olímpico da Barra - Av. Embaixador Abelardo Bueno, 3401, Barra da Tijuca",
                "16+");

        Eventos lolworldsfinal = new Eventos("League of Legends Worlds Finals",
                "Campeonato Mundial de League of Legends é um campeonato internacional anual de esporte eletrônico voltado para o game League of Legends, " +
                        "organizado pela empresa americana Riot Games.",
                "4 Nov. 2017",
                "15:30h ~ 21h",
                "R$200,00",
                "Estádio Nacional de Pequim - 1 National Stadium S Rd, Chaoyang Qu, China, 100101",
                "Livre");

        eventos.add(ccxp);
        eventos.add(rockinrio);
        eventos.add(lolworldsfinal);
    }


    }

