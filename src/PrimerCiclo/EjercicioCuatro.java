package PrimerCiclo;
import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el sueldo: ");
        float sueldo = input.nextFloat();
        
        if (sueldo > 3000) {
            System.out.println("Debes abonar impuestos.");
            input.close();
            return;
        }else{
            System.out.println("No debes abonar impuestos Crack.");
            input.close();
            return;
        }
    }
}
