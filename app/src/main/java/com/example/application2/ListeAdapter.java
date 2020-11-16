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

public class ListeAdapter extends ArrayAdapter<Equipe> {
    Context context;

    public ListeAdapter(Context context, List<Equipe> listeEquipe){
        super(context, -1, listeEquipe);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        Equipe uneEquipe;
        view = null;

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.ligne, parent, false);
        } else{
            view = convertView;
        }

        uneEquipe = getItem(position);
        TextView tvTitre1 = (TextView)view.findViewById(R.id.Titre1);
        TextView tvTitre2 = (TextView)view.findViewById(R.id.Titre2);
        ImageView imageView = (ImageView)view.findViewById(R.id.img1);

        tvTitre1.setText(uneEquipe.getNomE());
        tvTitre2.setText(uneEquipe.getDescE());

        AssetManager manager = context.getAssets();

        InputStream open = null;

        try {
            open = manager.open(uneEquipe.getImgE());
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }
}
