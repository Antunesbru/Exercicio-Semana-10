import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame implements ActionListener{
   private JTextField txtTexto;
   private JLabel texto;
   JButton botaoMostrar, botaoLimpar, botaoSair;
   
   public Tela(){
      super("Texto");
      //Montando o painel
      JPanel painelEntrada = new JPanel(new FlowLayout());     
      JPanel panelTitulo = new JPanel(new FlowLayout());
      
      JLabel titulo = new JLabel ("Etiqueta");
      panelTitulo.add(titulo);
      
      txtTexto = new JTextField(15);
      texto = new JLabel("Digite o Texto"); 
      
      
      painelEntrada.add(panelTitulo);     
      painelEntrada.add(texto);
      painelEntrada.add(txtTexto);     
      JPanel panelBotoes = new JPanel(new FlowLayout());
      botaoMostrar = new JButton("Mostrar");
      botaoLimpar = new JButton("Limpar");
      botaoSair = new JButton("Sair");
      panelBotoes.add(botaoMostrar);
      panelBotoes.add(botaoLimpar);
      panelBotoes.add(botaoSair);
      
      
      
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(panelTitulo, BorderLayout.NORTH);
      caixa.add(painelEntrada, BorderLayout.CENTER);
      caixa.add(panelBotoes, BorderLayout.SOUTH);
      
      
      botaoLimpar.addActionListener(this);
      botaoMostrar.addActionListener(this);
      botaoSair.addActionListener(this);
      
      
      setSize(710,190);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
      //Limpar todos os dados digitados
      public void actionPerformed(ActionEvent event){
      if(event.getSource() == botaoLimpar){
         txtTexto.setText(""); 
      } else if(event.getSource() == botaoMostrar){
          String escrever = txtTexto.getText();
          JOptionPane.showMessageDialog(null, escrever, "Mostrando a Digitação", JOptionPane.PLAIN_MESSAGE);
      } else if(event.getSource() == botaoSair){
         System.exit(0);
      }
   }
   


}