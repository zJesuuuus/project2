package PrimerCiclo;
import java.util.Scanner;

public class MediaNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int num3 = input.nextInt();
        double total = (num1 + num2 + num3) / 3;
        System.out.println("La media de los 3 numeros: " + num1 + "," + num2 + "," + num3 + "," + " es de: " + total);

    }
}
