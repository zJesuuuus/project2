import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de preguntas: ");
        float cantidadPreguntas = input.nextFloat();
        System.out.println("Ingrese la cantidad de respuestas correctas: ");
        float cantidadRespuestas = input.nextFloat();
        double porcentaje = (cantidadRespuestas * 100.0) / cantidadPreguntas;

        String nivel;
        if (porcentaje >= 90) {
            nivel = "Superior.";
            input.close();
            return;
        }else if (porcentaje >= 75) {
            nivel = "Medio.";
            input.close();
            return;
        }else if (porcentaje >= 50) {
            nivel = "Regular.";
            input.close();
            return;
        }else{
            nivel = "Fuera de nivel.";
            input.close();
        }
        System.out.println("El porcentaje de respuestas correctas es de: " + porcentaje);
        System.out.println("Nivel de postulante: " + nivel);
    }
}