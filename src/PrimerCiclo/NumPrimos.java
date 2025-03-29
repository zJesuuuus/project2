package PrimerCiclo;
import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int inicio = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int fin = input.nextInt();

        if (inicio < 0 || fin < inicio) {
            System.out.println("Rango no valido.");
            input.close();
            return;
        }
        
        int contPrimos = 0;

        for (int i = inicio; i <= fin; i++) {

            if (i <= 1) {
                continue;
            }

            if (i == 2) {
                contPrimos += 1;
            }
            if (i % 2 == 1) {
                System.out.println(i);
                contPrimos += 1;
            }
        }
        System.out.println("Hay " + (int)(Math.floor(contPrimos/2)) + " pares de primos en total.");
    }
}