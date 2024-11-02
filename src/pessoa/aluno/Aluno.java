package pessoa.aluno;

import dados.endereco.Endereco;
import dados.telefone.Telefone;
import pessoa.Pessoa;

public class Aluno extends Pessoa {

    private static Integer MATRICULA_SEQUENCIAL = 1;

    private Integer matricula;

    public Aluno(String nome, String telefone) {
        super(nome, telefone);
        this.matricula = MATRICULA_SEQUENCIAL++;
    }

    public Integer getMatricula() {
        return matricula;
    }
}
