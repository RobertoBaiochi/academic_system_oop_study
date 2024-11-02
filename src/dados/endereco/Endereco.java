package dados.endereco;

public class  Endereco {

    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void getEnderecoCompleto() {
        System.out.println("Logradouro: " + logradouro + ", Nº: " +  numero + " - " + bairro + ", " + cidade + " - " + estado);
    }
}
