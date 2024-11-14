import java.io.IOException;

public class Menu {

    public void opciones(){
        String menu = "******************************************\n"
                + "Cajero automatico orozas's bank\n"
                + "1) 10.000\t\t\t2) 20.000\n"
                + "3) 30.000\t\t\t4) 40.000\n"
                + "5) 50.000\t\t\t6) 100.000\n"
                + "7) Otro monto\n"
                + "8) Salir\n"

                + "*******************************************\n";
        System.out.println(menu);
    }
    public void LimpiarConsola(){

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }


}


