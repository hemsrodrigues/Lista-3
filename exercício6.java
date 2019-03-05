//6. Escreva um algoritmo que leia o percentual de faltas e duas notas de aluno, 
//calcule a média e mostre a mensagem aprovado, 
//se o aluno obtiver média maior ou igual a 6 com menos de 20% de faltas.
package ldp3IfElse;

import javax.swing.JOptionPane;

public class exercício6 {
    
    public static void main(String[] args) {
         
         float media1; 
         float media2;
         float nota;
         String dado;
         
         dado = JOptionPane.showInputDialog("Digite a 1ª média:");
         media1= Float.parseFloat(dado);
         
         dado = JOptionPane.showInputDialog("Digite a 2ª média:");
         media2= Float.parseFloat(dado);
         
         nota= (media1 + media2/2);
         
         if(nota>=6) {
                JOptionPane.showMessageDialog(null,"Aprovado, média="+nota);
               } else{
                JOptionPane.showMessageDialog(null,"Reprovado, média="+nota);
             }
         
         
    }
    
}
