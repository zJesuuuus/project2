package SegundoCiclo;

import java.util.Scanner;

public class TresEnRaya {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';
    private static boolean juegoTerminado = false;

    public static void main(String[] args) {
        inicializarTablero();
        imprimirTablero();
        
        Scanner scanner = new Scanner(System.in);
        
        while (!juegoTerminado) {
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingresa fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa columna (0-2): ");
            int columna = scanner.nextInt();
            
            if (movimientoValido(fila, columna)) {
                hacerMovimiento(fila, columna);
                imprimirTablero();
                verificarGanador();
                cambiarJugador();
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }
        
        scanner.close();
    }
    
    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    
    private static void imprimirTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static boolean movimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 3 && 
               columna >= 0 && columna < 3 && 
               tablero[fila][columna] == '-';
    }
    
    private static void hacerMovimiento(int fila, int columna) {
        tablero[fila][columna] = jugadorActual;
    }
    
    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }
    
    private static void verificarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && 
                tablero[i][0] == tablero[i][1] && 
                tablero[i][1] == tablero[i][2]) {
                anunciarGanador(tablero[i][0]);
                return;
            }
        }
        
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] != '-' && 
                tablero[0][j] == tablero[1][j] && 
                tablero[1][j] == tablero[2][j]) {
                anunciarGanador(tablero[0][j]);
                return;
            }
        }
        
        // Verificar diagonales
        if (tablero[0][0] != '-' && 
            tablero[0][0] == tablero[1][1] && 
            tablero[1][1] == tablero[2][2]) {
            anunciarGanador(tablero[0][0]);
            return;
        }
        
        if (tablero[0][2] != '-' && 
            tablero[0][2] == tablero[1][1] && 
            tablero[1][1] == tablero[2][0]) {
            anunciarGanador(tablero[0][2]);
            return;
        }
        
        // Verificar empate
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    empate = false;
                    break;
                }
            }
        }
        
        if (empate) {
            juegoTerminado = true;
            System.out.println("¡El juego terminó en empate!");
        }
    }
    
    private static void anunciarGanador(char jugador) {
        juegoTerminado = true;
        System.out.println("¡El jugador " + jugador + " ha ganado!");
    }
}