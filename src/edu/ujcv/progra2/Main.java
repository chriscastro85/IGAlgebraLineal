package edu.ujcv.progra2;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;
import edu.ujcv.progra2.matriz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        int Rep;
        do{
            System.out.println("que desea calcular");
            System.out.println("Presione 1 para calcular vectores");
            System.out.println("Presione 2 para calcular matrices");
            System.out.println("presione 3 para salir del programa");
            int rep = sc.nextInt();
            Rep = rep;

            if (Rep == 1) {
                System.out.println("presione 1 para calcular Vector en R2");
                System.out.println("presione 2 para calcular Vector en R3 ");
                System.out.println("presione 3 para calcular Vector en R4");
                int TipoVec = sc.nextInt();
                if (TipoVec == 1) {
                    System.out.println("presione 1 para calcular suma en R2");
                    System.out.println("presione 2 para calcular resta en R2");
                    System.out.println("presione 3 para calcular escalarPorVector R2");
                    System.out.println("presione 4 para calcular productoPunto en R2");
                    System.out.println("presione 5 para calcular magnitud en R2");
                    System.out.println("presione 6 para calcular angulo en R2");
                    int operaVec = sc.nextInt();
                    if (operaVec == 1) {

                        IGVecR2 a = new IGVecR2();
                        System.out.println("ingrese los componentes del primer vector");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("ingrese las componentes del segundo vector");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        IGVecR2 x = a.suma(b);
                        IGVecR2 y = a.suma(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.println("," + y.getY());

                    }
                    if (operaVec == 2) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("ingrese las componentes del primer vector");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("ingrese las componentes del segundo vector");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        IGVecR2 x = a.resta(b);
                        IGVecR2 y = a.resta(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.println("," + y.getY());

                    }
                    if (operaVec == 3) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese X1 y Y1");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        System.out.println("ingrese Alpha");
                        double alpha = sc.nextDouble();
                        IGVecR2 Resul = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ")\n");
                    }
                    if (operaVec == 4) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("ingrese las componentes del  primer vector");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("ingrese los componentes del segundo vector");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        double x = a.productoPunto(b);
                        double y = a.productoPunto(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.println("," + y);
                    }
                    if (operaVec == 5) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        double x = a.magnitud(b);
                        double y = a.magnitud(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.println("," + y);

                    }
                    if (operaVec == 6) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        double x = a.angulo(b);
                        double y = a.angulo(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.println("," + y);
                    }

                }


                if (TipoVec == 2) {
                    System.out.println("presione 1 para calcular suma en R3");
                    System.out.println("presione 2 para calcular resta en R3");
                    System.out.println("presione 3 para calcular escalarPorVector R3");
                    System.out.println("presione 4 para calcular productoPunto en r3");
                    System.out.println("presione 5 para calcular producto cruz en R3");
                    System.out.println("presione 6 para calcular magnitud en R3");
                    System.out.println("presione 7 para calcular angulo en R3");

                    int operaVec = sc.nextInt();
                    if (operaVec == 1) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("ingrese los componentes");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("ingrese las componentes");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR3 x = a.suma(b);
                        IGVecR3 y = a.suma(b);
                        IGVecR3 z = a.suma(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.print("," + y.getY());
                        System.out.println("," + z.getZ());

                    }
                    if (operaVec == 2) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR3 x = a.resta(b);
                        IGVecR3 y = a.resta(b);
                        IGVecR3 z = a.resta(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.print("," + y.getY());
                        System.out.println("," + z.getZ());
                    }
                    if (operaVec == 3) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese X1 y Y1 y Z1");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        System.out.println("ingrese Alpha");
                        double alpha = sc.nextDouble();
                        IGVecR3 Resul = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ", " + Resul.getZ() + ")\n");

                    }
                    if (operaVec == 4) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        double x = a.productoPunto(b);
                        double y = a.productoPunto(b);
                        double z = a.productoPunto(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.print("," + y);
                        System.out.println("," + z);
                    }
                    if (operaVec == 5) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("ingrese los componentes");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("ingrese las componentes");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR3 x = a.productoCruz(b);
                        IGVecR3 y = a.productoCruz(b);
                        IGVecR3 z = a.productoCruz(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.print("," + y.getY());
                        System.out.println("," + z.getZ());
                    }
                    if (operaVec == 6) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        double x = a.magnitud(b);
                        double y = a.magnitud(b);
                        double z = a.magnitud(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.print("," + y);
                        System.out.println("," + z);
                    }
                    if (operaVec == 7) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        double x = a.angulo(b);
                        double y = a.angulo(b);
                        double z = a.angulo(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.print("," + y);
                        System.out.println("," + z);


                    }


                }

                if (TipoVec == 3) {
                    System.out.println("presione 1 para calcular suma en R4");
                    System.out.println("presione 2 para calcular resta en R4");
                    System.out.println("presione 3 para calcular escalarPorVector R4");
                    System.out.println("presione 4 para calcular productoPunto en R4");
                    System.out.println("presione 5 para calcular magnitud en R4");
                    System.out.println("presione 6 para calcular angulo en R4");
                    int operaVec = sc.nextInt();

                    if (operaVec == 1) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("ingrese los componentes");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        a.setw(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        b.setw(sc.nextDouble());
                        IGVecR4 x = a.suma(b);
                        IGVecR4 y = a.suma(b);
                        IGVecR4 z = a.suma(b);
                        IGVecR4 w = a.suma(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.print("," + y.getY());
                        System.out.print("," + z.getZ());
                        System.out.println("," + w.getw());
                    }
                    if (operaVec == 2) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        a.setw(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        b.setw(sc.nextDouble());
                        IGVecR4 x = a.resta(b);
                        IGVecR4 y = a.resta(b);
                        IGVecR4 z = a.resta(b);
                        IGVecR4 w = a.resta(b);
                        System.out.println("Su resultado es");
                        System.out.print(x.getX());
                        System.out.print("," + y.getY());
                        System.out.print("," + z.getZ());
                        System.out.println("," + w.getw());
                    }
                    if (operaVec == 3) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("Ingrese X1 y Y1 y Z1 y W1");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        a.setw(sc.nextDouble());
                        System.out.println("ingrese Alpha");
                        double alpha = sc.nextDouble();
                        IGVecR4 Resul = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ", " + Resul.getZ() + ", " + Resul.getw() + ")\n");
                    }
                    if (operaVec == 4) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        a.setw(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        b.setw(sc.nextDouble());
                        double x = a.productoPunto(b);
                        double y = a.productoPunto(b);
                        double z = a.productoPunto(b);
                        double w = a.productoPunto(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.print("," + y);
                        System.out.print("," + z);
                        System.out.println("," + w);
                    }
                    if (operaVec == 5) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        a.setw(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        b.setw(sc.nextDouble());
                        double x = a.magnitud(b);
                        double y = a.magnitud(b);
                        double z = a.magnitud(b);
                        double w = a.magnitud(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.print("," + y);
                        System.out.print("," + z);
                        System.out.println("," + w);
                    }
                    if (operaVec == 6) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("ingrese las variables");
                        a.setx(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        a.setw(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("ingrese las variables");
                        b.setx(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        b.setw(sc.nextDouble());
                        double x = a.angulo(b);
                        double y = a.angulo(b);
                        double z = a.angulo(b);
                        double w = a.angulo(b);
                        System.out.println("Su resultado es");
                        System.out.print(x);
                        System.out.print("," + y);
                        System.out.print("," + z);
                        System.out.println("," + w);
                    }
                }
            }
            if (Rep == 2) {
                System.out.println("presione 1 para calcular Matrices en R2");
                System.out.println("presione 2 para calcular Matrices en R3 ");
                System.out.println("presione 3 para calcular Matrices en R4");
                int TipoMat = sc.nextInt();
                if (TipoMat == 1) {
                    System.out.println("presione 1 para calcular  en R2");
                    System.out.println("presione 2 para calcular  en R2");
                    System.out.println("presione 3 para calcular  en R2");
                    System.out.println("presione 4 para calcular  en R2");
                    System.out.println("presione 5 para calcular  en R2");
                    System.out.println("presione 6 para calcular  en R2");
                    int operaMat = sc.nextInt();
                    if (operaMat == 1) {
                    }
                    if (operaMat == 2) {
                    }
                    if (operaMat == 3) {
                    }
                    if (operaMat == 4) {
                    }
                    if (operaMat == 5) {
                    }
                    if (operaMat == 6) {
                    }
                }

                if (TipoMat == 2) {
                    System.out.println("presione 1 para calcular  en R3");
                    System.out.println("presione 2 para calcular  en R3");
                    System.out.println("presione 3 para calcular  en R3");
                    System.out.println("presione 4 para calcular  en R3");
                    System.out.println("presione 5 para calcular  en R3");
                    System.out.println("presione 6 para calcular  en R3");
                    int operaMat = sc.nextInt();
                    if (operaMat == 1) {
                    }
                    if (operaMat == 2) {
                    }
                    if (operaMat == 3) {
                    }
                    if (operaMat == 4) {
                    }
                    if (operaMat == 5) {
                    }
                    if (operaMat == 6) {
                    }
                }
                if (TipoMat == 3) {
                    System.out.println("presione 1 para calcular  en R4");
                    System.out.println("presione 2 para calcular  en R4");
                    System.out.println("presione 3 para calcular  en R4");
                    System.out.println("presione 4 para calcular en R4");
                    System.out.println("presione 5 para calcular  en R4");
                    System.out.println("presione 6 para calcular  en R4");
                    int operaMat = sc.nextInt();

                    if (operaMat == 1) {
                    }
                    if (operaMat == 2) {
                    }
                    if (operaMat == 3) {
                    }
                    if (operaMat == 4) {
                    }
                    if (operaMat == 5) {
                    }
                    if (operaMat == 6) {
                    }
                }

            }


        } while (Rep != 3);
        System.out.println("Esta Finalizando el programa");
    }