package Taller_2;

import javax.swing.*;
import java.util.Scanner;

public class problem5 {
    Scanner teclado = new Scanner(System.in);

    int opc;

    public void mostra5(){
        while (opc!=11){
            System.out.println();
            System.out.println("----------------------------------------------");
            System.out.println(" 1. CIENCIAS ADMINISTRATIVAS ");
            System.out.println(" 2. CIENCIAS DE LA SALUD  ");
            System.out.println(" 3. Salir ");
            System.out.println("");
            System.out.println("-----------------------------------------------");
            opc = Integer.parseInt(JOptionPane.showInputDialog(" Seleccione una Opción "));

            switch (opc){

                case 1:
                    JOptionPane.showMessageDialog(null," ¡ Has elegido ciencias administrativas ! ");
                    System.out.println("-------------------------------------------------");
                    JOptionPane.showMessageDialog(null,"Estas son las carreras que tenemos para ti :)");
                    System.out.println("-------------------------------------------------");
                    JOptionPane.showMessageDialog(null,"Lic. en Administración de Negocios\n" +
                            "Lic. en Contabilidad\n" +
                            "Lic. en Administración de Recursos Humanos\n" +
                            "Lic. en Banca y Finanzas\n" +
                            "Lic. en Comercio Internacional\n" +
                            "Lic. en Negocios Internacionales\n" +
                            "Lic. en Comportamiento Organizacional y Desarrollo Humano\n" +
                            "Lic. en Ingenieria Comercial\n" +
                            "Lic. en Global Business\n" +
                            "Lic. en Administración de Empresas Turísticas\n" +
                            "Lic. en Mercadeo y Publicidad\n" +
                            "Lic. en Mercadeo y Ventas");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"¡ Has elegido ciencias de la salud !");
                    System.out.println("-------------------------------------------------");
                    JOptionPane.showMessageDialog(null," Estas son las carreras que tenemos para ti :) ");
                    System.out.println("-------------------------------------------------");
                    JOptionPane.showMessageDialog(null,"Doctor en Cirugía Dental\n" +
                            "\n" +
                            "Doctor en Medicina\n" +
                            "\n" +
                            "Lic. en Enfermería\n" +
                            "\n" +
                            "Lic. en Farmacia\n" +
                            "\n" +
                            "Lic. en Nutrición y Dietética\n" +
                            "\n" +
                            "Lic. en Psicología");
                    break;
                    default:
                        JOptionPane.showMessageDialog(null," Intente denuevo ");
            }
        }
    }
}
