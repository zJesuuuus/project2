import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        float nota1 = input.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        float nota2 = input.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        float nota3 = input.nextFloat();
        
        float promedioTotal = (nota1 + nota2 + nota3) / 3;

        if (promedioTotal >= 7) {
            System.out.println("Promocionado.");
            input.close();
            return;
        }else {
            System.out.println("No alcanzaste el promedio minimo.");
            input.close();
            return;
        }
    }
}
