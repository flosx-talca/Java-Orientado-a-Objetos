package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


// https://unpocodejava.com/2013/01/02/un-poco-de-patrones-de-diseno-gof-gang-of-four/ leer
public class PrincipalConBusqueda{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicual: ");
        var busqueda = lectura.nextLine();
        String direccion = "https://www.omdbapi.com/?apikey=5e5aa900&t=" + busqueda;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); // esta funcion es para respetrar las variables en minusculas, peor que el json trae las claves en mayus
        //Titulo miTitulo =  gson.fromJson(json, Titulo.class);
        TituloOmdb miTituloOmdb =  gson.fromJson(json, TituloOmdb.class); //usando el recor TiruloOmdb, un recor es parecido a una clase pero mas simple
        System.out.println(miTituloOmdb);
        Titulo  miTitulo = new Titulo(miTituloOmdb);
        System.out.println(miTitulo);


    }

}
