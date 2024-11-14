import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        CtaCte ctaCte = new CtaCte();
         int verdad=0;
        int  opcion = 0;
        int clave=1;
        int monto =0;//System.out.println("Hello world!");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese clave: ");

        try {
            clave = Integer.parseInt(teclado.nextLine());
            if (ctaCte.validaClave(clave)){
                System.out.println("valida");

            }
            else
                System.out.println("Clave invalida");
        } catch (NumberFormatException e) {
            System.out.println("Clave invalida" + e.getMessage());
        }





       // verdad = ctaCte.transaccion(1000000);
        System.out.println(verdad);


        while (opcion != 8 && ctaCte.validaClave(clave) ) {
            menu.opciones();
            System.out.println("Ingrese transaccion  a realizar");
            opcion = Integer.parseInt(teclado.nextLine());
           // menu.generaMenu();
            try {
                System.out.println(opcion);
                switch (opcion) {
                    case 1:
                        verdad = ctaCte.transaccion(10000);
                        break;

                    case 2:
                        verdad = ctaCte.transaccion(20000);
                        break;
                    case 3:
                        verdad = ctaCte.transaccion(30000);
                        break;
                    case 4:
                        verdad = ctaCte.transaccion(40000);
                        break;
                    case 5:
                        verdad = ctaCte.transaccion(50000);
                        break;
                    case 6:
                        verdad = ctaCte.transaccion(100000);
                        break;
                    case 7:

                            System.out.print("Ingrese monto a retirar: ");
                        try {
                            monto = Integer.parseInt(teclado.nextLine());
                            verdad = ctaCte.transaccion(monto);
                            if (verdad!=1){
                                System.out.println("Monto incorrecto y/o mayor a saldo ");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Monto incorrecto: " + e.getMessage());
                        }
                        //monto = Integer.parseInt(teclado.nextLine());
                        break;
                    default:

                        System.out.println("La opcion ingresada no es correcta...");
                }
                if (verdad==1){
                    System.out.println("Transaccion Realizada con exito");
                    System.out.println("Saldo cuenta: "+ ctaCte.getSaldo());
                    //menu.LimpiarConsola();

                }
                   // menu.opciones();
                    //System.out.print("Ingrese opcion: ");
                    //1opcion = Integer.parseInt(teclado.nextLine());


            } catch (NumberFormatException e) {
                System.out.println("Monto incorrecto y/o mayor a saldo " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
         }
        System.out.println("Adios");
    }
}