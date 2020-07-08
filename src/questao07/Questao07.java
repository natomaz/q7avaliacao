package questao07;

import javax.swing.JOptionPane;

public class Questao07 {
    public static void main(String[] args) {
        //Crie um algoritmo que leia um número inteiro e mostre como resultado o dobro de um número caso ele seja positivo 
        //e o seu triplo caso seja negativo, mostre o resultado.
        int algoritmo, r1, r2;
        
        //dados
        algoritmo = Integer.parseInt(JOptionPane.showInputDialog("Inserir número inteiro:"));
        
        //processamento e saida
        if (algoritmo % 2 != 0) {r1 = algoritmo * 3; JOptionPane.showMessageDialog(null, "Resultado: "+r1);}
        else {r2 = algoritmo * 2; JOptionPane.showMessageDialog(null, "Resultado: "+r2);}
                
    }
    
}
