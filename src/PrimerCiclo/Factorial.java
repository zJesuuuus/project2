package PrimerCiclo;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}