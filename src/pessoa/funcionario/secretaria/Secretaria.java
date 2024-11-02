package pessoa.funcionario.secretaria;

import dados.telefone.Telefone;
import pessoa.funcionario.Funcionario;

public class Secretaria extends Funcionario {

    private String cargo;

    public Secretaria(String nome, String telefone, Double salario, String cargo) {
        super(nome, telefone, salario);
        setCargo(cargo);
    }

    @Override
    protected Double getSalario() {
        return super.getSalario();
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String novoCargo) {
        if(this.cargo != null) {
            System.out.println("Novo cargo atribuido: " + this.cargo);
        }
        this.cargo = novoCargo;

    }

    public void getTodosDados() {
        System.out.println("=== Dados da Secretaria ===");
        System.out.println("Nome: " + super.getNome());
        System.out.printf("Salário: %.2f\n", this.getSalario());
        super.getEndereco().getEnderecoCompleto();
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("----------------------------------------------------");
    }
}
