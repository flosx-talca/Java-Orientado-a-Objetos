import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0.0;
        double totalEvaluaciones = 0.0;

        while (nota != -1){
            System.out.println("Digite una nota para matrix: ");
            nota = teclado.nextDouble();
            if (nota > 0){
                mediaEvaluaciones += nota; //mediaEvaluaciones = mediaEvaluaciones + nota;
                totalEvaluaciones++;
            }
        }
        mediaEvaluaciones = mediaEvaluaciones / totalEvaluaciones;
        System.out.println("La media de evaluaciones para matrix es : " + mediaEvaluaciones);
    }
}
