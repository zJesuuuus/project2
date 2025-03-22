import java.util.Scanner;

public class EjercicoSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        byte num = input.nextByte();
        if (num > 0) {
            System.out.println("El numero es positivo.");
            input.close();
            return;
        }else if (num < 0) {
            System.out.println("El numero es negativo.");
            input.close();
            return;
        }else{
            System.out.println("El numero es nulo, es decir (0).");
            input.close();
            return;
        }
    }
}
