package br.com.Class;


public class cad_validaEnderecoUsuario {
    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;

    //valida cep online
    public String validaCEP(String cep) {
        String url = "http://viacep.com.br/ws/" + cep + "/json/";
        String resposta = "";
        try {
            resposta = new java.net.URL(url).openStream().toString();
        } catch (Exception e) {
            System.out.println("Erro ao conectar no site");
        }
        return resposta;
    }

    //converte json para objeto
    public void converteJson(String json) {
        String[] dados = json.split(",");
        for (int i = 0; i < dados.length; i++) {
            String[] dados2 = dados[i].split(":");
            if (dados2[0].equals("\"cep\"")) {
                this.cep = dados2[1].replace("\"", "");
            }
            if (dados2[0].equals("\"logradouro\"")) {
                this.rua = dados2[1].replace("\"", "");
            }
            if (dados2[0].equals("\"complemento\"")) {
                this.complemento = dados2[1].replace("\"", "");
            }
            if (dados2[0].equals("\"bairro\"")) {
                this.bairro = dados2[1].replace("\"", "");
            }
            if (dados2[0].equals("\"localidade\"")) {
                this.cidade = dados2[1].replace("\"", "");
            }
            if (dados2[0].equals("\"uf\"")) {
                this.estado = dados2[1].replace("\"", "");
            }
        }
    }

    //getters and setters
    public String getCep() {
        System.out.println("digite seu cep");
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
