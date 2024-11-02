package pessoa;

import dados.endereco.Endereco;
import dados.telefone.Telefone;

public abstract class Pessoa {

    protected String nome;
    protected Telefone telefone = new Telefone();
    protected Endereco endereco = new Endereco();


    public Pessoa(String nome, String addTelefone) {
        this.nome = nome;
        this.telefone.setNumero(addTelefone);
    }

    public String getNome() {
        return this.nome;
    }

    public Telefone getTelefone() {
        return this.telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }


}
