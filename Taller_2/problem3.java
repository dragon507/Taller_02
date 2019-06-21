package Taller_2;

import javax.swing.*;
import java.util.Scanner;

public class problem3 {
    Scanner teclado = new Scanner(System.in);


    char letra= JOptionPane.showInputDialog("digite una letra").charAt(0);
    public void mostra3(){
        if (letra == 'a'||letra =='e'||letra=='i'||letra=='o'||letra=='u'){
            JOptionPane.showMessageDialog(null," La vocal que legiste es : " + letra);
        } else
            JOptionPane.showMessageDialog(null," No es una vocal ");

    }
}
