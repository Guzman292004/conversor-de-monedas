package com.guzman.conversor_de_monedas;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorDeMonedasApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService service = new ExchangeRateService();
        int opcion;

        do {
            Conversor.exibirMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> Conversor.convertir("USD", "ARS", service, scanner);
                case 2 -> Conversor.convertir("ARS", "USD", service, scanner);
                case 3 -> Conversor.convertir("USD", "BRL", service, scanner);
                case 4 -> Conversor.convertir("BRL", "USD", service, scanner);
                case 5 -> Conversor.convertir("USD", "COP", service, scanner);
                case 6 -> Conversor.convertir("COP", "USD", service, scanner);
                case 7 -> Conversor.convertir("USD", "MXN", service, scanner);
                case 8 -> Conversor.convertir("MXN", "USD", service, scanner);
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 9);
    }
}
