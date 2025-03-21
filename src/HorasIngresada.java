import java.util.Scanner;

public class HorasIngresada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la hora en formato HH:MM (24 hrs)");
        String formato = input.nextLine();
        input.close();

        if (formato.length() != 5 || formato.charAt(2) != ':') {
            System.out.println("Formato no valido.");
            return;
        }
        char h1 = formato.charAt(0); 
        char h2 = formato.charAt(1);
        char h3 = formato.charAt(3);
        char h4 = formato.charAt(4);

        //System.out.println(h1);
        //System.out.println(h2);
        //System.out.println(h3);
        //System.out.println(h4);

        int horas = ((h1 - '0')* 10 + (h2 - '0'));
        int minutos = ((h3 - '0')* 10 + (h4 - '0'));

        //System.out.println(horas + " " + minutos);

        if ((0 > horas || horas > 23) || (0 > minutos || minutos > 59)) {
            System.out.println("Formato invalido.");
        }

        if (minutos == 0) {
            System.out.println("Son las " + " en punto.");
        }

        int hora12 = (horas%12 == 0) ? 12:
        horas%12;
    }
}
