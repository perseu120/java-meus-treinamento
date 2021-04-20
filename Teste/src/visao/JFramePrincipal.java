package visao;

import javax.swing.JFrame;

public class JFramePrincipal extends JFrame {
	
	public JFramePrincipal() {
		this.inicializandoFrame();
		
	}
	private void inicializandoFrame() {
		
		this.setLayout(null);// definir o tipo de layout
		this.setSize(500, 500);// definir tamanho
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o processo da tela quando ela for fechada
		this.setVisible(true); // para deixa o frame visivel
		this.setLocationRelativeTo(null); // deixa a tela iniciar no centro
		this.setResizable(true); // redimensionamento da tela
		
	}
	
}
