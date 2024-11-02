package escola;

import dados.endereco.Endereco;
import dados.telefone.Telefone;
import escola.curso.Curso;
import pessoa.aluno.Aluno;
import pessoa.funcionario.Funcionario;
import pessoa.funcionario.professor.Professor;
import pessoa.funcionario.secretaria.Secretaria;

import java.util.ArrayList;

public class Escola {

    private static final String NOME_FIXO = "Escola da Boa";

    private final String nome = NOME_FIXO;
    private Telefone telefone;
    private Endereco endereco;
    private static ArrayList<Curso> cursos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Secretaria> secretarias = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios =new ArrayList<>(professores.size() + secretarias.size());
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        // Teste Alunos
        addNovoAluno("Carlos", "19-94835-3749");
        addNovoAluno("Lucas", "19-7483-1134");
        getImprimirTodosAlunos();

        // Teste Professores
        addProfessor("Marcelo Tavares", "21-38533-5893", 5300.0, "Matemática");
        addProfessor("Nilto Vascontes", "21-83742-1834", 6300.0, "Filosofia");

        getImprimirTodosProfessores();
        imprimirDadosProfessor("Filosofia");



        // Teste Secretaria

        addSecretaria("Antonio Silvera", "85-83913-4853", 8450.0, "Diretor");
        addSecretaria("Marcela Canastra", "43-65822-3845", 7450.0, "Vice-Diretor");
        getImprimirTodosSecretaria();

        // Teste Funcionario

        getImprimirTodosFuncionarios();

        // Teste Curso
        addCurso("Matemática", 65, findProfessorCurso("Matemática"));
        addCurso("Filosofia", 65, findProfessorCurso("Filosofia"));
        Curso cursoBuscado = findCurso("Matemática");
        cursoBuscado.addAlunos(alunos);

        cursoBuscado.listarAlunos();


    }


    public static void addNovoAluno(String nome, String telefone) {
        alunos.add(new Aluno(nome, telefone));
    }

    public static void addCurso(String nome, Integer carga_horaria, Professor professor) {
        cursos.add(new Curso(nome, carga_horaria, professor));
    }

    public static void addProfessor(String nome, String telefone, Double salario, String disciplina) {
        professores.add(new Professor(nome, telefone, salario, disciplina));
    }

    public static void addSecretaria(String nome, String telefone, Double salario, String cargo) {
        secretarias.add(new Secretaria(nome, telefone, salario, cargo));
    }

    public static void getImprimirTodosFuncionarios() {
        funcionarios.addAll(professores);

        funcionarios.addAll(secretarias);

        System.out.println("=== Todos Funcionários ===");

        if(funcionarios.isEmpty()) {
            System.out.println("Ainda não há funcionários cadastrados");
        } else {
            for(Funcionario func : funcionarios) {
                System.out.println("Nome: " + func.getNome() + " - Telefone: " + func.getTelefone().getNumero());
            }
        }
    }

    public static void getImprimirTodosAlunos() {
        System.out.println("=== Listar todos Alunos da Escola ===");

        if(alunos.isEmpty()) {
            System.out.println("Não existem alunos registrados");
            return;
        }

        for (Aluno aluno: alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public static void getImprimirTodosProfessores() {
        System.out.println("=== Listar todos Professores da Escola ===");

        if(professores.isEmpty()) {
            System.out.println("Não existem alunos registrados");
            return;
        }

        for (Professor professor: professores) {
            System.out.println(professor.getNome());
        }
    }


    public static void getImprimirTodosSecretaria() {
        System.out.println("=== Listar todos da Secretaria da Escola ===");

        if(secretarias.isEmpty()) {
            System.out.println("Não existem alunos registrados");
            return;
        }

        for (Secretaria secretaria: secretarias) {
            System.out.println(secretaria.getNome());
        }
    }

    public static Professor findProfessor(String dadosBusca) {
        Professor findProf  = professores.stream()
                .filter( professor -> professor.buscarTodosCampos(professor, dadosBusca))
                .findFirst()
                .orElse(null);

        return findProf;
    }

    public static void imprimirDadosProfessor(String dadosBusca) {
        Professor professor = findProfessor(dadosBusca);

        if(professor == null) {
            System.out.println("Professor não encontrado");
            return;
        }

        System.out.println("=== Dados do Professor " + professor.getNome() + " ===");
        professor.getTodosDados();
    }

    public static Professor findProfessorCurso(String curso) {
        Professor findProfessorCurso;
        findProfessorCurso = professores.stream()
                .filter(professor -> professor.getDisciplina().equals(curso))
                .findFirst()
                .orElse(null);

        return findProfessorCurso;

    }

    public static Curso findCurso(String nome_curso) {
        Curso findCurso;
        findCurso = cursos.stream()
                .filter(professor -> professor.getNome().equals(nome_curso))
                .findFirst()
                .orElse(null);


        return findCurso;

    }

}
