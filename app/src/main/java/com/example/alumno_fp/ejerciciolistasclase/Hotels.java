package com.example.alumno_fp.ejerciciolistasclase;

public class Hotels {

    private String hNombre;
    private String hLocalidad;
    private String hProvincia;
    private String hPais;
    private int hEstrellas;
    private int hImagen;

    public Hotels(String hNombre, String hLocalidad, String hProvincia, String hPais, int hEstrellas, int hImagen) {
        this.hNombre = hNombre;
        this.hLocalidad = hLocalidad;
        this.hProvincia = hProvincia;
        this.hPais = hPais;
        this.hEstrellas = hEstrellas;
        this.hImagen = hImagen;
    }

    public String gethNombre() {
        return hNombre;
    }

    public void sethNombre(String hNombre) {
        this.hNombre = hNombre;
    }

    public String gethLocalidad() {
        return hLocalidad;
    }

    public void sethLocalidad(String hLocalidad) {
        this.hLocalidad = hLocalidad;
    }

    public String gethProvincia() {
        return hProvincia;
    }

    public void sethProvincia(String hProvincia) {
        this.hProvincia = hProvincia;
    }

    public String gethPais() {
        return hPais;
    }

    public void sethPais(String hPais) {
        this.hPais = hPais;
    }

    public int gethEstrellas() {
        return hEstrellas;
    }

    public void sethEstrellas(int hEstrellas) {
        this.hEstrellas = hEstrellas;
    }

    public int gethImagen() {
        return hImagen;
    }

    public void sethImagen(int hImagen) {
        this.hImagen = hImagen;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hNombre='" + hNombre + '\'' +
                ", hLocalidad='" + hLocalidad + '\'' +
                ", hProvincia='" + hProvincia + '\'' +
                ", hPais='" + hPais + '\'' +
                ", hEstrellas=" + hEstrellas +
                ", hImagen=" + hImagen +
                '}';
    }
}
