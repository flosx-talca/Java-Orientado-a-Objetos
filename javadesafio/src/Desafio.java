import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre="Tony Stark";
        String tipoDeCuenta="Cuenta corriente";
        double saldo = 1599.99;
        int opcion = 0;
        double valorARetirar=0;
        double valorADepositar=0;
        System.out.println("********************************");
        System.out.println("\nNombre: "+nombre);
        System.out.println("Tipo de Cuenta: "+tipoDeCuenta);
        System.out.println("Saldo disponible es: $"+saldo);
        System.out.println("\n********************************");
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu= """
                 *** Escriba la opcion deseada ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
            System.out.println(menu);
            System.out.print("Escriba la opcion: ");
            opcion = teclado.nextInt();
            switch(opcion){
                    case 1:
                        System.out.println("Saldo es: "+saldo);
                    break;
                    case 2:

                        System.out.println("Cual es el valor que desea retirar");
                        valorARetirar = teclado.nextDouble();
                        if(saldo<valorARetirar){
                            System.out.println("Saldo insuficiente");
                        }
                        else{
                            saldo-=valorARetirar;
                            System.out.println("El saldo actualizado es: "+saldo);
                        }
                        break;
                    case 3:
                        System.out.println("Cual es el valor que desea depositar");
                        valorADepositar = teclado.nextDouble();
                        saldo+=valorADepositar;
                        System.out.println("El saldo actualizado es: "+saldo);
                        break;
                    case 9:
                        break;


            }


        }
    }

}
