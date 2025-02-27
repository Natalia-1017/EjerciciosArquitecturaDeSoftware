package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectorTransacciones = new Scanner(System.in);
        double saldoDisponible = 50000;
        int opcionSeleccionada;

        do {
            System.out.println(" Bienvenido a Banco Futuro ");
            System.out.println("1. Verificar saldo");
            System.out.println("2. Depositar fondos");
            System.out.println("3. Extraer fondos");
            System.out.println("4. Finalizar");
            System.out.print("Elija una operación: ");
            opcionSeleccionada = lectorTransacciones.nextInt();

            saldoDisponible = switch (opcionSeleccionada) {
                case 1 -> {
                    System.out.println("Saldo actual: $" + saldoDisponible);
                    yield saldoDisponible;
                }
                case 2 -> {
                    System.out.print("Ingrese el monto a depositar: $");
                    double montoDepositar = lectorTransacciones.nextDouble();
                    if (montoDepositar > 0) {
                        saldoDisponible += montoDepositar;
                        System.out.println("Depósito realizado con éxito. Saldo actual: $" + saldoDisponible);
                    } else {
                        System.out.println("Monto no válido.");
                    }
                    yield saldoDisponible;
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a retirar: $");
                    double montoRetirar = lectorTransacciones.nextDouble();
                    if (montoRetirar > 0 && montoRetirar <= saldoDisponible) {
                        saldoDisponible -= montoRetirar;
                        System.out.println("Retiro realizado con éxito. Saldo actual: $" + saldoDisponible);
                    } else {
                        System.out.println("Fondos insuficientes o monto no válido.");
                    }
                    yield saldoDisponible;
                }
                case 4 -> {
                    System.out.println("Transacción finalizada. Retire su tarjeta. ¡Hasta pronto!");
                    yield saldoDisponible;
                }
                default -> {
                    System.out.println("Opción no válida, intente de nuevo.");
                    yield saldoDisponible;
                }
            };
        } while (opcionSeleccionada != 4);

        lectorTransacciones.close();
    }
}


