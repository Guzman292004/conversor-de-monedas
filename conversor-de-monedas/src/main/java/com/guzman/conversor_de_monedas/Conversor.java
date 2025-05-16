package com.guzman.conversor_de_monedas;

import java.util.Scanner;

public class Conversor {

    public static void exibirMenu() {
        System.out.println("""
                *******************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Dólar =>> Peso mexicano
                8) Peso mexicano =>> Dólar
                9) Salir

                Elija una opción válida:
                *******************************************
                """);
    }

    public static void convertir(String de, String a, ExchangeRateService service, Scanner scanner) {
        System.out.print("Ingrese el monto a convertir: ");
        double cantidad = scanner.nextDouble();
        double tasa = service.obtenerTasaConversion(de, a);
        if (tasa != -1) {
            double resultado = cantidad * tasa;
            System.out.printf("Resultado: %.2f %s = %.2f %s%n", cantidad, de, resultado, a);
        } else {
            System.out.println("No se pudo obtener la tasa de conversión.");
        }
    }
}
