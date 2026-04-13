import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();

                    Aluno aluno = new Aluno(nome, idade, curso, nota);
                    alunos.add(aluno);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (Aluno a : alunos) {
                        if (a.getNome().equalsIgnoreCase(busca)) {
                            System.out.println(a);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome para remover: ");
                    String remover = sc.nextLine();

                    alunos.removeIf(a -> a.getNome().equalsIgnoreCase(remover));
                    System.out.println("Remoção concluída (se existia).");
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}