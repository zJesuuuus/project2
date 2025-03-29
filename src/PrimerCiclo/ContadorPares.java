package PrimerCiclo;
public class ContadorPares {
    public static void main(String[] args) {
        int contador = 0;
        for (int i =0; i < 100; i++){
            int div = (i % 2);
            if (div == 0) {
                contador++;
            }
        }
        System.out.println("La cantidad de números pares del 1 - 100 son: " + contador);
    }
}
