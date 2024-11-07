import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        showMenu(scanner);
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("====================");
            System.out.println(" Menu Clase 5");
            System.out.println("--------------------");
            System.out.println("1. Prueba ciclo white");
            System.out.println("2. prueba ciclo do-while");
            System.out.println("3. prueba ciclo for");
            System.out.println("0. salir de la aplicacion");
            System.out.print("Ingrese una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer o gastar el ENTER
            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    System.out.println("Termino la aplicacion, Hasta luego. ");
                    break;
                default:
                    System.err.println("Ingrese una opción correcta");
                    break;
            }
            if (option != 0) {
                pressEnter(scanner);

            }

        } while (option != 0);
    }

    private static void pressEnter(Scanner scanner) {
        System.out.println("Presione ENTER para continuar");
        scanner.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(++i);
        }
        System.out.println("Ganaste");
    }

    private static void doWhileTest() {
        var counter = 0;
        do {
            System.out.println(counter);
            // avance
            counter--;
        } while (counter > 0);
        System.out.println("Boooom!");
    }

    public static void whileTest() {
        var counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;

        }

    }

}
