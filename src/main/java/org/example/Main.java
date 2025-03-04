package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] tiposDePokemon = {"Agua", "Fuego", "Planta", "Eléctrico"};
        double[][] matrizDeEfectividad = {
                {0.5, 2, 0.5, 1},
                {0.5, 0.5, 2, 1},
                {2, 0.5, 0.5, 1},
                {1, 1, 1, 0.5}
        };

        String tipoAtacante = pedirEntrada(entrada, "Tipo del Pokémon atacante (Agua, Fuego, Planta, Eléctrico): ");
        String tipoDefensor = pedirEntrada(entrada, "Tipo del Pokémon defensor (Agua, Fuego, Planta, Eléctrico): ");
        int ataqueDelPokemon = pedirValor(entrada, "Ataque del Pokémon (1-100): ");
        int defensaDelPokemon = pedirValor(entrada, "Defensa del Pokémon (1-100): ");

        int indiceDelAtacante = -1, indiceDelDefensor = -1;
        for (int i = 0; i < tiposDePokemon.length; i++) { /*.length se utiliza para obtener el tamaño de un array, es decir, la cantidad de elementos que contiene.
        Esto es especialmente útil cuando necesitas recorrer todos los elementos del array mediante un bucle.*/
            if (tiposDePokemon[i].equalsIgnoreCase(tipoAtacante)) indiceDelAtacante = i;
            if (tiposDePokemon[i].equalsIgnoreCase(tipoDefensor)) indiceDelDefensor = i;
        }
        /*La variable i en este contexto es un índice utilizado en el bucle for para iterar a través del array tiposDePokemon. Cada vez que el bucle se ejecuta, i toma el valor de
        la posición actual en el array, comenzando en 0 y aumentando hasta alcanzar tiposDePokemon.length - 1
        */

        double efectividad = matrizDeEfectividad[indiceDelAtacante][indiceDelDefensor];
        double dañoTotal = 50 * (ataqueDelPokemon / (double) defensaDelPokemon) * efectividad;
        System.out.println("El daño infligido es: " + dañoTotal);
    }

    private static String pedirEntrada(Scanner entrada, String mensaje) {
        System.out.println(mensaje);
        return entrada.next();
    }

    private static int pedirValor(Scanner entrada, String mensaje) {
        System.out.println(mensaje);
        return entrada.nextInt();
    }
}
