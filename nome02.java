import javax.swing.JOptionPane;

public class nome02 {
    public static void main(String[]args){
        String nome = JOptionPane.showInputDialog("digite seu nome:");
        JOptionPane.showMessageDialog(null, "nome:" + nome);
        System.out.println(nome);
    }
}