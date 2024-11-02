import dados.endereco.Endereco;
import dados.telefone.Telefone;
import pessoa.aluno.Aluno;
import pessoa.funcionario.professor.Professor;
import pessoa.funcionario.secretaria.Secretaria;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Claudio", "19-84774-5773");

        // Simula parte do formulário
        a1.getEndereco().setCidade("Campinas");
        a1.getEndereco().setBairro("Campo Belo");
        a1.getEndereco().setLogradouro("Rua 16 de março");
        a1.getEndereco().setNumero(235);
        a1.getEndereco().setEstado("SP");

        Professor p1 = new Professor("Marcelo", "19-85734-5475", 3000.0, "Matemática");

        // Simula parte do formulário
        p1.getEndereco().setCidade("Sumaré");
        p1.getEndereco().setBairro("Bolainus");
        p1.getEndereco().setLogradouro("31 de janeiro");
        p1.getEndereco().setNumero(849);
        p1.getEndereco().setEstado("SP");

        p1.getTodosDados();

        Secretaria s1 = new Secretaria("Antônio", "19-74683-7845", 4000.0, "Diretor");

        // Simula parte do formulário
        s1.getEndereco().setCidade("Indaiatuba");
        s1.getEndereco().setBairro("Jardins");
        s1.getEndereco().setLogradouro("Carmenin do Bololo");
        s1.getEndereco().setNumero(23);
        s1.getEndereco().setEstado("SP");

        s1.getTodosDados();
    }
}
