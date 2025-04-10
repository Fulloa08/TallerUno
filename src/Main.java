//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;

public class TallerUno {
    static int[][] matriz;
    static int filas;
    static int columnas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejecutarMenu(scanner);

    }

    public static void mostrarMenu() {
        System.out.println("-------- MENU PRINCIPAL ------------");
        System.out.println("1. Ingresar dimensiones matriz");
        System.out.println("2. Buscar fila de la matriz");
        System.out.println("3. Consultar si es matriz Cero");
        System.out.println("4. Salir");
        System.out.println("Ingrese la opción:  ");
    }
    public static void ejecutarMenu(Scanner scanner){
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(scanner, opcion);
        } while (opcion != 4);
        System.out.println("EL PROGRAMA HA FINALIZADO. ");
    }

    public static void procesarOpcion(Scanner scanner, int opcion){
        switch (opcion){
            case 1 -> dimensionMatriz(scanner);
            case 2 -> mostrarFila(scanner);
            case 3 -> matrizCero();
            case 4 -> {}
            default -> System.out.println("Opción inválida.");

        }
    }


    public int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];

    }

    public static void llenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

    }

    public boolean matrizCero(int[][] matriz) {
        int total = matriz.length * matriz[0]. length;
        int ceros = 0;


    }

    public static void dimensionMatriz(Scanner scanner) {
        System.out.println("Ingrese la dimensión de la fila: ");
        filas = scanner.nextInt();

        System.out.println("Ingrese la dimensión de la columna: ");
        columnas = scanner.nextInt();

        if(validarDimensiones(filas, columnas)){
            matriz = crearMatriz(filas, columnas);
            llenarMatriz(matriz);
            System.out.println("Matriz creada y llenada con valores aleatorios.");
        } else {
            System.out.println("Dimensiones inválidas");
        }

    }

    public static int[] mostrarFila(String busqueda, int[][] matriz) {


    }

    public static boolean validarDimensiones(int fls, int cols) {
        return fls > 1 && cols > 1;
    }
}

