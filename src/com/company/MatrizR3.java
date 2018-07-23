package com.company;

public class MatrizR3 {
    private int a;
    private int b;
    private int c;

    private LectorTeclado lt = new LectorTeclado();

    public void SumarMatriz(){
     int a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
     int a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
     int a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");
     int a4 = lt.leerEntero("Favor ingresar el numero a4","ingrese un entero");
     int a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
     int a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
     int a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
     int a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
     int a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

     int b1 = lt.leerEntero("Favor ingresar el numero b1","ingrese un entero");
     int b2 = lt.leerEntero("Favor ingresar el numero b2","ingrese un entero");
     int b3 = lt.leerEntero("Favor ingresar el numero b3","ingrese un entero");
     int b4 = lt.leerEntero("Favor ingresar el numero b4","ingrese un entero");
     int b5 = lt.leerEntero("Favor ingresar el numero b5","ingrese un entero");
     int b6 = lt.leerEntero("Favor ingresar el numero b6","ingrese un entero");
     int b7 = lt.leerEntero("Favor ingresar el numero b7","ingrese un entero");
     int b8 = lt.leerEntero("Favor ingresar el numero b8","ingrese un entero");
     int b9 = lt.leerEntero("Favor ingresar el numero b9","ingrese un entero");

     int c1 = a1+b1;
     int c2 = a2+b2;
     int c3 = a3+b3;
     int c4 = a4+b4;
     int c5 = a5+b5;
     int c6 = a6+b6;
     int c7 = a7+b7;
     int c8 = a8+b8;
     int c9 = a9+b9;


        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");
    }
    public void RestaMatriz(){
        int a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        int a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        int a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");
        int a4 = lt.leerEntero("Favor ingresar el numero a4","ingrese un entero");
        int a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        int a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        int a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        int a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        int a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        int b1 = lt.leerEntero("Favor ingresar el numero b1","ingrese un entero");
        int b2 = lt.leerEntero("Favor ingresar el numero b2","ingrese un entero");
        int b3 = lt.leerEntero("Favor ingresar el numero b3","ingrese un entero");
        int b4 = lt.leerEntero("Favor ingresar el numero b4","ingrese un entero");
        int b5 = lt.leerEntero("Favor ingresar el numero b5","ingrese un entero");
        int b6 = lt.leerEntero("Favor ingresar el numero b6","ingrese un entero");
        int b7 = lt.leerEntero("Favor ingresar el numero b7","ingrese un entero");
        int b8 = lt.leerEntero("Favor ingresar el numero b8","ingrese un entero");
        int b9 = lt.leerEntero("Favor ingresar el numero b9","ingrese un entero");

        int c1 = a1-b1;
        int c2 = a2-b2;
        int c3 = a3-b3;
        int c4 = a4-b4;
        int c5 = a5-b5;
        int c6 = a6-b6;
        int c7 = a7-b7;
        int c8 = a8-b8;
        int c9 = a9-b9;


        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");
    }

    public void multiplicar(){
        int a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        int a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        int a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");
        int a4 = lt.leerEntero("Favor ingresar el numero a4","ingrese un entero");
        int a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        int a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        int a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        int a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        int a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        int b1 = lt.leerEntero("Favor ingresar el numero b1","ingrese un entero");
        int b2 = lt.leerEntero("Favor ingresar el numero b2","ingrese un entero");
        int b3 = lt.leerEntero("Favor ingresar el numero b3","ingrese un entero");
        int b4 = lt.leerEntero("Favor ingresar el numero b4","ingrese un entero");
        int b5 = lt.leerEntero("Favor ingresar el numero b5","ingrese un entero");
        int b6 = lt.leerEntero("Favor ingresar el numero b6","ingrese un entero");
        int b7 = lt.leerEntero("Favor ingresar el numero b7","ingrese un entero");
        int b8 = lt.leerEntero("Favor ingresar el numero b8","ingrese un entero");
        int b9 = lt.leerEntero("Favor ingresar el numero b9","ingrese un entero");

        int c1 = a1*b1+a2*b4+a3*b7;
        int c2 = a1*b2+a2*b5+b3*b8;
        int c3 = a1*b3+a2*b6+a3*b9;
        int c4 = a4*b1+a5*b4+a6*b7;
        int c5 = a4*b2+a5*b5+a6*b8;
        int c6 = a4*b3+a5*b6+a6*b6;
        int c7 = a7*b1+a8*b4+a9*b7;
        int c8 = a7*b2+a8*b5+a9*b8;
        int c9 = a7*b3+a8*b6+a9*b9;

        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");

    }

