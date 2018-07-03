package com.company;

public class VectorR3 {

    private int x;
    private int y;

    private LectorTeclado lt = new LectorTeclado();

    public void suma(){
        int x1 = lt.leerEntero("Introduzca el valor x del vector a","Intente de nuevo");
        int y1 = lt.leerEntero("Introduzac el valor x del vector a","Intente de nuevo");
        int z1 = lt.leerEntero("Introduzca el valor z del vector a","intente de nuevo");

        int x2 = lt.leerEntero("Introduzca el valor x del vector b","Intente de nuevo");
        int y2 = lt.leerEntero("Introduzac el valor x del vector b","Intente de nuevo");
        int z2 = lt.leerEntero("Introduzca el valor z del vector b","intente de nuevo");

        int c1 = x1+x2;
        int c2 = y1+y2;
        int c3 = z1+z2;

        System.out.println("el vector A: "+"("+x1+","+y1+","+z1);
        System.out.println("El vector B: "+"("+x2+","+y2+","+z2);
        System.out.println("El resultado es: "+"("+c1+","+c2+","+c3+")");
    }
    public void resta(){
        int x1 = lt.leerEntero("Introduzca el valor x del vector a","Intente de nuevo");
        int y1 = lt.leerEntero("Introduzac el valor x del vector a","Intente de nuevo");
        int z1 = lt.leerEntero("Introduzca el valor z del vector a","intente de nuevo");

        int x2 = lt.leerEntero("Introduzca el valor x del vector b","Intente de nuevo");
        int y2 = lt.leerEntero("Introduzac el valor x del vector b","Intente de nuevo");
        int z2 = lt.leerEntero("Introduzca el valor z del vector b","intente de nuevo");

        int c1 = x1-x2;
        int c2 = y1-y2;
        int c3 = z1-z2;

        System.out.println("el vector A: "+"("+x1+","+y1+","+z1);
        System.out.println("El vector B: "+"("+x2+","+y2+","+z2);
        System.out.println("El resultado es: "+"("+c1+","+c2+","+c3+")");
    }
    public void prodpunto(){
        int x1 = lt.leerEntero("Introduzca el valor x del vector a","Intente de nuevo");
        int y1 = lt.leerEntero("Introduzac el valor x del vector a","Intente de nuevo");
        int z1 = lt.leerEntero("Introduzca el valor z del vector a","intente de nuevo");

        int x2 = lt.leerEntero("Introduzca el valor x del vector b","Intente de nuevo");
        int y2 = lt.leerEntero("Introduzac el valor x del vector b","Intente de nuevo");
        int z2 = lt.leerEntero("Introduzca el valor z del vector b","intente de nuevo");

        int result1 = x1 * x2;
        int result2 = y1 * y2;
        int result3 = z1 * z2;

        int finalresult = result1+result2+result3;
        System.out.println("el producto punto es: "+finalresult);
    }
    public void ProdPorCoeficiente() {
        int x1 = lt.leerEntero("Ingrese el X del vector 1 ", "Intente de nuevo");
        int y1 = lt.leerEntero("Ingrese el Y del vector 1 ", "Intente de nuevo");
        int z1 = lt.leerEntero("Ingrese el Z del vector 1 ", "Intente de nuevo");

        int co = lt.leerEntero("Ingrese el coeficiente ","Intente de nuevo");

        int result1  = x1*co;
        int result2  = y1*co;
        int result3  = z1*co;

        System.out.println("el producto por coeficiente es: "+"("+result1+","+result2+","+result3+")");
    }
}
