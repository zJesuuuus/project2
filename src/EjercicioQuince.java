import java.util.Scanner;

public class EjercicioQuince {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar los dos nombres
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = input.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = input.nextLine();

        // Comparar los nombres usando compareToIgnoreCase()
        int comparacion = nombre1.compareToIgnoreCase(nombre2);

        // Mostrar los nombres ordenados alfabéticamente
        if (comparacion < 0) {
            System.out.println("Nombres ordenados alfabéticamente:");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (comparacion > 0) {
            System.out.println("Nombres ordenados alfabéticamente:");
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Los nombres son iguales.");
        }

        input.close();
    }
}