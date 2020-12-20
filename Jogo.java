
package jogo_da_velha;

/**
 *
 * @author Eline Farias
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
public class Jogo extends JFrame{
   private final JButton[][] Botoes;
   private final JPanel PainelJogo;
   private int vezJogador = 0;
   private String Simbolo;
   private final JLabel jogador1;
   private final JLabel jogador2;
   private final JLabel Lpnt1;
   private final JLabel Lpnt2;
   private final JLabel aux1;
   private final JLabel aux2;
   private final JLabel aux3;
   private final JLabel aux4;
   private final JLabel aux5;
   private int pnt1 = 0;
   private int pnt2 = 0;
   private final JLabel vez;
   private final JButton novo;
   
    
    public Jogo(){
        super("JOGO DA VELHA");
        PainelJogo = new JPanel(new BorderLayout( ));
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension n = tk.getScreenSize();
        add(PainelJogo);
        setVisible(true);
        PainelJogo.setLayout(new GridLayout(7,3,5,5));
        Botoes = new JButton[3][3]; 
        vez = new JLabel("Vez do Jogador 1");
        jogador1 = new JLabel();
        jogador1.setText("Jogador 1");
        PainelJogo.add(jogador1);
        
        
        Lpnt1 = new JLabel();
        Lpnt1.setText("0");
        PainelJogo.add(Lpnt1);
        
        aux1 = new JLabel();
        PainelJogo.add(aux1);
        
        
        jogador2 = new JLabel();
        jogador2.setText("Jogador 2");
        PainelJogo.add(jogador2);
       
        
       
        Lpnt2 = new JLabel();
        Lpnt2.setText("0"); 
        PainelJogo.add(Lpnt2);
        
        aux2 = new JLabel();
        PainelJogo.add(aux2);
        
        aux4 = new JLabel();
        PainelJogo.add(aux4);
        
        PainelJogo.add(vez);    
        
        aux5 = new JLabel();
        PainelJogo.add(aux5);
        
        
          for(int i = 0; i< 3; i++){
            for(int j = 0;j<3;j++){
            Botoes[i][j]= new JButton("");
            
        }
        }
          
          
        
        
        Botoes[0][0].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[0][0].addActionListener((ActionEvent e) -> {
            Jogada(0,0);
        });
        PainelJogo.add(Botoes[0][0]);
         Botoes[0][0].setPreferredSize(new Dimension(11,110));
        
        Botoes[0][1].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[0][1].addActionListener((ActionEvent e) -> {
            Jogada(0,1);
        });
        PainelJogo.add(Botoes[0][1]);
        Botoes[0][1].setPreferredSize(new Dimension(110, 110));
        
        Botoes[0][2].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[0][2].addActionListener((ActionEvent e) -> {
            Jogada(0,2);
        });
        PainelJogo.add(Botoes[0][2]);
        Botoes[0][2].setPreferredSize(new Dimension(110,110));
        
        Botoes[1][0].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[1][0].addActionListener((ActionEvent e) -> {
            Jogada(1,0);
        });
        PainelJogo.add(Botoes[1][0]);
        Botoes[1][0].setPreferredSize(new Dimension(110, 110));
        
        Botoes[1][1].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[1][1].addActionListener((ActionEvent e) -> {
            Jogada(1,1);
        });
        PainelJogo.add(Botoes[1][1]);
        Botoes[1][1].setPreferredSize(new Dimension(110,110));
        
        Botoes[1][2].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[1][2].addActionListener((ActionEvent e) -> {
            Jogada(1,2);
        });
        PainelJogo.add(Botoes[1][2]);
        Botoes[1][2].setPreferredSize(new Dimension(110,110));
        
        Botoes[2][0].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[2][0].addActionListener((ActionEvent e) -> {
            Jogada(2,0);
        });
        PainelJogo.add(Botoes[2][0]);
        Botoes[2][0].setPreferredSize(new Dimension(110, 110));
        
        Botoes[2][1].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[2][1].addActionListener((ActionEvent e) -> {
            Jogada(2,1);
        });
        PainelJogo.add(Botoes[2][1]);
        Botoes[2][1].setPreferredSize(new Dimension(110,110));
        
        
        
        Botoes[2][2].setFont(new Font("ArialBlack", Font.BOLD,70));
        Botoes[2][2].addActionListener((ActionEvent e) -> {
            Jogada(2,2);
        });
        PainelJogo.add(Botoes[2][2]);  
        Botoes[2][2].setPreferredSize(new Dimension(110,110));
        
        
       aux3 = new JLabel();
       PainelJogo.add(aux3);
        
        novo = new JButton("Novo Jogo");
        PainelJogo.add(novo);
        novo.setPreferredSize(new Dimension(220, 90));
        novo.addActionListener((ActionEvent arg0) -> {
            novoJogo();
        });

    }
    
    
    
    public void Jogada(int Simbol,int Simbol2){
        if(vezJogador==0){
          Simbolo = " X ";
          vezJogador = 1;
          vez.setText("Vez do Jogador 2");
          
        }else {
          Simbolo = " 0 ";
          vezJogador = 0;
          vez.setText("Vez do Jogador 1");
        }
        
        Botoes[Simbol][Simbol2].setText(Simbolo);
        Botoes[Simbol][Simbol2].setEnabled(false);
        Verificacao(Simbolo);
    }
    public boolean Verificacao( String Simbolo){
        // verificar diagonais
       if ((Botoes[0][0].getText().equals(Simbolo)) && (Botoes[1][1].getText().equals(Simbolo)) && (Botoes[2][2].getText().equals(Simbolo))) {
            Botoes[0][0].setBackground(Color.green);
            Botoes[1][1].setBackground(Color.green);
            Botoes[2][2].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
       if ((Botoes[0][2].getText().equals(Simbolo)) && (Botoes[1][1].getText().equals(Simbolo)) && (Botoes[2][0].getText().equals(Simbolo))) {
            Botoes[0][2].setBackground(Color.green);
            Botoes[1][1].setBackground(Color.green);
            Botoes[2][0].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
       // verificar horizontais
       
         if ((Botoes[0][0].getText().equals(Simbolo)) && (Botoes[0][1].getText().equals(Simbolo)) && (Botoes[0][2].getText().equals(Simbolo))) {
            Botoes[0][0].setBackground(Color.green);
            Botoes[0][1].setBackground(Color.green);
            Botoes[0][2].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
         
          if ((Botoes[1][0].getText().equals(Simbolo)) && (Botoes[1][1].getText().equals(Simbolo)) && (Botoes[1][2].getText().equals(Simbolo))) {
            Botoes[1][0].setBackground(Color.green);
            Botoes[1][1].setBackground(Color.green);
            Botoes[1][2].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
           if ((Botoes[2][0].getText().equals(Simbolo)) && (Botoes[2][1].getText().equals(Simbolo)) && (Botoes[2][2].getText().equals(Simbolo))) {
            Botoes[2][0].setBackground(Color.green);
            Botoes[2][1].setBackground(Color.green);
            Botoes[2][2].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
           //verficar verticais
            if ((Botoes[0][0].getText().equals(Simbolo)) && (Botoes[1][0].getText().equals(Simbolo)) && (Botoes[2][0].getText().equals(Simbolo))) {
            Botoes[0][0].setBackground(Color.green);
            Botoes[1][0].setBackground(Color.green);
            Botoes[2][0].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
            
        }
             if ((Botoes[0][1].getText().equals(Simbolo)) && (Botoes[1][1].getText().equals(Simbolo)) && (Botoes[2][1].getText().equals(Simbolo))) {
            Botoes[0][1].setBackground(Color.green);
            Botoes[1][1].setBackground(Color.green);
            Botoes[2][1].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
            if ((Botoes[0][2].getText().equals(Simbolo)) && (Botoes[1][2].getText().equals(Simbolo)) && (Botoes[2][2].getText().equals(Simbolo))) {
            Botoes[0][2].setBackground(Color.green);
            Botoes[1][2].setBackground(Color.green);
            Botoes[2][2].setBackground(Color.green);
            quemGanhou(Simbolo);
            return true;
        }
            //veriifca se deu velha
            if((!"".equals(Botoes[0][0].getText())) && (!"".equals(Botoes[0][1].getText())) && (!"".equals(Botoes[0][2].getText())) &&
                    (!"".equals(Botoes[1][0].getText())) && (!"".equals(Botoes[1][1].getText())) && (!"".equals(Botoes[1][2].getText())) &&
                    (!"".equals(Botoes[2][0].getText())) && (!"".equals(Botoes[2][1].getText())) && !"".equals(Botoes[2][2].getText())){
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                       
                    }
                }
                deuVelha();
                return true;
            } 
            return true;
    }
    public void deuVelha(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Botoes[i][j].setEnabled(true);
            }
            novo.setVisible(true);
            vez.setText("Deu Velha");
        
    }
    }
    
    public void quemGanhou(String Simbolo) {
        for (int i = 0; i < 3; i++) {
            for(int j=0; j<3;j++)
            Botoes[i][j].setEnabled(false);
        }
        String texto;
        if (" X ".equals(Simbolo)) {
            texto = "Jogador 1 Venceu";
            pnt1++;
        } else {
            texto = "Jogador 2 Venceu";
            pnt2++;
        }
        Lpnt1.setText(Integer.toString(pnt1));
        Lpnt2.setText(Integer.toString(pnt2));
        novo.setVisible(true);
        vez.setText(texto);
    }
     public void novoJogo() {
        novo.setVisible(true);
        vez.setText("Vez do Jogador 1");
        vezJogador = 0;
        
        
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j<3;j++){
            Botoes[i][j].setText("   ");
            Botoes[i][j].setBackground(novo.getBackground());
            Botoes[i][j].setEnabled(true);
        }
       }
    }

    
}
