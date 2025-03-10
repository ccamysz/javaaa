import java.time.LocalTime;
import java.util.Scanner;

public class bomdia {
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        

        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();

        String saudacao;
        if (hora >= 6 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        System.out.println(saudacao + ", " + nome + "!");
    }
}
