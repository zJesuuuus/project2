import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        byte num1 = input.nextByte();
        System.out.println("Ingrese el segundo número: ");
        byte num2 = input.nextByte();
        if (num1 > num2) {
            System.out.println("La suma de los 2 numeros es: " + (num1 + num2) + " la diferencia es: " + (num1 - num2));
            input.close();
            return;
        } else {
            System.out.println("El producto es: " + (num1 * num2 ) + " la division es: " + (num1 / num2));
            input.close();
            return;
        }
    }
}
