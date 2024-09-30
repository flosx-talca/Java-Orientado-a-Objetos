package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Otra", 2020);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2021);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);
        //lista.forEach(item -> System.out.println(item));
        //lista.forEach(System.out::println); // forma reducida
        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){ //CASTEO CONDICIONAL SOLO SI item es de tipo pelicula
                //Pelicula pelicula = (Pelicula) item; "CASTEO"
                System.out.println(pelicula.getClasificacion());
            }


        }
        List<String> listaDeArtistas = new LinkedList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Pedro Pascal");
        System.out.println("Lista de artista no  ordenada" + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artista  ordenada" + listaDeArtistas);
        listaDeArtistas.sort(Comparator.reverseOrder());
        System.out.println(listaDeArtistas);
        Collections.sort(lista);
        System.out.println("Array list ordenado con implements en clase Titulo: "+ lista);
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha"+lista);


    }
}
