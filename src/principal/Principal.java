package principal;

import clases.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Felipe Cuevas - Relator Edutecno
 */
public class Principal {

    public static void main(String[] args) {
        Integer op = 0;
        ArrayList<Departamento> arrayD = new ArrayList<Departamento>();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("MENU - MINERA LOS PELAMBRES");
            System.out.println("----------------------------------------");
            System.out.println("1) Ingresar datos de un departamento.");
            System.out.println("2) Mostrar todos los departamentos y sus integrantes.");
            System.out.println("3) Calcular y mostrar los sueldos líquidos de todo un departamento.");
            System.out.println("4) Mostrar estadísticas de los jefes y supervisores.");
            System.out.println("5) Guardar la información de todos los departamentos en un fichero.");
            System.out.println("6) Salir.");
            System.out.println("Ingrese su opción: ");
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    Departamento d = new Departamento();
                    arrayD.add(d);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while (op >= 0 && op <= 6);
    }

}
