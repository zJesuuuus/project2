import java.util.Scanner;

public class MsgPerso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tú nombre: ");
        String name = input.nextLine();
        System.out.println("Ingresa tú edad: ");
        int age = input.nextInt();
        System.out.println("Ingresa tú altura en mts: ");
        double heigth = input.nextDouble();
        
        System.out.println("Hola, " + name + ". Tienes " + age + " años y mides: " + heigth + " mts. ");
    }
}
