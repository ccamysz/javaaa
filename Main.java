import java.util.Scanner;

class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private int aulas;

    public Aluno(String nome, int idade, String curso, int aulas) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.aulas = aulas;
    }

    public void exibirInformacoes() {
        System.out.println("\nAluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Aulas assistidas: " + aulas);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();
        leitor.nextLine(); 

        System.out.println("Digite seu curso:");
        String curso = leitor.nextLine();

        System.out.println("Quantas aulas você assistiu?:");
        int aulas = leitor.nextInt();

        Aluno aluno = new Aluno(nome, idade, curso, aulas);

        aluno.exibirInformacoes();

        leitor.close();
    }
}
