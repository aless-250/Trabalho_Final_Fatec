package classe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe cirada para instanciar um objeto do tipo Pessoa
 * @author Alessandro S Silva
 * @Since Classe criada em &(date) as &(time)
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    
    //Metodo para construir um objeto na memoria (Construtor)
    public Pessoa(String n, int i, float a){
        nome = n;
        idade = i;
        altura = a;       
    }
    
    //Metodo para exibir os dados de uma Pessoa na tela
    public void exibirPessoa(){
        System.out.println("Nome:   " + nome);
        System.out.println("Idade:  " + idade);
        System.out.println("Altura: " + altura);
    }
}//fim da classe
