package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Equipe>listeEquipe;

    Equipe e1 = new Equipe(1, "Avengers", "Super Héros Marvel", "avengers/Avengers.jpg");
    Equipe e2 = new Equipe(2, "JLA", "Super Héros DC", "jla/jla.png");
    Equipe e3 = new Equipe(3, "X-Men", "Super Héros Mutants", "xmen/xmen.png");
    Equipe e4 = new Equipe(3, "BTS-SIO2", "Super-Dev", "bts/Top_secret.png");

    ListView lvListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeEquipe = new ArrayList<Equipe>();
        listeEquipe.add(e1);
        listeEquipe.add(e2);
        listeEquipe.add(e3);
        listeEquipe.add(e4);

        lvListe = (ListView) findViewById(R.id.ListView1);
        
        lvListe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startViewActivity(i);
            }
        });

    }


    @Override
    protected void onResume() {
        super.onResume();
        ListeAdapter listeAdapter = new ListeAdapter(this, listeEquipe);
        lvListe.setAdapter(listeAdapter);
    }

    private void startViewActivity(int i) {
        Equipe uneEquipe = listeEquipe.get(i);
        Intent intent = new Intent(this, MembreActivity.class);
        intent.putExtra("idE", uneEquipe.getIdE());
        intent.putExtra("nomE", uneEquipe.getNomE());
        intent.putExtra("descE", uneEquipe.getDescE());
        intent.putExtra("imgE", uneEquipe.getImgE());
        startActivity(intent);
    }

}