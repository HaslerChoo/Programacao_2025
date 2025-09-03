package layout.lecc22;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow {

	private JFrame tela;
	
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	
	public Flow() {
		instanciar();
		propriedadesTela();
		definirLayout();
		adicionarElementos();
		tela.setVisible(true);
	}
	
	private void definirLayout() {
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
		tela.setLayout(flow);
	}

	private void instanciar() {
		tela= new JFrame("Flow Layout");
		
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
