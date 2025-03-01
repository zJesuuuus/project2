import java.util.Scanner;

public class TiendaRopa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese cantidad de camisetas:");
        float camiseta = scan.nextInt();
        System.out.println("Ingrese cantidad de pantalones:");
        float pantalon = scan.nextInt();
        float precio1 = 25;
        float precio2 = 30;
        float descuento = 0.15f;
        double descuentoPant = precio2 * ( 1 - descuento);
        double descuentoCami = precio1 * ( 1 - descuento);
        double precioTotal = (descuentoPant + descuentoCami);
        System.out.println(precioTotal);
        System.out.println(descuentoPant * pantalon + descuentoCami + descuento);
        double descuentoAdicional = descuentoCami * ( 1 - 0.5);
        System.out.println("Descuento camiseta adicional: " + descuentoAdicional);
    }
}