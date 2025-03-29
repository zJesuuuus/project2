package PrimerCiclo;
import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        byte num1 = input.nextByte();
        System.out.println("Ingrese el segundo numero: ");
        byte num2 = input.nextByte();
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
            input.close();
            return;
        }else if (num1 < num2) {
            System.out.println("El numero mayor es: " + num2);
            input.close();
            return;
        }else{
            System.out.println("Los numeros son iguales");
            input.close();
            return;
        }
    }
}