    public void matrizXescalar(){
        int a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        int a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        int a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");
        int a4 = lt.leerEntero("Favor ingresar el numero a4","ingrese un entero");
        int a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        int a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        int a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        int a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        int a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        int Escalar = lt.leerEntero("Favor ingrese el escalar","Favor intente de nuevo");

        int c1 = Escalar*a1;
        int c2 = Escalar*a2;
        int c3 = Escalar*a3;
        int c4 = Escalar*a4;
        int c5 = Escalar*a5;
        int c6 = Escalar*a6;
        int c7 = Escalar*a7;
        int c8 = Escalar*a8;
        int c9 = Escalar*a9;

        System.out.println("|"+c1+" "+c2+" "+c3+"|");
        System.out.println("|"+c4+" "+c5+" "+c6+"|");
        System.out.println("|"+c7+" "+c8+" "+c9+"|");
    }

    public void MatrizRotacion(){
        double grados = lt.leerFlotante("Favor ingrese los grados","intente de nuevo");

        int a1 = lt.leerEntero("Favor ingresar el numero a1","ingrese un entero");
        int a2 = lt.leerEntero("Favor ingresar el numero a2","ingrese un entero");
        int a3 = lt.leerEntero("Favor ingresar el numero a3","ingrese un entero");

        //Rx
        int Rx1 = 1;
        int Rx2 = 0;
        int Rx3 = 0;

        int Rx4 = 0;
        double Rx5 = Math.cos(grados);
        double Rx6 = Math.sin(grados);

        int Rx7 = 0;
        double Rx8 = Math.sin(grados);
        double Rx9 = Math.cos(grados);

        //Ry
        double Ry1 = Math.cos(grados);
        int Ry2 = 0;
        double Ry3 = Math.sin(grados);

        int Ry4 = 0;
        int Ry5 = 1;
        int Ry6 = 0;

        double Ry7 = Math.sin(grados);
        int Ry8 = 0;
        double Ry9 = Math.cos(grados);

        //Rz
        double Rz1 = Math.cos(grados);
        int Rz2 = 0;
        double Rz3 = Math.sin(grados);

        double Rz4 = Math.sin(grados);
        double Rz5 = Math.cos(grados);
        int Rz6 = 0;

        int Rz7 = 0;
        int Rz8 = 0;
        int Rz9 = 1;

        // Matriz Rotacion en Referencia a X
        double ARx = Rx1*a1 + Rx2*a2 + Rx3*a3;
        double BRx = Rx4*a1 + Rx5*a2 + (-Rx6*a3);
        double CRx = Rx7*a1 + Rx8*a2 + Rx9*a3;

        //Matriz Rotacion en Referencia a Y
        double ARy = Ry1*a1 + Ry2*a2 + Ry3*a3;
        double BRy = Ry4*a1 + Ry5*a2 + (-Ry6*a3);
        double CRy = Ry7*a1 + Ry8*a2 + Ry9*a3;

        //Matriz Rotacion en Referencia a Z
        double ARz = Rz1*a1 + Rz2*a2 + Rz3*a3;
        double BRz = Rz4*a1 + Rz5*a2 + Rz6*a3;
        double CRz = Rz7*a1 + Rz8*a2 + Rz9*a3;


        System.out.println("La Matriz Rotacion de X: ");
        System.out.println("|"+ARx+" "+BRx+" "+CRx+"|");
        System.out.println("La Matriz Rotacion de Y:");
        System.out.println("|"+ARy+" "+BRy+" "+BRz+"|");
        System.out.println("La Matriz Rotacion de Z:");
        System.out.println("|"+ARz+" "+BRz+" "+CRz+"|");
    }
    public void VecXMat(){
        int x = lt.leerEntero("Ingrese el valor 'x' del vector A","Intente de nuevo");
        int y = lt.leerEntero("Ingrese el valor 'y' del vector A","Intente de nuevo");
        int z = lt.leerEntero("ingrese el valor z del vector A","Intente de nuevo");

        int a1 = lt.leerEntero("Ingrese el valor A1 de la matriz","Intente de nuevo");
        int a2 = lt.leerEntero("Ingrese el valor A2 de la Matriz","intente de nuevo ");
        int a3 = lt.leerEntero("Ingrese el valor A3 de la matriz","intente de nuevo");
        int a4 = lt.leerEntero("Ingrese el valor A4 de la matriz","Intente de nuevo ");
        int a5 = lt.leerEntero("Favor ingresar el numero a5","ingrese un entero");
        int a6 = lt.leerEntero("Favor ingresar el numero a6","ingrese un entero");
        int a7 = lt.leerEntero("Favor ingresar el numero a7","ingrese un entero");
        int a8 = lt.leerEntero("Favor ingresar el numero a8","ingrese un entero");
        int a9 = lt.leerEntero("Favor ingresar el numero a9","ingrese un entero");

        int total1= x*a1 + y*a2 +z*a3;
        int total2 = x*a4 + y*a5 +z*a6;
        int total3 = x*a7 + y*a8 + z*a9;

        int total = total1+total2+total3;
        System.out.println("El total es: "+total);
    }
}
