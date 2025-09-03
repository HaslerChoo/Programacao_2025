package layout.leit21;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid {

	private JFrame tela;
	
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	
	public Grid() {
		instanciar();
		propriedadesTela();
		definirLayout();
		adicionarElementos();
		tela.setVisible(true);
	}
	
	private void definirLayout() {
							//linhas, coluna
		GridLayout grid = new GridLayout(3,1);
		tela.setLayout(grid);
	}

	private void instanciar() {
		tela= new JFrame("Grid Layout");
		
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
		tela.add(bt2);
		tela.add(bt3);

		
	}
}
