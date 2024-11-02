package escola.curso;

import pessoa.aluno.Aluno;
import pessoa.funcionario.professor.Professor;

import java.util.ArrayList;
import java.util.Iterator;

public class Curso {

    private String nome;
    private ArrayList<Aluno> alunos_inscritos = new ArrayList<>();
    private Integer carga_horaria;
    private Professor professor;

    public Curso(String nome, Integer carga_horaria, Professor professor) {
        setNome(nome);
        setCarga_horaria(carga_horaria);
        setProfessor(professor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Integer carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAlunos(ArrayList<Aluno> alunos) {

        for(Aluno aluno: alunos ) {
            this.alunos_inscritos.add(new Aluno(aluno.getNome(), aluno.getTelefone().getNumero()));
        }
    }

    public void listarAlunos() {
        if(this.alunos_inscritos.isEmpty()) {
            System.out.println("Este curso ainda não possuí alunos inscritos");
        } else {
                System.out.println("=== Alunos do Curso: " + getNome() + " ===");
            for (Aluno aluno : alunos_inscritos) {
                System.out.println("Nome: " + aluno.getNome() + "- Matrícula: " + aluno.getMatricula());
            }
        }
    }

    public void removerAluno(Aluno aluno) {
        if(this.alunos_inscritos.isEmpty()) {
            System.out.println("Este curso ainda não possuí alunos inscritos");
        } else {
            alunos_inscritos.remove(aluno);
        }
    }


}
