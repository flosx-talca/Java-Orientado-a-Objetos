import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double  mediaEvaluaciones=0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite una nota para matrix" + (i + 1) + ": ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        mediaEvaluaciones = mediaEvaluaciones / 3;
        System.out.println("La media de evaluaciones para matrix es : " + mediaEvaluaciones);
    }
}
