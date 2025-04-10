//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;


public static void Main(String[] args){
    static int filas;
    static int columnas;
    static int[][] matriz;
    Scanner scanner = new Scanner(System.in);
    dimensionMatriz(scanner);
    menu();
    leerOpcion();

    }
    public static void menu(){
        System.out.println("-------- MENU PRINCIPAL ------------");
        System.out.println("1. Ingresar dimensiones matriz");
        System.out.println("2. Buscar fila de la matriz");
        System.out.println("3. Consultar si es matriz Cero");
        System.out.println("4. Salir");
        System.out.println("Ingrese la opción:  ");
    }
    public static void leerOpcion(int[][] matriz){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        opcion = scanner.nextInt();
        do {
            menu();

            switch (opcion) {
                case 1:
                    dimensionMatriz(scanner);
                    break;
                case 2:
                    System.out.println("Ingrese la fila a buscar:  ");
                    String busqueda = scanner.next();
                    mostrarFila(busqueda, matriz);
                    break;
                case 3:
                    matrizCero();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while  (opcion != 4);
        System.out.println("EL PROGRAMA HA FINALIZADO");

    }


    public int[][] crearMatriz(int filas, int columnas){
        return new int[filas][columnas];

    }
    public static void llenarMatriz(int[][] matriz){
        Random random = new Random();
        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j <matriz.length; j++){
                matriz[i][j] = (int) (Math.random()*10);
            }
        }

    }
    public boolean matrizCero (int[][] matriz){


    }
    public static void dimensionMatriz(Scanner scanner){
        System.out.println("Ingrese la dimensión de la fila: ");
        int filas = scanner.nextInt();

        System.out.println("Ingrese la dimensión de la columna: ");
        int columnas = scanner.nextInt();


    }
    public static int[] mostrarFila(String busqueda, int[][] matriz){


    }
    public static boolean validarDimensiones(int fls, int cols){
        return fls > 1 && cols >1;
    }


