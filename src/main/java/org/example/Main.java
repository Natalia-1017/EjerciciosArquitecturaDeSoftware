package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generadorNumerosAleatorios = new Random();
        int puntajeSol = 0, puntajeLuna = 0;
        String[] opciones = {"Piedra", "Papel", "Tijera"};

        while (puntajeSol < 2 && puntajeLuna < 2) {
            int eleccionSol = generadorNumerosAleatorios.nextInt(3) + 1;
            int eleccionLuna = generadorNumerosAleatorios.nextInt(3) + 1;

            System.out.println("Sol: " + opciones[eleccionSol - 1]);
            System.out.println("Luna: " + opciones[eleccionLuna - 1]);

            if (eleccionSol != eleccionLuna) {
                if ((eleccionSol == 1 && eleccionLuna == 3) ||  // Piedra aplasta a Tijera
                        (eleccionSol == 2 && eleccionLuna == 1) ||  // Papel envuelve a Piedra
                        (eleccionSol == 3 && eleccionLuna == 2)) {  // Tijera corta a Papel
                    System.out.println("¡Sol gana esta ronda!");
                    puntajeSol++;
                } else {
                    System.out.println("¡Luna gana esta ronda!");
                    puntajeLuna++;
                }
            } else {
                System.out.println("¡Empate!");
            }

            System.out.println("Marcador - Sol: " + puntajeSol + " | Luna: " + puntajeLuna);
        }

        System.out.println((puntajeSol == 2) ? "¡Sol gana el juego!" : "¡Luna gana el juego!");
    }
}
