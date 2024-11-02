package pessoa.funcionario;

import dados.telefone.Telefone;
import pessoa.Pessoa;

public abstract class Funcionario extends Pessoa {

    private Double salario;

    public Funcionario(String nome, String telefone, Double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    protected void setSalario(Double novoSalario) {
        this.salario = novoSalario;

        System.out.printf("~~~ Novo salário registrado: %.2f", this.salario);
    }

    protected Double getSalario() {
        return this.salario;
    }



}
