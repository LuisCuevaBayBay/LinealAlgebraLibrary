package com.company;

public class VectorR4 {

    private LectorTeclado lt = new LectorTeclado();

    public void suma(){
        int x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        int y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        int z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        int w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        int x2 = lt.leerEntero("Ingrese el X del vector 2 ","Intente de nuevo");
        int y2 = lt.leerEntero("Ingrese el Y del vector 2 ","Intente de nuevo");
        int z2 = lt.leerEntero("Ingrese el Z del vector 2 ","Intente de nuevo");
        int w2 = lt.leerEntero("Ingrese el W del vector 2 ","Intente de nuevo");

        int a1 = x1+x2;
        int a2 = y1+y2;
        int a3 = z1+z2;
        int a4 = w1+w2;

        System.out.println("el Vector resultado es: "+"("+a1+","+a2+","+a3+","+a4+")");
    }

    public void resta(){
        int x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        int y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        int z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        int w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        int x2 = lt.leerEntero("Ingrese el X del vector 2 ","Intente de nuevo");
        int y2 = lt.leerEntero("Ingrese el Y del vector 2 ","Intente de nuevo");
        int z2 = lt.leerEntero("Ingrese el Z del vector 2 ","Intente de nuevo");
        int w2 = lt.leerEntero("Ingrese el W del vector 2 ","Intente de nuevo");

        int a1 = x2-x1;
        int a2 = y2-y1;
        int a3 = z2-z1;
        int a4 = w2-w1;

        System.out.println("el Vector resultado es: "+"("+a1+","+a2+","+a3+","+a4+")");
    }

    public void ProdPunto(){
        int x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        int y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        int z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        int w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        int x2 = lt.leerEntero("Ingrese el X del vector 2 ","Intente de nuevo");
        int y2 = lt.leerEntero("Ingrese el Y del vector 2 ","Intente de nuevo");
        int z2 = lt.leerEntero("Ingrese el Z del vector 2 ","Intente de nuevo");
        int w2 = lt.leerEntero("Ingrese el W del vector 2 ","Intente de nuevo");

        int result1 = x1 * x2;
        int result2 = y1 * y2;
        int result3 = z1 * z2;
        int result4 = w1 * w2;

        int TotalResult = result1+result2+result3+result4;

        System.out.println("El producto punto es: "+TotalResult);
    }

    public void ProdPorCoeficiente(){
        int x1 = lt.leerEntero("Ingrese el X del vector 1 ","Intente de nuevo");
        int y1 = lt.leerEntero("Ingrese el Y del vector 1 ","Intente de nuevo");
        int z1 = lt.leerEntero("Ingrese el Z del vector 1 ","Intente de nuevo");
        int w1 = lt.leerEntero("Ingrese el W del vector 1 ","Intente de nuevo");

        int coe = lt.leerEntero("Ingrese el coeficiente","Intente de nuevo");

        int res1 = x1*coe;
        int res2 = y1*coe;
        int res3 = z1*coe;
        int res4 = w1*coe;

        System.out.println("El producto por coeficiente es: "+"("+res1+","+res2+","+res3+","+","+res4+")");
    }
}
