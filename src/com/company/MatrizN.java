package com.company;
import java.util.Scanner;
public class MatrizN {
    public int[][] mat1;
    public int[][] mat2;
    public int[][] matRes;
    private Scanner teclado;

    public void Suma() {
        teclado = new Scanner(System.in);
        System.out.println("Cuantas filas tiene la matriz ?");
        int filas = teclado.nextInt();
        System.out.println("Cuantas columnas tiene la matriz ?");
        int columnas = teclado.nextInt();

        if (filas == columnas) {

            mat1 = new int[filas][columnas];
            mat2 = new int[filas][columnas];
            matRes = new int[filas][columnas];
            //escribir datos Matriz A
            System.out.println("Datos de la Matriz A:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.println("Digita un número para la Matriz A ");
                    mat1[i][j] = teclado.nextInt();
                }
            }
            // escribir datos Matriz B
            System.out.println("Datos de la Matriz B:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.println("Digita un número para la Matriz B ");
                    mat2[i][j] = teclado.nextInt();
                }
                System.out.println();
            }
            System.out.println("Suma de las dos matrices:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matRes[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        } else {
            System.out.println("Las Matrices no se pueden sumar no cumplen los requisitos");
        }

    }



    public void resta() {
            teclado = new Scanner(System.in);
            System.out.println("Cuantas filas tienen la matrices ?");
            int filas = teclado.nextInt();
            System.out.println("Cuantas columnas tiene la matrices ?");
            int columnas = teclado.nextInt();

            if (filas == columnas) {

                mat1 = new int[filas][columnas];
                mat2 = new int[filas][columnas];
                matRes = new int[filas][columnas];
                //escribir datos Matriz A
                System.out.println("Datos de la Matriz A:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.println("Digita un número para la Matriz A ");
                        mat1[i][j] = teclado.nextInt();
                    }

                }
                // escribir datos Matriz B
                System.out.println("Datos de la Matriz B:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.println("Digita un número para la Matriz B ");
                        mat2[i][j] = teclado.nextInt();
                    }

                }
                System.out.println("Resta de las dos matrices:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matRes[i][j] = mat1[i][j] - mat2[i][j];

                    }
                }
            } else {
                System.out.println("Las Matrices no se pueden restar no cumplen los requisitos");
            }
        }

    public void Multiplicacion() {

        teclado = new Scanner(System.in);
        System.out.println("Cuantas filas tiene la matriz A?");
        int filasA = teclado.nextInt();
        System.out.println("Cuantas columnas tiene la matriz A ?");
        int columnasA = teclado.nextInt();

        System.out.println("Cuantas filas tiene la matriz B?");
        int filasB = teclado.nextInt();
        System.out.println("Cuantas columnas tiene la matriz B?");
        int columnasB = teclado.nextInt();

        if (filasA == columnasB) {
            mat1 = new int[filasA][columnasA];
            mat2 = new int[filasB][columnasB];
            matRes = new int[filasA][columnasB];

            //escribir datos Matriz A
            System.out.println("Datos de la Matriz A:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    System.out.println("Digita un número para la Matriz A ");
                    mat1[i][j] = teclado.nextInt();
                }

            }
            // escribir datos Matriz B
            System.out.println("Datos de la Matriz B:");
            for (int i = 0; i < filasB; i++) {
                for (int j = 0; j < columnasB; j++) {
                    System.out.println("Digita un número para la Matriz B ");
                    mat2[i][j] = teclado.nextInt();
                }
            }
            System.out.println("Resultado: ");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) { //puede ser columnasA o filasB ya que deben ser iguales
                        matRes[i][j] += mat1[i][k] * mat2[k][j];
                    }
                    System.out.print(matRes[i][j] + " ");
                }
            }
        } else {
            System.out.println("Error las matrices no se pueden multiplicar, no se cumplen las reglas");
        }
    }
    }