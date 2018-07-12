package com.company;
import java.util.Scanner;
public class VectorN {

    private Scanner teclado;

    public void Suma() {
        teclado = new Scanner(System.in);
        System.out.print("En que dimension desea trabajar?");
        int cant;
        cant = teclado.nextInt();
        int[] datosA = new int[cant];
        for (int j = 0; j < datosA.length; j++) {
            System.out.print("ingrese datos del vector A");
            datosA[j] = teclado.nextInt();
        }
        int[] datosB = new int[cant];
        for (int f = 0; f < datosB.length; f++) {

                System.out.print("ingrese datos del vector B");
                datosB[f] = teclado.nextInt();

                int[] datosC = new int[cant];
                datosC[f] = datosA[f] + datosB[f];

                System.out.println("El vector resultado es: " + datosC[f]);
            }
        }


    public void Resta() {
        teclado = new Scanner(System.in);
        System.out.println("En que dimension desea trabajar?");
        int cant;
        cant = teclado.nextInt();
        int[] datosA = new int[cant];
        for (int f = 0; f < datosA.length; f++) {
            System.out.print("ingrese datos del vector");
            datosA[f] = teclado.nextInt();
        }
        int[] datosB = new int[cant];
        for (int f = 0; f < datosB.length; f++) {
            System.out.print("ingrese datos del vector");
            datosB[f] = teclado.nextInt();
        }
        for (int i = 0; i < datosA.length; i++) {
            int[] datosC = new int[cant];
            datosC[i] = datosA[i] - datosB[i];
            System.out.println("el vector resultado es: "+datosC[i]);
        }
    }
    public void Multiplicar(){
        teclado = new Scanner(System.in);
        System.out.println("En que dimension desea trabajar?");
        int cant;
        cant = teclado.nextInt();
        int[] datosA = new int[cant];
        for (int f = 0; f < datosA.length; f++) {
            System.out.print("ingrese datos del vector");
            datosA[f] = teclado.nextInt();
        }
        int[] datosB = new int[cant];
        for (int f = 0; f < datosB.length; f++) {
            System.out.print("ingrese datos del vector");
            datosB[f] = teclado.nextInt();
        }
        for (int i = 0; i < datosA.length; i++) {
            int[] datosC = new int[cant];
            datosC[i] = datosA[i] * datosB[i];
            System.out.println("el vector resultado es: "+datosC[i]);
        }
    }
}




