package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    //constructor (para no pasar la variable con los setetr setnombre en este caso)
    // constructor heredado de la super clase Titulo

      public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento); // hace referencia al constructor de la super clase Titulo con 2 parametro
    }

    public String getDirector() {

        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    // metodo para usar con INTERFACE  Clasificacion en la calse "FiltroRecomendacion"
    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() /2);
    }

    // sobre escribeindo la clase toString
    @Override
    public String toString() {
        return "Pelicula: "+this.getNombre()+"("+getFechaDeLanzamiento()+")";
    }
}