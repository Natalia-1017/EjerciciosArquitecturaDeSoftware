package org.example;

   import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double saldo = 50000;
            int opcionUsuario;

            do {
                System.out.println(" Cajero Automático ");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Ingresar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcionUsuario = scanner.nextInt();

                saldo = switch (opcionUsuario) {
                    case 1 -> {
                        System.out.println("Saldo actual: $" + saldo);
                        yield saldo;
                    }
                    case 2 -> {
                        System.out.print("Ingrese la cantidad a depositar: $");
                        double ingreso = scanner.nextDouble();
                        if (ingreso > 0) {
                            saldo += ingreso;
                            System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
                        } else {
                            System.out.println("Monto inválido.");
                        }
                        yield saldo;
                    }
                    case 3 -> {
                        System.out.print("Ingrese la cantidad a retirar: $");
                        double retiro = scanner.nextDouble();
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
                        } else {
                            System.out.println("Fondos insuficientes o monto inválido.");
                        }
                        yield saldo;
                    }
                    case 4 -> {
                        System.out.println("Tu operación ha sido realizada con éxito, recuerda retirar tu tarjeta! hasta pronto.");
                        yield saldo;
                    }
                    default -> {
                        System.out.println("Opción inválida, intente de nuevo.");
                        yield saldo;
                    }
                };
            } while (opcionUsuario != 4);

            scanner.close();
        }
    }

