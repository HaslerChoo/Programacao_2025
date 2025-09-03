package layout.leit21;

import javax.swing.JFrame;

public class CloseOperation {
	public static void main(String[] args) {
		
		JFrame tela_1 = new JFrame("Tela 1: EXIT_ON_CLOSE");
		tela_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela_1.setSize(800,600);
		tela_1.setVisible(true);
		
		JFrame tela_2 = new JFrame("Tela 2: DISPOSE_ON_CLOSE");
		tela_2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela_2.setSize(800,600);
		tela_2.setVisible(true);		

		JFrame tela_3 = new JFrame("Tela 3: HIDE_ON_CLOSE");
		tela_3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela_3.setSize(800,600);
		tela_3.setVisible(true);

	}
}
