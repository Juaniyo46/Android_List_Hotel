package com.example.alumno_fp.ejerciciolistasclase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class HotelsAdapter extends ArrayAdapter<Hotels> {


    public HotelsAdapter(Context context, List<Hotels> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.activity_main,
                    parent,
                    false);
        }

        ImageView image = convertView.findViewById(R.id.hotel_image);
        TextView name = convertView.findViewById(R.id.hotel_name);
        TextView star = convertView.findViewById(R.id.hotel_star);
        TextView localidad = convertView.findViewById(R.id.hotel_localidad);
        TextView provincia = convertView.findViewById(R.id.hotel_provincia);

        Hotels item = getItem(position);

        Glide.with(getContext()).load(item.gethImagen()).into(image);
        name.setText(item.gethNombre());
        star.setText(item.gethEstrellas());
        localidad.setText(item.gethLocalidad());
        provincia.setText(item.gethProvincia());

        return convertView;
    }



}
