import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ex02 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        Soma(A,B);
 
    }

    public static void Soma(int A, int B)
        {
            int soma = A + B;
            String resultado = "X = ";
            System.out.println(resultado + soma);
        }
 
}