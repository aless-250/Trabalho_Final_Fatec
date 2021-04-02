package visao;

import java.util.Date;

/**
 * Classe cirada para ser a classe na geração de objetos do tipo ClientePJ
 * que será manipulado em memoria.
 * @author Alessandro S Silva
 * @Since Classe criada em 02/04/2021 as 15:55
 */

public class ClientePJ {
    private String razaosocial;
    private Date inauguracao;
    private String endereço;
    private int numeroEndereço;
    private String cidade;
    private String uf;
    private String cnpj;
    private String sexo;
    private float renda;
    private boolean leitura;
    private boolean futebol;
    private boolean pescaria;
    private boolean danca;
    private boolean vedeogame;
    private boolean dança;
    private boolean corrida;
    private boolean cozinhar;
    private boolean musica;
    
    //Metodo Construtor - responsavel por criar uma instancia na memoria
    public ClientePJ(){
        //Construtor vazio;
     
    }//fim da instancia cliente

    public ClientePJ(String razaosocial, Date inauguracao, String endereço, int numeroEndereço, String cidade, 
            String uf, String cnpj, String sexo, float renda, boolean leitura, boolean futebol, boolean pescaria, 
            boolean danca, boolean vedeogame, boolean dança, boolean corrida, boolean cozinhar, boolean musica) {
        
        this.razaosocial = razaosocial;
        this.inauguracao = inauguracao;
        this.endereço = endereço;
        this.numeroEndereço = numeroEndereço;
        this.cidade = cidade;
        this.uf = uf;
        this.cnpj = cnpj;
        this.sexo = sexo;
        this.renda = renda;
        this.leitura = leitura;
        this.futebol = futebol;
        this.pescaria = pescaria;
        this.danca = danca;
        this.vedeogame = vedeogame;
        this.dança = dança;
        this.corrida = corrida;
        this.cozinhar = cozinhar;
        this.musica = musica;
    } //fim do metodo construtor
    
    //Metodo assessores
    // Set & Get
    // Set (setar) - para guardar a informacao no atributo (instancia) 
    // Get (pegar) - a informacao de um atributo (instancia)

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public Date getInauguracao() {
        return inauguracao;
    }

    public void setInauguracao(Date inauguracao) {
        this.inauguracao = inauguracao;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumeroEndereço() {
        return numeroEndereço;
    }

    public void setNumeroEndereço(int numeroEndereço) {
        this.numeroEndereço = numeroEndereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public boolean isLeitura() {
        return leitura;
    }

    public void setLeitura(boolean leitura) {
        this.leitura = leitura;
    }

    public boolean isFutebol() {
        return futebol;
    }

    public void setFutebol(boolean futebol) {
        this.futebol = futebol;
    }

    public boolean isPescaria() {
        return pescaria;
    }

    public void setPescaria(boolean pescaria) {
        this.pescaria = pescaria;
    }

    public boolean isDanca() {
        return danca;
    }

    public void setDanca(boolean danca) {
        this.danca = danca;
    }

    public boolean isVedeogame() {
        return vedeogame;
    }

    public void setVedeogame(boolean vedeogame) {
        this.vedeogame = vedeogame;
    }

    public boolean isDança() {
        return dança;
    }

    public void setDança(boolean dança) {
        this.dança = dança;
    }

    public boolean isCorrida() {
        return corrida;
    }

    public void setCorrida(boolean corrida) {
        this.corrida = corrida;
    }

    public boolean isCozinhar() {
        return cozinhar;
    }

    public void setCozinhar(boolean cozinhar) {
        this.cozinhar = cozinhar;
    }

    public boolean isMusica() {
        return musica;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }
    
}//fim da classe
