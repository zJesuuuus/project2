import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 10 notas de alumnos: ");
        int mayores = 0;
        int menores = 0;
        for (int cantidadNotas = 1; cantidadNotas < 11; cantidadNotas++){
            System.out.println("Ingrese la nota " + cantidadNotas + ":");
            int nota = input.nextInt();
            if (nota >= 7) {
                mayores ++;
            }else{
                menores ++;
            }
        }
        System.out.println("Total de alumnos con notas mayores: " + mayores);
        System.out.println("Total de alumnos con notas menores: " + menores);
        input.close();
    }
}
