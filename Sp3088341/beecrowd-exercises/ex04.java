import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ex04 {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();

        double soma = (A * 3.5) + (B * 7.5);
        double media = soma / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }

}