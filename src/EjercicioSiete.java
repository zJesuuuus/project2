import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 a 3 cifras: ");
        int num = input.nextInt();
        if (num > 0 && num <= 9) {
            System.out.println("El numero tiene 1 cifra.");
            input.close();
            return;
        }else if (num > 10 && num <= 99) {
            System.out.println("El numero tiene 2 cifras.");
            input.close();
            return;
        }else {
            System.out.println("El numero tiene 3 cifras.");
            input.close();
            return;
        }
    }
}
