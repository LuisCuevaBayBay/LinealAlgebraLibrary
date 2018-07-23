package com.company;
import java.util.Scanner;
public class VectorN {

    private Scanner teclado;

    private LectorTeclado lt = new LectorTeclado();

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
            System.out.println("El vector es: " + datosC[f]);
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
            System.out.println("El vector es: " + datosC[i]);
        }
    }

    public void Multiplicar() {
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
            System.out.println("El vector es: " + datosC[i]);
        }
    }

    public void Magnitud() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar dimension");
        int cant;
        cant = teclado.nextInt();
        int[] datosA = new int[cant];
        for (int i = 0; i < datosA.length; i++) {
            System.out.println("Ingrese los datos del vector");
            datosA[i] = teclado.nextInt();
            double Mvv = Math.sqrt((datosA[i] * datosA[i] + (datosA[i + 1] * datosA[i + 1]) + (datosA[i - 1] * datosA[i - 1])));
            System.out.println("La magnitud del vector A: " + Mvv);
        }
        int[] datosB = new int[cant];
        for (int f = 0; f < datosB.length; f++) {
            System.out.print("ingrese datos del vector");
            datosB[f] = teclado.nextInt();
            double Mv = Math.sqrt((datosB[f] * datosB[f] + (datosB[f + 1] * datosB[f + 1]) + (datosB[f - 1] * datosB[f - 1])));
            System.out.println("La magnitud del vector B: " + Mv);
        }
    }

    public void Unitario() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar dimension");
        int cant;
        cant = teclado.nextInt();
        int[] datosA = new int[cant];
        int[] result = new int[cant];
        for (int i = 0; i < datosA.length; i++) {
            System.out.println("Ingrese los datos del vector");
            datosA[i] = teclado.nextInt();
            double Mvv = Math.sqrt((datosA[i] * datosA[i] + (datosA[i + 1] * datosA[i + 1]) + (datosA[i - 1] * datosA[i - 1])));
            System.out.println("La magnitud del vector A: " + Mvv);
            result[i] = (int) (datosA[i] / Mvv);
        }
        int[] datosB = new int[cant];
        int[] resultB = new int[cant];
        for (int i = 0; i < datosB.length; i++) {
            System.out.println("Ingrese los datos del vector");
            datosB[i] = teclado.nextInt();
            double Mvvv = Math.sqrt((datosA[i] * datosA[i] + (datosB[i + 1] * datosB[i + 1]) + (datosB[i - 1] * datosB[i - 1])));
            System.out.println("La magnitud del vector A: " + Mvvv);
            resultB[i] = (int) (datosA[i] / Mvvv);
        }
    }

    public void ProdCruz() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar dimension");
            int cant;
            cant = teclado.nextInt();
            int[] datosA = new int[cant];
            for (int i = 0; i < datosA.length; i++) {
                System.out.println("Ingrese los datos del vector");
                datosA[i] = teclado.nextInt();
            }
            int[] datosB = new int[cant];
            for (int i = 0; i < datosB.length; i++) {
                System.out.println("Ingrese los datos del vector");
                datosB[i] = teclado.nextInt();
                for(int f=0;f<datosA.length;f++){
                    int cruz = (datosA[1]*datosB[2]-(datosA[2]*datosB[1])+(datosA[0]*datosB[2])-datosA[2]*datosB[0]+(datosA[0]*datosB[1]-datosA[1]*datosB[0]));
                    System.out.println(" El valor es: "+cruz);
                }
            }
        }
    }








