import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ex05 {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner s = new Scanner(System.in);

        int number = s.nextInt();
        int horas = s.nextInt();
        double valor = s.nextDouble();
        String frase = "NUMBER = ";

        double soma = valor * horas;

        System.out.println(frase + number);
        System.out.printf("SALARY = U$ %.2f\n", soma);
    }

}
