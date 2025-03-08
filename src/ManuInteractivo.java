import java.util.Scanner;

public class ManuInteractivo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Elige una opcion:             ");
        System.out.println("1) Sumar                      ");
        System.out.println("2) Restar                     ");
        System.out.println("3) Multiplicar                ");
        System.out.println("4) Dividir                    ");
        System.out.println("------------------------------");
        int op = input.nextInt();
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                }else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}
