package org.example;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner escanerEntrada = new Scanner(System.in);
        int opcionSeleccionadaDelUsuario;

        do {
            System.out.println("\nBienvenid@ al Convertidor de temperaturas");
            System.out.println("Seleccione la conversión que desea realizar:");
            System.out.println("1. Rankine a Kelvin");
            System.out.println("2. Rankine a Celsius");
            System.out.println("3. Celsius a Rankine");
            System.out.println("4. Celsius a Réaumur");
            System.out.println("5. Kelvin a Rankine");
            System.out.println("6. Fahrenheit a Réaumur");
            System.out.println("7. Réaumur a Fahrenheit");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción (1-8): ");
            opcionSeleccionadaDelUsuario = escanerEntrada.nextInt();

            switch (opcionSeleccionadaDelUsuario) {
                case 1 -> {
                    System.out.print("Ingresa la temperatura en Rankine: ");
                    double tempRankine = escanerEntrada.nextDouble();
                    double rankineAKelvin = tempRankine * 5 / 9;
                    System.out.println("Rankine a Kelvin: " + rankineAKelvin);
                }
                case 2 -> {
                    System.out.print("Ingresa la temperatura en Rankine: ");
                    double tempRankine = escanerEntrada.nextDouble();
                    double rankineACelsius = (tempRankine - 491.67) * 5 / 9;
                    System.out.println("Rankine a Celsius: " + rankineACelsius);
                }
                case 3 -> {
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    float tempCelsius = escanerEntrada.nextFloat();
                    double celsiusARankine = (tempCelsius * 9 / 5) + 491.67;
                    System.out.println("Celsius a Rankine: " + celsiusARankine);
                }
                case 4 -> {
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    float tempCelsius = escanerEntrada.nextFloat();
                    double celsiusAReaumur = tempCelsius * 4 / 5;
                    System.out.println("Celsius a Réaumur: " + celsiusAReaumur);
                }
                case 5 -> {
                    System.out.print("Ingresa la temperatura en Kelvin: ");
                    double tempKelvin = escanerEntrada.nextDouble();
                    double kelvinARankine = tempKelvin * 9 / 5;
                    System.out.println("Kelvin a Rankine: " + kelvinARankine);
                }
                case 6 -> {
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    short tempFahrenheit = escanerEntrada.nextShort();
                    double fahrenheitAReaumur = (tempFahrenheit - 32) * 4 / 9;
                    System.out.println("Fahrenheit a Réaumur: " + fahrenheitAReaumur);
                }
                case 7 -> {
                    System.out.print("Ingresa la temperatura en Réaumur: ");
                    int tempReaumur = escanerEntrada.nextInt();
                    double reaumurAFahrenheit = (tempReaumur * 9 / 4) + 32;
                    System.out.println("Réaumur a Fahrenheit: " + reaumurAFahrenheit);
                }
                case 8 -> System.out.println("Gracias por usar el Convertidor de temperaturas. ¡Hasta luego, esperamos haya sido de gran ayuda para ti!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionSeleccionadaDelUsuario != 8);

        escanerEntrada.close();
    }
}
