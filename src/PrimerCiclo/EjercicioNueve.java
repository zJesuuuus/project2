package PrimerCiclo;
import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su primera nota: ");
        float nota1 = input.nextFloat();
        System.out.println("Ingrese su segunda nota: ");
        float nota2 = input.nextFloat();
        System.out.println("Ingrese su tercera nota: ");
        float nota3 = input.nextFloat();

        float promedioTotal = (nota1 + nota2 + nota3) / 3;

        if (promedioTotal >= 7) {
            System.out.println("Promocionado.");
            input.close();
            return;
        }else if (promedioTotal >= 4) {
            System.out.println("Regular.");
            input.close();
            return;
        }else {
            System.out.println("Reprovado.");
            input.close();
            return;
        }
    }
}
