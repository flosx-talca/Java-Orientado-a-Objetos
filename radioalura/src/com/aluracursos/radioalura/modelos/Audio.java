package com.aluracursos.radioalura.modelos;

public class Audio {
     private String titulo;
     private  int totalDeReproducciones;
     private  int totalMeGusta;
     private int clasificacion;

     public void meGusta(){
         this.totalMeGusta++;
     }

     public void reproduce(){
         this.totalDeReproducciones++;
     }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}