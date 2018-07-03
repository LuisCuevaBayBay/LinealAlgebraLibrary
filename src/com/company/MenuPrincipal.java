package com.company;
import java.util.Scanner;
public class MenuPrincipal {

    private LectorTeclado lt = new LectorTeclado();

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

            j = sc.nextInt();
            switch (j) {
                case 1:
                    System.out.println("Bienvenido a la opcion R2");
                    System.out.println("\t 1. Vectores");
                    System.out.println("\t 2. Matrices");

                    int j2 = sc.nextInt();
                    switch (j) {
                        case 1:
                            System.out.println("Escoja una de las siguientes opciones");
                            System.out.println("1. Suma de Vectores");
                            System.out.println("2. Resta de vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Producto Por Coeficiente");
                            System.out.println("5. Producto Cruz");
                            System.out.println("6. Vector por matriz");
                            System.out.println("");
                            System.out.println("");
                            int j3 = sc.nextInt();
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
                                    vectorR2.ProdCruz();
                                    break;
                                }
                                case 6: {
                                    VectorR2 vectorR2 = new VectorR2();
                                    vectorR2.VecXMat();
                                    break;
                                }
                            }
                            break;
                    }
                    int j5 = sc.nextInt();
                    switch (j5) {
                        case 1:
                            System.out.println("Las opciones de matrices R2 son: ");
                            System.out.println("1. Suma de matrices");
                            System.out.println("2. Resta de matrices");
                            System.out.println("3. Multiplicacion de Matrices");
                            System.out.println("4. Matriz por Escalar");
                            System.out.println("5. Matriz Rotacion");
                    }
                    int j6 = sc.nextInt();
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
                    break;

                case 2:
                    System.out.println("Seleccione una Opcion en R3");
                    System.out.println("1. Vectores");
                    System.out.println("2. Matrices");
                    int j7 = sc.nextInt();
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
                                }
                                case 2: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.resta();
                                }
                                case 3: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.prodpunto();
                                }
                                case 4: {
                                    VectorR3 vectorR3 = new VectorR3();
                                    vectorR3.ProdPorCoeficiente();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("En Matriz R3 tiene las siguientes opciones");
                            System.out.println("1. Suma de Matrices");
                            System.out.println("2. Resta de Matrices");
                            System.out.println("3. Multiplicar Matrices");
                            System.out.println("4. Matriz * Escalar");
                            System.out.println("5. Matriz Rotacion");
                            int j10 = sc.nextInt();
                            switch (j10) {
                                case 1: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.SumarMatriz();
                                }
                                case 2: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.RestaMatriz();
                                }
                                case 3: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.multiplicar();
                                }
                                case 4: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.matrizXescalar();
                                }
                                case 5: {
                                    MatrizR3 matrizR3 = new MatrizR3();
                                    matrizR3.MatrizRotacion();
                                    break;
                                }
                            }
                            break;
                    }
                case 3:
                    System.out.println("Seleccione una opcion en R4");
                    System.out.println("1. Vectores");
                    System.out.println("2. Matriz");
                    int j11 = sc.nextInt();
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
                                }
                                case 2: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.resta();
                                }
                                case 3: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.ProdPunto();
                                }
                                case 4: {
                                    VectorR4 vectorR4 = new VectorR4();
                                    vectorR4.ProdPorCoeficiente();
                                }
                            }
                            break;
                    }
                    int j13 = sc.nextInt();
                    switch (j13) {
                        case 2: {
                            System.out.println("En matrices R4 estan las sogioentes formulas");
                            System.out.println("1. Suma");
                            System.out.println("2. Resta");
                            System.out.println("3. Multiplicacion");
                            System.out.println("4. Escalar * Matriz");
                            System.out.println("5. Matriz Rotacion");
                            int j14 = sc.nextInt();
                            switch (j14) {
                                case 1: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.suma();
                                }
                                case 2: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.resta();
                                }
                                case 3: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.multiplicacion();
                                }
                                case 4: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.EscalarXMatriz();
                                }
                                case 5: {
                                    MatrizR4 matrizR4 = new MatrizR4();
                                    matrizR4.MatrizRotacion();
                                    break;
                                }
                            }
                        }
                    }
            }

        }while (j<5);
}
}


