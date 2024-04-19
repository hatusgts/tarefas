import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela Teste");
        janela.setSize(500, 800);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel rotulo = new JLabel("Olá, mundo!");

        janela.add(rotulo);
        janela.setVisible(true);
        janela.setLayout(new BorderLayout());

        JPanel painelCabecalho = new JPanel();

        janela.add(painelCabecalho, BoxLayout.X_AXIS);
        
        JButton botão1 = new JButton("Botão para morrer");

        painelCabecalho.add(botão1);
        
        botão1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(botão1, "Você pressionou o botão!");
            }
        });

        painelCabecalho.add(botão1);
        janela.add(janela);        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
