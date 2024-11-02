package pessoa.funcionario.professor;

import pessoa.funcionario.Funcionario;

import java.lang.reflect.Field;

public class Professor extends Funcionario {

    private String disciplina;

    public Professor(String nome, String telefone, Double salario, String disciplina) {
        super(nome, telefone, salario);
        this.setDisciplina(disciplina);
    }

    @Override
    protected Double getSalario() {
        return super.getSalario();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void getTodosDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone().getNumero());
        System.out.printf("Salário: %.2f\n", this.getSalario());
        super.getEndereco().getEnderecoCompleto();
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("----------------------------------------------------");
    }

    public boolean buscarTodosCampos(Professor professor, String dadosBusca) {

        for(Field field: professor.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(professor);

                if(value != null && value.toString().equalsIgnoreCase(dadosBusca)) {
                    return true;
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
