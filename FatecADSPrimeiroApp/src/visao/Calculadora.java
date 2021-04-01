package visao;


//Sessão de importação
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para...
 * @author Alessandro S Silva
 * 
 */
public class Calculadora {
    public static void main(String[] args) {
        String numA, numB;
        int a, b, soma, multi, sbtr;
        float div;
        
        numA = JOptionPane.showInputDialog(null,"Digite o Valor de A: ", "Calculadora", 3);
        numB = JOptionPane.showInputDialog(null, "Digite o Valor de B: ", "Calculadora", 3);
        
        a = Integer.parseInt(numA);
        b = Integer.parseInt(numB);
        
        soma = a + b;
        multi = a * b;
        sbtr = a - b;
        div = (float) a / b; //Necessita do casting para o float
           
       /* System.out.println("A Soma " +a+ " Mais " +b+ " é Igual a " +soma);
        System.err.println("A Multiplicação de " +a+ " Vezes " +b+ " é Igual a " +multi);
        System.out.println("A Divisão de " +a+ " por " +b+ " é Igual a " +div);
        System.out.println("A Subtração de " +a+ " Menos " +b+ " é Igual a " +sbtr);
       */
        JOptionPane.showMessageDialog(null, "O Resultado é: " +soma, "Calc Soma", 2);
        JOptionPane.showMessageDialog(null, "A Soma " +a+ " Mais " +b+ " é Igual a " +soma, "Calc Soma2", 2);
        JOptionPane.showMessageDialog(null, "A Multiplicação de " +a+ " Vezes " +b+ " é Igual a " +multi, "Calc Multiplicação", 2);
        JOptionPane.showMessageDialog(null, "A Subtração de " +a+ " Menos " +b+ " é Igual a " +sbtr, "Calc Subtração", 2);
        JOptionPane.showMessageDialog(null, "O Soma " +a+ " Mais " +b+ " é Igual a " +soma +
                                            "\nA Multiplicação de " +a+ " Vezes " +b+ " é Igual a " +multi+
                                            "\nA Subtração de " +a+ " Menos " +b+ " é Igual a " +sbtr, "Calculos",2); 
        /*  Parametros de entrada para GUI's de Caixa de Dialogo
            GUI - Graphical User Inteface
            JOptionPane.ShowMessageDialog(1, 2, 3, 4);
            
        */
        
    }//fim do main

    
}//fim da classe
