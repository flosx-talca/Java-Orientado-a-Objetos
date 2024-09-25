package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguirre");
        miPodcast.setTitulo("Cafe.TECH");
        //CANCION
        for (int i = 0; i < 100; i++) {

            miCancion.meGusta();

        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        // PODCAST
        for (int i = 0; i < 100; i++) {

            miPodcast.meGusta();

        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de  me gusta: " + miCancion.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);


    }
}
