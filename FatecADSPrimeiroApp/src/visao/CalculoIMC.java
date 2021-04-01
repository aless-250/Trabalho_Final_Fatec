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
public class CalculoIMC {
    public static void main(String[] args) {
        float peso, altura, imc;
        peso = altura = imc = 0;
        
        altura = Float.parseFloat(JOptionPane.showInputDialog("Sua Altura"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Seu Peso"));
        
        imc = peso/(altura * altura);
        
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc,
                                        "Calculo do IMC para as pessoas ",2);
    }



}//fim da classe
