package PrimerCiclo;
public class Banco {
    public static void main(String[] args) {
        int dineroInicial = 1000;
        int dineroRetiro = 200;
        int count = 0;
        System.out.println("Saldo Inicial: " + dineroInicial);
        System.out.println("Numero de retiros: " + count);
        System.out.println("Has retirado: " + dineroRetiro);
        int dineroSemna1 = dineroInicial - dineroRetiro;
        count += 1;
        System.out.println("Saldo Restante: " + dineroSemna1);
        System.out.println("Numero de retiros: " + count);
        System.out.println("Has retirado: " + dineroRetiro);
        int dineroSemna2 = dineroSemna1 - dineroRetiro;
        count += 1;
        System.out.println("Saldo Restante: " + dineroSemna2);
        System.out.println("Numero de retiros: " + count);
        System.out.println("Has retirado: " + dineroRetiro);
        int dineroSemna3 = dineroSemna2 - dineroRetiro;
        count += 1;
        System.out.println("Saldo Restante: " + dineroSemna3);
        System.out.println("Numero de retiros: " + count);
        System.out.println("Has retirado: " + dineroRetiro);
        int dineroSemna4 = dineroSemna3 - dineroRetiro;
        count += 1;
        System.out.println("Numero de retiros: " + count);
        System.out.println("Ya es final de mes, tu saldo restante es: " + dineroSemna4);
    }
}