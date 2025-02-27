package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> opcionesDelicias = Arrays.asList(
                "Chispas de Kale",
                "Explosión de Palomitas",
                "Barras Épicas de Quinoa y Frutos Rojos",
                "Rodajas de Batata y Zanahoria",
                "Mezcla Mística de Frutos y Semillas",
                "Elixir de Coco",
                "Brebaje de Té Verde con Menta",
                "Súper Smoothie de Mango y Maracuyá",
                "Néctar de Hibisco y Limón",
                "Limonada Encantada de Pepino y Albahaca"
        );

        List<Double> preciosDelicias = Arrays.asList(
                3000.0,
                4500.0,
                5000.0,
                1800.0,
                3800.0,
                2500.0,
                4500.0,
                6500.0,
                7000.0,
                2000.0
        );

        Scanner portalDePago = new Scanner(System.in);
        double cuentaFinal = 0;
        int cantidadDelicias = 0;
        List<String> listaDeliciasElegidas = new ArrayList<>();

        System.out.println("\n¡Bienvenid@ a Dulce encuentro, donde tus antojos se vuelven realidad!\n");
        while (true) {
            System.out.println("Snacks y bebidas deliciosas disponibles:");

            for (int i = 0; i < opcionesDelicias.size(); i++) {
                System.out.printf("%d. %-40s $%.2f\n", (i + 1), opcionesDelicias.get(i), preciosDelicias.get(i));
            }

            System.out.print("Selecciona tus bebidas o snaks(1-10) o 0 para finalizar: ");
            int eleccion = portalDePago.nextInt();

            if (eleccion == 0) break;

            if (eleccion >= 1 && eleccion <= 10) {
                cuentaFinal += preciosDelicias.get(eleccion - 1);
                listaDeliciasElegidas.add(opcionesDelicias.get(eleccion - 1));
                cantidadDelicias++;
                System.out.printf("Snack o bebida agregada: %s - Total: $%.2f\n", opcionesDelicias.get(eleccion - 1), cuentaFinal);
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }

            if (cantidadDelicias >= 5) {
                System.out.println("Has alcanzado el límite de bebidas y snacks permitidas.");
                break;
            }
        }

        System.out.printf("Total a pagar: $%.2f\n", cuentaFinal);
        System.out.print("Ingresa el monto del dinero con el que cuentas para realizar la compra: ");
        double tesoroIngresado = portalDePago.nextDouble();

        if (tesoroIngresado >= cuentaFinal) {
            double cambio = tesoroIngresado - cuentaFinal;
            System.out.printf("Compra realizada con éxito. Tu cambio es: $%.2f\n", cambio);
            System.out.println("Snacks y bebidas elegidas:");
            for (String delicia : listaDeliciasElegidas) {
                System.out.println("- " + delicia);
            }
            String[] agradecimientos = {"¡Gracias por tu compra!", "¡Esperamos verte nuevamente!", "¡Que disfrutes tus bebidas y snacks!"};
            System.out.println(agradecimientos[new Random().nextInt(agradecimientos.length)]);
        } else {
            System.out.println("Fondos insuficientes. Compra cancelada, regresa cuando cuentes con el dinero necesario.");
        }

        System.out.println("Para salir, presiona cualquier tecla de nuestra máquina expendedora...");
        portalDePago.nextLine();
        portalDePago.nextLine();
        portalDePago.close();
    }
}
