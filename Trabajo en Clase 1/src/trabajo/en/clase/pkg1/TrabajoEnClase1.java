/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.en.clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author joeds
 */
public class TrabajoEnClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //joed sosa codigo
   //Un programa en el cual ingresamos el numero de mes 
   //(valores entre1 y 12) y un año y en base a eso calcula el numero de días de ese mes. ​
    Scanner cathy = new Scanner(System.in);
        System.out.println("Ingrese el mes que desea ");
        int m = cathy.nextInt();
        System.out.println("Ingrese el año que desea ");
        int a = cathy.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Consta de 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Consta de 30 dias");
                break;
            case 2:
                int bisi = a % 4;
                if (bisi == 0) {
                    System.out.println("Consta de 29 dias");
                } else {
                    System.out.println(" Consta de 28 dias");
                }
                break;
            default:
                System.out.println("****No valido ****");
        }
    }
}

