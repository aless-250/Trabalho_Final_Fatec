package classe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe cirada para instanciar objeto na memoria
 * @author Alessandro S Silva
 * @Since Classe criada em &(date) as &(time)
 */
public class GeraPessoa {
    public static void main(String[] args) {
        Pessoa x; // cria um espaço na memoria para receber os dados de um obj Pessoa
        x = new Pessoa("Pedro Paulo", 34, 1.78f);//instanciação do obj do tipo Pessoa
        x.exibirPessoa();
        
        Pessoa p = new Pessoa("Mariana Maria", 54, 1.63f);
        p.exibirPessoa();
        //objetos da memoria Pedro Paulo e Mariana
        // x e p são reserva de espaço na memoria, variavel de referencia
        Pessoa n = new Pessoa("José Maria", 66, 2.13f);
        n.exibirPessoa();
        
    }//fim do main

}//fim da classe
