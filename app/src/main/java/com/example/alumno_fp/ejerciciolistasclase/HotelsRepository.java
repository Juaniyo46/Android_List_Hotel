package com.example.alumno_fp.ejerciciolistasclase;

import java.util.ArrayList;
import java.util.List;

public class HotelsRepository {

    private static HotelsRepository repository = new HotelsRepository();
    private List<Hotels> listaHoteles = new ArrayList<>();

    public static HotelsRepository getInstance() {return repository;}

    private HotelsRepository() {
        listaHoteles.add(new Hotels("Marinamar","Mojacar", "Almería", "España",4, R.drawable.marinamar));
        listaHoteles.add(new Hotels("Angela", "Fuengirola", "Málaga", "España",4,R.drawable.angelafuengirola));
        listaHoteles.add(new Hotels("Vilamoura Garden", "Algarve", "Portugarl", "España",4,R.drawable.vilamouragardealgarve));
        listaHoteles.add(new Hotels("Vincci La Rabida", "Sevilla", "Sevilla", "España",4,R.drawable.vinccilarabidasevilla));
    }

    public List<Hotels> getHotels() {
        return listaHoteles;
    }

}
