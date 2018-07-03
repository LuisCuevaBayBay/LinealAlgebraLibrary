package com.company;

public class VectorR2 {

    private int x;
    private int y;

    private LectorTeclado lt = new LectorTeclado();

    public void sumar(){
    int X1 = lt.leerEntero("Ingrese el valor 'x' del vector A","intente de nuevo");
    int Y1 = lt.leerEntero("Ingrese el valor 'y' del vector A","intente de nuevo");

    int X2 = lt.leerEntero("Ingrese el valor 'x' del vector B","intente de nuevo");
    int Y2 = lt.leerEntero("Ingrese el valor 'y' del vector B","intente de nuevo");

    int resultX = X1 + X2;
    int resultY = Y1 + Y2;

        System.out.println("El vector A es: "+"("+X1+","+Y1+")");
        System.out.println("El vector B es: "+"("+X2+","+Y2+")");

        System.out.println("El Vector C es: "+"("+resultX+","+resultY+")");
    }

    public void restar(){
        int X1 = lt.leerEntero("Ingrese el valor 'x' del vector A","intente de nuevo");
        int Y1 = lt.leerEntero("Ingrese el valor 'y' del vector A","intente de nuevo");

        int X2 = lt.leerEntero("Ingrese el valor 'x' del vector B","intente de nuevo");
        int Y2 = lt.leerEntero("Ingrese el valor 'y' del vector B","intente de nuevo");

        int resultX = X2-X1;
        int resultY = Y2 - Y1;

        System.out.println("El vector A es: "+"("+X1+","+Y1+")");
        System.out.println("El vector B es: "+"("+X2+","+Y2+")");

        System.out.println("El Vector C es: "+"("+resultX+","+resultY+")");

    }
    public void ProdPunto(){
        int X1 = lt.leerEntero("Ingrese el valor 'x' del vector A","intente de nuevo");
        int Y1 = lt.leerEntero("Ingrese el valor 'y' del vector A","intente de nuevo");

        int X2 = lt.leerEntero("Ingrese el valor 'x' del vector B","intente de nuevo");
        int Y2 = lt.leerEntero("Ingrese el valor 'y' del vector B","intente de nuevo");

        int result = X1 * X2;
        int result2 = Y1 * Y2;
        int total = result+result2;

        System.out.println("El vector A es: "+"("+X1+","+Y1+")");
        System.out.println("El vector B es: "+"("+X2+","+Y2+")");
        System.out.println("El producto punto es: "+total);
    }

    public void ProdCoeficiente(){
        int X1 = lt.leerEntero("Ingrese el valor 'x' del vector A","intente de nuevo");
        int Y1 = lt.leerEntero("Ingrese el valor 'y' del vector A","intente de nuevo");

        int k = lt.leerEntero("Ingrese el coeficiente por favor","Intente de nuevo");

        System.out.println("El vector es: "+"("+X1+","+Y1+")");

        int totalX = k*X1;
        int totalY = k*Y1;

        System.out.println(" El coeficiente es: "+"("+totalX+","+totalY+")3");
    }
    public void ProdCruz(){
        int A1 = lt.leerEntero("Ingrese el valor 'A1' del vector A","intente de nuevo");
        int A2 = lt.leerEntero("Ingrese el valor 'A2' del vector A","intente de nuevo");
        int A3 = lt.leerEntero("Ingrese el valor 'A3' del vector A","Intente de nuevo");

        int B1 = lt.leerEntero("Ingrese el valor 'B1' del vector B","intente de nuevo");
        int B2 = lt.leerEntero("Ingrese el valor 'B2' del vector B","intente de nuevo");
        int B3 = lt.leerEntero("Ingrese el valor 'B3' del vector B","Intente de nuevo");

        int c1 = A2*B3 + A3*B2;
        int c2 = A3*B1 + B1*A3;
        int c3 = A1*B2;

        System.out.println("("+"i"+c1+","+"j"+c2+","+"k"+c3+")");
    }
    public void VecXMat(){
        int x = lt.leerEntero("Ingrese el valor 'x' del vector A","Intente de nuevo");
        int y = lt.leerEntero("Ingrese el valor 'y' del vector A","Intente de nuevo");

        int a1 = lt.leerEntero("Ingrese el valor A1 de la matriz","Intente de nuevo");
        int a2 = lt.leerEntero("Ingrese el valor A2 de la Matriz","intente de nuevo ");
        int a3 = lt.leerEntero("Ingrese el valor A3 de la matriz","intente de nuevo");
        int a4 = lt.leerEntero("Ingrese el valor A4 de la matriz","Intente de nuevo ");

        int total1= x*a1 + y*a2;
        int total2 = x*a3 + y*a4;

        int total = total1+total2;
        System.out.println("El total es: "+total);
    }

}
