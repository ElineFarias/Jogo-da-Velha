
package jogo_da_velha;

/**
 *
 * @author Eline Farias
 */
import javax.swing.JFrame;
public class Jogo_da_Velha extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo Tela = new Jogo();
        Tela.setBounds(300, 80, 550, 450);
        Tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Tela.setResizable(false);
    }
    
}
