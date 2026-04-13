public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double nota;

    public Aluno() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.curso = "Não definido";
        this.nota = 0.0;
    }

    public Aluno(String nome, int idade, String curso, double nota) {
        setNome(nome);
        setIdade(idade);
        setCurso(curso);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("Curso inválido!");
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida! (0 a 10)");
        }
    }

    public boolean isAprovado() {
        return nota >= 6;
    }

    public String getStatus() {
        return isAprovado() ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "----------------------" +
               "\nNome: " + nome +
               "\nIdade: " + idade +
               "\nCurso: " + curso +
               "\nNota: " + nota +
               "\nStatus: " + getStatus();
    }
}