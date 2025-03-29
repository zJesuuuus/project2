package PrimerCiclo;
import java.util.Scanner;

public class Mayor3Nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = input.nextInt();

        boolean mayor1 = (num1 > num2) && (num1 > num3);
        boolean mayor2 = (num2 > num1) && (num2 > num3);

        if (mayor1) {
            System.out.println("El número mayor es el: " + num1);
        }else if (mayor2) {
            System.out.println("El número mayor es el: " + num2);
        }else {
            System.out.println("El número mayor es el: " + num3);
        }
    }
}
