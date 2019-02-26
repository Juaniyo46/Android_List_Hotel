package com.example.alumno_fp.ejerciciolistasclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView mList;
    ArrayAdapter<Hotels> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.hotel_list);

        mAdapter = new HotelsAdapter(this, HotelsRepository.getInstance().getHotels());

        mList.setAdapter(mAdapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Hotels currentHotels = mAdapter.getItem(position);
                Toast.makeText(mAdapter.getContext(), "Iniciar screen en detalle para: \n" + currentHotels.gethNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
