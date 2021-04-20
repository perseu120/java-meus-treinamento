package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelTelaVerde extends JPanel {
	
	private JButton jButtonTelaAzul;
	

	public JPanelTelaVerde() {
		this.inicializandoTelaVerde();
	}
	
	private void inicializandoTelaVerde() {
		this.setLayout(null); 
		this.setPreferredSize(null); // definir tamenho( pesquisar diferença entre size e o preferedesize
		this.setVisible(true);
		this.setBackground(Color.GREEN);// definir a cor de fundo
		
		this.add(getjButtonTelaAzul());
		
	}
	
	public JButton getjButtonTelaAzul() {
		
		if(jButtonTelaAzul == null) {
			jButtonTelaAzul = new JButton("PularTela");
			jButtonTelaAzul.setBounds(200, 225, 100, 50);
		}
		return jButtonTelaAzul;
		
	}
	
	
}
