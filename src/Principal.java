import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversionDivisa conversor = new ConversionDivisa("0cab703d692555689a9111ff");

        boolean salida = false;
        while (!salida) {
            System.out.println(menucito);
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 0:
                    conversor.convertirMoneda("USD", "ARS");
                    break;
                case 1:
                    conversor.convertirMoneda("ARS", "USD");
                    break;
                case 2:
                    conversor.convertirMoneda("USD", "BRL");
                    break;
                case 3:
                    conversor.convertirMoneda("BRL", "USD");
                    break;
                case 4:
                    conversor.convertirMoneda("USD", "COP");
                    break;
                case 5:
                    conversor.convertirMoneda("COP", "USD");
                    break;
                case 6:
                    conversor.convertirMoneda("ARS","EUR");
                    break;
                case 7:
                    conversor.convertirMoneda("EUR","ARS");
                    break;
                case 8:
                    conversor.convertirMoneda("ARS","GBP");
                    break;
                case 9:
                    conversor.convertirMoneda("ARS","GBP");
                    break;
                case 10:
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elegí una opción del 0 al 10.");
            }
        }
        System.out.println("Gracias por utilizar el conversor de monedas. ¡Hasta luego! \n \n" +
                "███╗░░░███╗░█████╗░████████╗██╗░█████╗░░██████╗  ███╗░░░███╗░█████╗░░█████╗░██╗███████╗██╗░░░░░\n" +
                "████╗░████║██╔══██╗╚══██╔══╝██║██╔══██╗██╔════╝  ████╗░████║██╔══██╗██╔══██╗██║██╔════╝██║░░░░░\n" +
                "██╔████╔██║███████║░░░██║░░░██║███████║╚█████╗░  ██╔████╔██║███████║██║░░╚═╝██║█████╗░░██║░░░░░\n" +
                "██║╚██╔╝██║██╔══██║░░░██║░░░██║██╔══██║░╚═══██╗  ██║╚██╔╝██║██╔══██║██║░░██╗██║██╔══╝░░██║░░░░░\n" +
                "██║░╚═╝░██║██║░░██║░░░██║░░░██║██║░░██║██████╔╝  ██║░╚═╝░██║██║░░██║╚█████╔╝██║███████╗███████╗\n" +
                "╚═╝░░░░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝╚═╝░░╚═╝╚═════╝░  ╚═╝░░░░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝╚══════╝╚══════╝");
    }

    static String menucito = """
            -------------------------------------------
            =   BIENVENIDO/A AL CONVERSOR DE MONEDAS  =
            -------------------------------------------
            0. Convertir Dolares a Pesos Argentinos
            1. Convertir Pesos Argentinos a Dolares
            2. Convertir Dolares a Reales
            3. Convertir Reales a Dolares
            4. Convertir Dolares a Pesos Colombianos
            5. Convertir Pesos Colombianos a Dolares
            6. Convertir Pesos Argentinos a Euros
            7. Convertir Euros a Pesos Argentinos
            8. Convertir Pesos Argentinos a Libras Esterlinas
            9. Convertir Libras Esterlinas a Pesos Argentinos
            10. Salir
            -----------------------------------------------------
            Por favor, elegí una opción:
            """;

}