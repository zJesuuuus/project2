import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero positivo de 1 o 2 digitos (1-99)");
        byte num = input.nextByte();
        if (num >= 0 && num <= 9) {
            System.out.println("El numero ingresado es de 1 digito.");
            input.close();
            return;
        }else if (num > 9 && num <= 99) {
            System.out.println("El numero ingresado es de 2 digitos.");
            input.close();
            return;
        }else{
            System.out.println("Ingrese un numero entero positivo.");
            input.close();
            return;
        }
    }
}
