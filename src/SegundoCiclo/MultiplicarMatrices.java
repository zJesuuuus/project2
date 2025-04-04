package SegundoCiclo;

public class MultiplicarMatrices {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
        int[][] C = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        System.out.println("Resultado de la multiplicación de matrices: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
