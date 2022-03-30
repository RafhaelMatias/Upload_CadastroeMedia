import javax.swing.JOptionPane;

public class Main {
    public static void main (String args []){
        String nome, curso;
        int n1, n2, media, periodo;

//Converte sem a necessidade da variavel auxiliar de string
        nome =(JOptionPane.showInputDialog("Nome completo"));
        curso =(JOptionPane.showInputDialog("Qual seu curso?"));
        periodo =Integer.parseInt(JOptionPane.showInputDialog("Esta em qual período?"));
        n1 =Integer.parseInt(JOptionPane.showInputDialog("Entre com a primeira nota"));
        n2 =Integer.parseInt(JOptionPane.showInputDialog("Entre com a segunda nota"));

//Abre caixa de mensagem com resultados inseridos
        JOptionPane.showMessageDialog(null, "NOME COMPLETO: "+ nome);
        JOptionPane.showMessageDialog(null, "CURSO ATUAL: "+ curso);
        JOptionPane.showMessageDialog(null, "ESTA CURSANDO O PERIODO: "+ periodo);

        media =(n1 + n2) / 2;
        JOptionPane.showMessageDialog(null, "SUA MÉDIA É: "+ media);


        System.exit(0);
    }
    }
