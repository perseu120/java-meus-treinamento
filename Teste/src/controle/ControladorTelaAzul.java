package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import visao.JFramePrincipal;
import visao.JPanelTelaAzul;
import visao.JPanelTelaVerde;

public class ControladorTelaAzul implements ActionListener{
	
	private JPanelTelaAzul telaAzul;
	private JPanelTelaVerde telaVerde;
	private JFramePrincipal frame;
	private ControladorTelaVerde controladortelaverde;
	
	public ControladorTelaAzul(JFramePrincipal frame, JPanelTelaAzul telaAzul, JPanelTelaVerde telaVerde) {
		this.telaAzul = telaAzul;
		this.telaVerde = telaVerde;
		this.frame = frame;
		this.addEvent();
	}
	private void addEvent() {
		getTelaAzul().getjButtonTelaVerde().addActionListener(this);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getTelaAzul().getjButtonTelaVerde()) {
			
			getFrame().setContentPane(getTelaVerde());
			getFrame().repaint();
			getFrame().validate();
			JOptionPane.showMessageDialog(null, "Deu certo!");
			getControladortelaverde();
		}
		
	}


	public JPanelTelaAzul getTelaAzul() {
		
		if(telaAzul == null) {
			telaAzul = new JPanelTelaAzul();
		}
		
		return telaAzul;
	}


	public JPanelTelaVerde getTelaVerde() {
		if(telaVerde == null) {
			telaVerde = new JPanelTelaVerde();
		}
		
		return telaVerde;
	}


	public JFramePrincipal getFrame() {
		if(frame == null) {
			frame = new JFramePrincipal();
		}
		
		return frame;
	}
	public ControladorTelaVerde getControladortelaverde() {
		if(controladortelaverde == null) {
			controladortelaverde = new ControladorTelaVerde(frame, getTelaAzul(), getTelaVerde());
		}
		return controladortelaverde;
	}

	
	
}
