package PrimerCiclo;
import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese sueldo: ");
        float sueldo = input.nextFloat();
        System.out.println("Ingrese años de antiguedad: ");
        float añosAntiguedad = input.nextFloat();
        
        
        if (sueldo < 500 && añosAntiguedad >= 10) {
            double sueldoTotal = (sueldo * 0.20 + sueldo);
            int total = (int) sueldoTotal;
            System.out.println(total);
            input.close();
            return;
        }else if (sueldo < 500 && añosAntiguedad < 10) {
            double sueldoTotal = (sueldo * 0.05 + sueldo);
            int total = (int) sueldoTotal;
            System.out.println(total);
            input.close();
            return;
        }else if (sueldo >= 500 ) {
            System.out.println(sueldo);
            input.close();
            return;
        }
        input.close();
    }
}
