import java.util.Scanner;

public class TablasMultiplicarFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la tabla que quiere ver: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num *i));
        }
    }
}
