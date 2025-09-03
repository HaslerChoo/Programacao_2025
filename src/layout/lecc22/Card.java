package layout.lecc22;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Card implements ActionListener{

	private JFrame tela;
	
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	
	private JPanel panel_norte;
	private JPanel panel_centro;

	private JPanel panel_tela1;
	private JPanel panel_tela2;
	private JPanel panel_tela3;

	private JLabel label_tela1;
	private JLabel label_tela2;
	private JLabel label_tela3;

	
	public Card() {
		instanciar();
		propriedadesTela();
		definirLayout();
		adicionarElementos();
		darAccao();
		tela.setVisible(true);
	}
	


	private void definirLayout() {
		BorderLayout border = new BorderLayout();
		
		tela.setLayout(border);
		
		GridLayout grid= new GridLayout(1,3);
		panel_norte.setLayout(grid);
		
		CardLayout card_layout= new CardLayout();
		panel_centro.setLayout(card_layout);
	}

	private void instanciar() {
		tela= new JFrame("Card Layout");
		
		bt1=new JButton("BT 1");
		bt2=new JButton("BT 2");
		bt3=new JButton("BT 3");
		
		panel_norte = new JPanel();
		panel_centro = new JPanel();
		
		panel_tela1 = new JPanel();
		panel_tela2 = new JPanel();
		panel_tela3 = new JPanel();

		label_tela1 = new JLabel("Tela 1");
		label_tela2 = new JLabel("Tela 2");
		label_tela3 = new JLabel("Tela 3");
		
	}
	
	private void propriedadesTela(){
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(800,600);
	}
	
	private void adicionarElementos() {
		panel_norte.add(bt1);
		panel_norte.add(bt2);
		panel_norte.add(bt3);
		
		panel_tela1.add(label_tela1);
		panel_tela2.add(label_tela2);
		panel_tela3.add(label_tela3);
		
		panel_centro.add(panel_tela1,"tela_1");
		panel_centro.add(panel_tela2,"tela_2");
		panel_centro.add(panel_tela3,"tela_3");
		
		tela.add(panel_norte,BorderLayout.NORTH);
		tela.add(panel_centro,BorderLayout.CENTER);

		
	}

	private void darAccao() {
		bt1.addActionListener(this);		
		bt2.addActionListener(this);
		bt3.addActionListener(this);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout card =(CardLayout) panel_centro.getLayout();
		if(bt1==e.getSource()) {
			card.show(panel_centro, "tela_1");
		} 
		else if(bt2==e.getSource()){
			card.show(panel_centro, "tela_2");
		}
		else
		{
			card.show(panel_centro, "tela_3");
		}
	}
}
