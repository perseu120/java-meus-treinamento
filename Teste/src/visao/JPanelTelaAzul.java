package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;

public class JPanelTelaAzul extends JPanel {
	
	private JButton jButtonTelaVerde;

	public JPanelTelaAzul() {
		this.inicializandoTelaAzul();
	}
	
	private void inicializandoTelaAzul( ) {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(500, 500));
		this.setBackground(Color.BLUE);
		this.setVisible(true);
		
		this.add(getjButtonTelaVerde());
		
		
	
	}


	public JButton getjButtonTelaVerde() {
			
			if(jButtonTelaVerde == null) {
				jButtonTelaVerde = new JButton("PularTela");
				jButtonTelaVerde.setBounds(195, 145, 100, 50);
			}
			return jButtonTelaVerde;
			
		}
}
