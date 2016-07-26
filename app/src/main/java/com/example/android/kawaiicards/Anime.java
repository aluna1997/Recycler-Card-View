package com.example.android.kawaiicards;

/**
 * Created by felipe on 21/07/16.
 */
public class Anime {
    private int imagen;
    private String nombre;
    private int visitas;

    public Anime(int imagen, String nombre, int visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "imagen=" + imagen +
                ", nombre='" + nombre + '\'' +
                ", visitas=" + visitas +
                '}';
    }




}
