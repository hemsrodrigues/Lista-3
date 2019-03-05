//Escreva um algoritmo que leia três valores e mostre a soma destes valores 
//somente se pelo menos um destes valores for negativo ou igual a zero.
package ldp3IfElse;

import javax.swing.JOptionPane;

public class exercício4 {
    public static void main(String[] args) {
      
         float valor1; 
         float valor2;
         float valor3;
         String dado;
         
         dado = JOptionPane.showInputDialog("Digite o 1º número:");
         valor1= Float.parseFloat(dado);
         
         dado = JOptionPane.showInputDialog("Digite o 2º número:");
         valor2= Float.parseFloat(dado);
         
         dado = JOptionPane.showInputDialog("Digite o 3º número:");
         valor3= Float.parseFloat(dado);
         
         float soma=(valor1+valor2+valor3);
         
         if (valor1<=0|valor2<=0|valor3<=0) {
                JOptionPane.showMessageDialog(null,"A soma é:"+soma);
               } else{
                JOptionPane.showMessageDialog(null,"Algo de errado não está certo...");
             }
    }
         
}
