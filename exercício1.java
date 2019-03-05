//Construa um programa que leia dois números inteiros e mostre o maior entre eles.
package ldp3IfElse;

import javax.swing.JOptionPane;

public class exercício1 {
     public static void main(String[] args) {
         
         int num;
         String dado;
         
         dado = JOptionPane.showInputDialog("Digite um número:");
         num= Integer.parseInt(dado);
         
             if(num>10) {
                JOptionPane.showMessageDialog(null,("Número maior:")+num);
            } else{
                JOptionPane.showMessageDialog(null,("Número menor:")+num);
             }
     }
    
}
