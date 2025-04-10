//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {



    }
    public static void menu(){
        System.out.println("-------- MENU PRINCIPAL ------------");
        System.out.println("1. Ingresar dimensiones matriz");
        System.out.println("2. Buscar fila de la matriz");
        System.out.println("3. Consultar si es matriz Cero");
        System.out.println("4. Salir");
        System.out.println("Ingrese la opción:  ");
    }
    public static void leerOpcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: dimensionesMatriz();
            break;
            case 2: mostrarFila();

    }
    }
    public int[][] crearMatriz(int filas, int cols){

    }
    public static void llenarMatriz(int matriz [][]){

    }
    public boolean matrizCero (int matriz[][]){

    }
    public int[][] dimensionesMatriz(int filas, int cols){

    }
    public static void mostrarFila( int matriz[][]){

    }


