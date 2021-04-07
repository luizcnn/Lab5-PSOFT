import models.RouteManager;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        RouteManager routeManager = new RouteManager();
        Scanner sc = new Scanner(System.in);

        String origin = defineOrigin(sc);
        String destiny = defineDestiny(sc);

        while (true) {
            System.out.print("Informe seu tipo de transporte, através do dígito identificador:\n" +
                    "1. Pedestre\n" +
                    "2. Carro\n"+
                    "3. Ônibus\n" +
                    "4. Metrô\n"
            );
            int idDigit = sc.nextInt();

            if(!isValidIdDigit(idDigit)) {
                System.out.println("Meio de Transporte Inválido. Encerrando a aplicação.");
                break;
            }

            routeManager.selectTransport(idDigit);
            routeManager.showRoute(origin, destiny);
        }
    }

    private static boolean isValidIdDigit(int idDigit) {
        return idDigit > 0 && idDigit <= 4;
    }

    private static String defineOrigin(Scanner sc) {
        System.out.println("Informe seu ponto de partida:");
        return sc.nextLine();
    }

    private static String defineDestiny(Scanner sc) {
        System.out.println("Informe seu destino:");
        return sc.nextLine();
    }
}
