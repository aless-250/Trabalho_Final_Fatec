package visao;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe cirada para...
 * @author Alessandro S Silva
 * @Since Classe criada em &(date) as &(time)
 */
public class CalculadoraOtimizada {

    public static void main(String[] args) {   
        int result;

        JOptionPane.showMessageDialog(null, "A Multiplicação é: " +
            Integer.parseInt(
                JOptionPane.showInputDialog("Digite o primeiro numero: ")
                )                    
                *
                Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o segundo numero: ")
                )  
    );
    }//fim do main   
}//fim da classe
