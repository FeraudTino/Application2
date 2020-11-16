package com.example.application2;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ListeAdapter2 extends ArrayAdapter<MembreEquipe> {
    Context context;

    public ListeAdapter2(Context context, List<MembreEquipe> listeMembreEquipe){
        super(context, -1, listeMembreEquipe);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        MembreEquipe unMembreEquipe;
        view = null;

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.ligne, parent, false);
        } else{
            view = convertView;
        }

        unMembreEquipe = getItem(position);
        TextView tvTitre1 = (TextView)view.findViewById(R.id.Titre1);
        TextView tvTitre2 = (TextView)view.findViewById(R.id.Titre2);
        ImageView imageView = (ImageView)view.findViewById(R.id.img1);

        tvTitre1.setText(unMembreEquipe.getNomE());
        tvTitre2.setText(unMembreEquipe.getDescE());

        AssetManager manager = context.getAssets();

        InputStream open = null;

        try {
            open = manager.open(unMembreEquipe.getImgE());
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }
}
