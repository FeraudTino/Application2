package com.example.application2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MembreActivity extends AppCompatActivity {

    ArrayList<MembreEquipe> listeMembreEquipe;

    //Équipe Marvel
    MembreEquipe me1 = new MembreEquipe(1, "Captain America", "Steven « Steve » Rogers, alias Captain America est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.", "avengers/capamerica.png");
    MembreEquipe me2 = new MembreEquipe(2, "La Guêpe", "Janet Van Dyne, alias la Guêpe (The « Wasp » en version originale) est une super-héroïne évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.", "avengers/guepe.png");
    MembreEquipe me3 = new MembreEquipe(3, "Iron Man", "Tony Stark, inventeur de génie, vendeur d'armes et playboy milliardaire, est kidnappé en Aghanistan. Forcé par ses ravisseurs à fabriquer une arme redoutable, il construit en secret une armure high-tech révolutionnaire qu'il utilise pour s'échapper. Comprenant la puissance de cette armure, il décide de l'améliorer et de l'utiliser pour faire régner la justice et protéger les innocents.", "avengers/ironman.png");
    MembreEquipe me4 = new MembreEquipe(4, "Sorcière rouge", "Wanda Maximoff, alias la Sorcière rouge (« Scarlet Witch » en version originale) est une super-héroïne évoluant dans l'univers Marvel de la maison d'édition Marvel Comics. ", "avengers/sorciererouge.png");
    MembreEquipe me5 = new MembreEquipe(5, "Thor", "Au royaume d'Asgard, Thor est un guerrier aussi puissant qu'arrogant. Alors que ses actes téméraires, qui ont déclenché une guerre ancestrale, l'ont fait bannir sur Terre par Odin, son père, il est condamné à vivre parmi les hommes. Cependant, lorsque les forces du mal, en provenance d'Asgard, s'apprêtent à se déchaîner sur la Terre, Thor va devoir se comporter en véritable héros.", "avengers/thor.png");
    MembreEquipe me6 = new MembreEquipe(6, "Vif-Argent", "Juste erre dans Paris à la recherche de personnes qu'il est seul à voir. Il recueille leur dernier souvenir avant de les faire passer dans l'autre monde. Un jour, une jeune femme, Agathe, le reconnaît. Elle est vivante, lui est un fantôme. Ils vont devoir trouver un moyen de s'aimer et saisir cette deuxième chance.", "avengers/vifargent.png");
    MembreEquipe me7 = new MembreEquipe(7, "Vision", "Aarkus (en), un gardien de la paix originaire d’une dimension appelée Smokeworld, est contacté accidentellement par le scientifique terrien Markham Erickson. À l’invitation de ce dernier, il accepte de venir combattre le crime sur Terre.", "avengers/vision.png");

    //Équipe JLA
    MembreEquipe me8 = new MembreEquipe(8, "Aquaman", "L'homme qui aime l'eau !", "jla/aquaman.png");
    MembreEquipe me9 = new MembreEquipe(9, "Batman", "malheuresement ateint par le COVID-19 il décide de changer le monde", "jla/batman.png");
    MembreEquipe me10 = new MembreEquipe(10, "Cyborg", "Mis Homme, mis Cuivre", "jla/cyborg.png");
    MembreEquipe me11 = new MembreEquipe(11, "Flash", "Le roi de la photo", "jla/flash.png");
    MembreEquipe me12 = new MembreEquipe(12, "Greenlantern", "Il adore les lumières vertes", "jla/greenlantern.png");
    MembreEquipe me13 = new MembreEquipe(13, "Superman", "Un homme super !", "jla/superman.png");
    MembreEquipe me14 = new MembreEquipe(14, "Wonderwoman", "Un belle femme", "jla/wonderwoman.png");

    //Équipe DC
    MembreEquipe me15 = new MembreEquipe(15, "Angel", "2 Disque d'or et album de l'année en 2019", "xmen/angel.png");
    MembreEquipe me16 = new MembreEquipe(16, "Cyclope", "Il a qu'un oeil !", "xmen/cyclope.png");
    MembreEquipe me17 = new MembreEquipe(17, "Fauve", "Un vrai Lion", "xmen/fauve.png");
    MembreEquipe me18 = new MembreEquipe(18, "Iceberg", "Un ancien glacier révolté par le réchauffement climatique", "xmen/iceberg.png");
    MembreEquipe me19 = new MembreEquipe(19, "Phenix", "Un oiseau chaud", "xmen/phenix.png");

    //Équipe BTS
    MembreEquipe me20 = new MembreEquipe(18, "S-Pass", "Hacker de l'équipe, grace à sa maitrise de NotePad++. Il avertie les hackers qui truc les cookies via des alert js", "bts/pastoche.png");
    MembreEquipe me21 = new MembreEquipe(19, "Meta Girard", "Un AS incotésté des procédures stocker et du développement orienté objet. De quoi faire peur à tout les développeurs front ! ", "bts/gistoche.png");

    ListView lvListeMembre;

    TextView tvEquipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeMembreEquipe = new ArrayList<MembreEquipe>();

        Intent intent = getIntent();
        String id = intent.getStringExtra("nomE");

        if(id.equals("Avengers")){
            listeMembreEquipe.add(me1);
            listeMembreEquipe.add(me2);
            listeMembreEquipe.add(me3);
            listeMembreEquipe.add(me4);
            listeMembreEquipe.add(me5);
            listeMembreEquipe.add(me6);
            listeMembreEquipe.add(me7);
        }

        if(id.equals("JLA")){
            listeMembreEquipe.add(me8);
            listeMembreEquipe.add(me9);
            listeMembreEquipe.add(me10);
            listeMembreEquipe.add(me11);
            listeMembreEquipe.add(me12);
            listeMembreEquipe.add(me13);
            listeMembreEquipe.add(me14);
        }

        if(id.equals("X-Men")){
            listeMembreEquipe.add(me15);
            listeMembreEquipe.add(me16);
            listeMembreEquipe.add(me17);
            listeMembreEquipe.add(me18);
            listeMembreEquipe.add(me19);
        }

        if(id.equals("BTS-SIO2")){
            listeMembreEquipe.add(me20);
            listeMembreEquipe.add(me21);
        }


        lvListeMembre = (ListView) findViewById(R.id.ListView1);

        lvListeMembre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        ListeAdapter2 listeAdapter2 = new ListeAdapter2(this, listeMembreEquipe);
        lvListeMembre.setAdapter(listeAdapter2);
    }

}