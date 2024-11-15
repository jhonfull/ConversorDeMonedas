import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultarMoneda consultar = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("*****************************************\n" +
                    "Sean Bienvenidos/as al Conversor de Monedas =) \n\n" +
                    "Seleccione la conversión a realizar:\n\n" +
                    "1) Dólar =>> Peso colombiano\n" +
                    "2) Peso colombiano =>> Dólar\n" +
                    "3) Dólar =>> Peso argentino\n" +
                    "4) Peso argentino =>> Dólar\n" +
                    "5) Real brasileño =>> Dólar\n" +
                    "6) Dólar =>> Real brasileño\n" +
                    "7) Elegir otra moneda\n" +
                    "8) Salir\n");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertirMoneda("USD", "COP", consultar, scanner);
                    break;
                case 2:
                    ConvertirMoneda.convertirMoneda("COP", "USD", consultar, scanner);
                    break;
                case 3:
                    ConvertirMoneda.convertirMoneda("USD", "ARS", consultar, scanner);
                    break;
                case 4:
                    ConvertirMoneda.convertirMoneda("ARS", "USD", consultar, scanner);
                    break;
                case 5:
                    ConvertirMoneda.convertirMoneda("BRL", "USD", consultar, scanner);
                    break;
                case 6:
                    ConvertirMoneda.convertirMoneda("USD", "BRL", consultar, scanner);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consultar, scanner);
                    break;
                case 8:
                    System.out.println("Saliendo de la aplicación");
                    break;

                default:
                    System.out.println("Opción ingresada no vailda");
                    break;
            }
        }
    }
}
