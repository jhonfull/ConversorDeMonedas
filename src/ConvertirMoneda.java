import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertirMoneda(String monedaBase, String monedaDestino, ConsultarMoneda consultar, Scanner scanner) {
        double cantidad = 0.0;
        double cantidadConvertida = 0.0;
        boolean entradaValida = false;
        // Obtener la tasa de conversión
        Moneda moneda = consultar.buscarMoneda(monedaBase, monedaDestino);
        System.out.println("La tasa de conversión para hoy: \n1 " + monedaBase + " => " + moneda.conversion_rate() + " " + monedaDestino);
        // Validar la entrada del usuario
        while (!entradaValida) {
            System.out.println("Ingrese la cantidad de " + monedaBase + ": ");
            String entrada = scanner.nextLine();
            try {
                cantidad = Double.parseDouble(entrada);
                entradaValida = true; // Si es válido, salir del bucle
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        // Realizar la conversión
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + moneda.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consultar, Scanner scanner) {
        System.out.println("Ingrese el codigo de la moneda base:");
        String monedaBase = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = scanner.nextLine().toUpperCase();
        convertirMoneda(monedaBase, monedaObjetivo, consultar, scanner);
    }

}
