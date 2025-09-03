package layout.lecc22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border {

	private JFrame tela;
	
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	
	public Border() {
		instanciar();
		propriedadesTela();
		definirLayout();
		adicionarElementos();
		tela.setVisible(true);
	}
	
	private void definirLayout() {
		BorderLayout border = new BorderLayout();
		
		tela.setLayout(border);
	}

	private void instanciar() {
		tela= new JFrame("Border Layout");
		
		bt1=new JButton("BT 1");
		bt2=new JButton("BT 2");
		bt3=new JButton("BT 3");
		
	}
	
	private void propriedadesTela(){
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(800,600);
	}
	
	private void adicionarElementos() {
		tela.add(bt1);
		tela.add(bt2,BorderLayout.NORTH);
		tela.add(bt3,BorderLayout.SOUTH);

		
	}
}
