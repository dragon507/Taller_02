package Taller_2;

import java.util.Scanner;

public class problem1 {
    Scanner teclado= new Scanner(System.in);

    int co_are=0;

    public void mostra1(){

        System.out.println(" Introduzca su código de área = ");
        co_are = teclado.nextInt();

        if (co_are==507){
            System.out.println(" Usted es de Panamá(: ");
        }else
            System.out.println("Usted no es de Panamá--> Siga intentando ): ");
    }
}
