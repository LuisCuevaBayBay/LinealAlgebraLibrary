package com.company;
import java.util.Scanner;
public class MenuPrincipal {

    public LectorTeclado lt = new LectorTeclado();

    public void Menu() {
        int j;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido A la libreria de Algebra Lineal");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("En que dimension desea trabajar?");
            System.out.println("Las opciones son: ");
            System.out.println("\t 1. R2");
            System.out.println("\t 2. R3");
            System.out.println("\t 3. R4");
            System.out.println("\t 4. dimension N");
            System.out.println("\t 5. Salir del programa");
            j = lt.leerEntero("Favor ingrese una opcion","Intente de nuevo");
            switch (j) {
                case 1:
                    System.out.println("Bienvenido a la opcion R2");
                    System.out.println("\t 1. Vectores");
                    System.out.println("\t 2. Matrices");

                    int j2 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");
                    switch (j) {
                        case 1:
                            System.out.println("Escoja una de las siguientes opciones");
                            System.out.println("1. Suma de Vectores");
                            System.out.println("2. Resta de vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Producto Por Coeficiente");
                            System.out.println("5. Vector por matriz");
                            System.out.println("");
                            System.out.println("");
                            int j3 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");
                            switch (j3) {
                                case 1: {
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.sumar();
                                    break;
                                }
                                case 2: {
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.restar();
                                    break;
                                }
                                case 3: {
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.ProdPunto();
                                    break;
                                }
                                case 4: {
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.ProdCoeficiente();
                                    break;
                                }
                                case 5: {
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.VecXMat();
                                    break;
                                }
                            }
                    }
                    int j5 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");
                    switch (j5) {
                        case 1:
                            System.out.println("Las opciones de matrices R2 son: ");
                            System.out.println("1. Suma de matrices");
                            System.out.println("2. Resta de matrices");
                            System.out.println("3. Multiplicacion de Matrices");
                            System.out.println("4. Matriz por Escalar");
                            System.out.println("5. Matriz Rotacion");
                    }
                    int j6 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");
                    switch (j6) {
                        case 1: {
                            MatrizR2 matrizR2 = new MatrizR2();
                            matrizR2.suma();
                            break;
                        }
                        case 2: {
                            MatrizR2 matrizR2 = new MatrizR2();
                            matrizR2.resta();
                            break;
                        }
                        case 3: {
                            MatrizR2 matrizR2 = new MatrizR2();
                            matrizR2.multiplicacion();
                        }
                        case 4: {
                            MatrizR2 matrizR2 = new MatrizR2();
                            matrizR2.escalar();
                            break;
                        }
                        case 5: {
                            MatrizR2 matrizR2 = new MatrizR2();
                            matrizR2.MatrizRotacion();
                            break;
                        }
                    }
                case 2:
                    System.out.println("Seleccione una Opcion en R3");
                    System.out.println("1. Vectores");
                    System.out.println("2. Matrices");
                    int j7 = lt.leerEntero("Ingrese una opcion valida","intente de nuevo");
                    switch (j7) {
                        case 1:
                            System.out.println("En vectores R3 tiene las siguientes formulas disponibles");
                            System.out.println("1. Suma de vectores");
                            System.out.println("2. Resta de vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Producto por Coeficiente");

                            int j8 = sc.nextInt();
                            switch (j8) {
                                case 1: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.suma();
                                    break;
                                }
                                case 2: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.resta();
                                    break;
                                }
                                case 3: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.prodpunto();
                                    break;
                                }
                                case 4: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.ProdPorCoeficiente();
                                    break;
                                }
                            }
                        case 2:
                            System.out.println("En Matriz R3 tiene las siguientes opciones");
                            System.out.println("1. Suma de Matrices");
                            System.out.println("2. Resta de Matrices");
                            System.out.println("3. Multiplicar Matrices");
                            System.out.println("4. Vector Por Matriz");
                            System.out.println("5. Matriz Rotacion");
                            System.out.println("5. Producto Punto");
                            int j10 = lt.leerEntero("Ingrese una opcion valida","intente de nuevo");
                            switch (j10) {
                                case 1: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.SumarMatriz();
                                    break;
                                }
                                case 2: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.RestaMatriz();
                                    break;
                                }
                                case 3: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.multiplicar();
                                    break;
                                }
                                case 4: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.VecXMat();
                                    break;
                                }
                                case 5: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.MatrizRotacion();
                                    break;
                                }
                                case 6:{
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.ProdPunto();
                                }
                            }
                    }
                case 3:
                    System.out.println("Seleccione una opcion en R4");
                    System.out.println("1. Vectores");
                    System.out.println("2. Matriz");
                    int j11 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");
                    switch (j11) {
                        case 2:
                            System.out.println("En vectores R4 tiene las siguientes opciones");
                            System.out.println("1. Suma de vectores");
                            System.out.println("2. Resta de vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Producto por Coeficiente");
                            int j12 = sc.nextInt();
                            switch (j12) {
                                case 1: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.suma();
                                    break;
                                }
                                case 2: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.resta();
                                    break;
                                }
                                case 3: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.ProdPunto();
                                    break;
                                }
                                case 4: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.ProdPorCoeficiente();
                                    break;
                                }
                            }
                    }
                    int j13 = sc.nextInt();
                    switch (j13) {
                        case 2: {
                            System.out.println("En matrices R4 estan las siguientes formulas");
                            System.out.println("1. Suma");
                            System.out.println("2. Resta");
                            System.out.println("3. Multiplicacion");
                            System.out.println("4. Escalar * Matriz");
                            System.out.println("5. Matriz Rotacion");
                            int j14 = lt.leerEntero("Ingrese una opcion valida","intente de nuevo");
                            switch (j14) {
                                case 1: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.suma();
                                    break;
                                }
                                case 2: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.resta();
                                    break;
                                }
                                case 3: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.multiplicacion();
                                    break;
                                }
                                case 4: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.EscalarXMatriz();
                                    break;
                                }
                                case 5: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.MatrizRotacion();
                                    break;
                                }
                            }
                        }
                    }
                case 4:
                    System.out.println("Seleccione una opcion en N");
                    System.out.println("1. Vectores");
                    System.out.println("2. Matrices");
                    int j15 = lt.leerEntero("ingrese una opcion valida","intente de nuevo");
                    switch (j15) {
                        case 1:
                            System.out.println("En vectores N tiene las siguientes opciones");
                            System.out.println("1. Suma de Vectores");
                            System.out.println("2. Resta de Vectores");
                            System.out.println("3. Multiplicacion de Vectores");
                            System.out.println("4. Magnitud de Vector");
                            System.out.println("5. Vector Unitario");
                            System.out.println("6. Producto Cruz");
                            int j16 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");
                            switch (j16) {
                                case 1: {
                                    VectorN vectorN = new VectorN();
                                    vectorN.Suma();
                                    break;
                                }
                                case 2: {
                                    VectorN vectorN = new VectorN();
                                    vectorN.Resta();
                                    break;
                                }
                                case 3: {
                                    VectorN vectorN = new VectorN();
                                    vectorN.Multiplicar();
                                    break;
                                }
                                case 4: {
                                    VectorN vectorN = new VectorN();
                                    vectorN.Magnitud();
                                }
                                case 5: {
                                    VectorN vectorN = new VectorN();
                                    vectorN.Unitario();
                                }
                                case 6:{
                                    VectorN vectorN = new VectorN();
                                    vectorN.ProdCruz();
                                }
                            }
                    }
                    int j17 = lt.leerEntero("ingrese una opcion valida","intente de nuevo");
                    switch (j17) {
                        case 2: {
                            System.out.println("En matrices N estan las siguientes formulas");
                            System.out.println("1. Suma");
                            System.out.println("2. Resta");
                            System.out.println("3. Multiplicacion");
                            int j18 = sc.nextInt();
                            switch (j18) {
                                case 1: {
                                    MatrizN matrizN = new MatrizN();
                                    matrizN.Suma();
                                    break;
                                }
                                case 2: {
                                    MatrizN matrizN = new MatrizN();
                                    matrizN.resta();
                                    break;
                                }
                                case 3: {
                                    MatrizN matrizN = new MatrizN();
                                    matrizN.Multiplicacion();
                                    break;
                                }

                            }
                        }
                    }
            }
        }
        while (j < 5) ;
    }
}
