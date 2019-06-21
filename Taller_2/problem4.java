package Taller_2;

import java.util.Scanner;

public class problem4 {
    Scanner teclado = new Scanner(System.in);

    float desa=0;

    public void mostra4(){

        System.out.println(" Ingrese cuantos años el colaborador a estado desarrolando <---> ");
        desa = teclado.nextFloat();

        if (desa > 6){
            System.out.println(" Usted es un desarrollador de nivel <---> Lead ");
        } else if (desa >=4){
            System.out.println(" Usted es un desarrollador de nivel <---> Senior ");
        } else if (desa >=1 && desa <4){
            System.out.println(" Usted es un desarrollador de nivel <---> Semi-senior ");
        } else if (desa <=0.11 ){
            System.out.println(" Usted es un desarrollador de nivel <---> Junior ");
        }
    }

}
