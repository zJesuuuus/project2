import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = input.nextInt();
        boolean mayor1 = (num1 > num2) && (num1 < num3);
        if (mayor1 == true) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número no cumple la condicion.");
        } 
    }
}