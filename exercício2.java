//Construa um programa que leia dois números inteiros (A e B) e diga se eles são iguais, 
//ou se A é o maior, ou se B é o maior.
package ldp3IfElse;

import javax.swing.JOptionPane;

public class exercício2 {
        public static void main(String[] args) {
         
         int A; 
         int B;
         String dado;
         
         dado = JOptionPane.showInputDialog("Digite o valor de A:");
         A= Integer.parseInt(dado);
         dado = JOptionPane.showInputDialog("Digite o valor de B:");
         B= Integer.parseInt(dado);
                  
         if(A==B) {
                JOptionPane.showMessageDialog(null,"São iguais");
               }   
            else if (A>B) {
                JOptionPane.showMessageDialog(null,"A é Maior");
            } else{
                JOptionPane.showMessageDialog(null,"B é Maior");
             }
              
        }             
}
