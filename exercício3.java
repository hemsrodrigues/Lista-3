//3. Construa um programa que leia duas notas de um aluno e calcule a média. 
//Se a media for igual ou superior a 6 mostre “aprovado”, senão mostre “reprovado”.
package ldp3IfElse;

import javax.swing.JOptionPane;

public class exercício3 {
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
