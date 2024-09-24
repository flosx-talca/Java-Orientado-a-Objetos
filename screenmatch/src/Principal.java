import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println("Total de evaluaciones: "+miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        System.out.printf("solo nombre "+miPelicula.getNombre());


    }
}