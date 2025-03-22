import java.util.Scanner;

public class EjercicioCatorce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 5; i <= 50; i++){
            System.out.println("5" + " x " + i + " = " +(5*i));
        }
        input.close();
    }
}
