import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();
        leitor.nextLine(); 

        System.out.println("Quantas aulas você assistiu?:");
        int aulas = leitor.nextInt();
        leitor.nextLine(); 

        System.out.println("Digite seu curso:");
        String curso = leitor.nextLine(); 

        System.out.println("Aluno\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Curso: " + curso + "\n" +
                "Aulas assistidas: " + aulas);

        leitor.close(); 

    }
}
