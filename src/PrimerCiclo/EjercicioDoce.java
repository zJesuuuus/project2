package PrimerCiclo;
import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");

        int cantidadEmpleados = input.nextInt();
        int cantidadMedia = 0;
        int cantidadMayor = 0;
        int sumadorTotal = 0;

        for (int i = 0; i < cantidadEmpleados; i++){
            System.out.println("Ingrese el sueldo del empleado: ");
            int sueldoEmpleado = input.nextInt();

            if (sueldoEmpleado >= 100 && sueldoEmpleado <= 300) {
                cantidadMedia ++;
            }else if (sueldoEmpleado > 300) {
                cantidadMayor ++;
            }

            sumadorTotal += sueldoEmpleado;
        }
        System.out.println(cantidadMedia + " cobran entre $100 y $300.");
        System.out.println(cantidadMayor + " cobran mas de $300.");
        System.out.println("Importe total de gastos en empleados: " + sumadorTotal);
        input.close();
    }
}
