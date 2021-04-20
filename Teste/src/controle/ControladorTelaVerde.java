package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visao.JFramePrincipal;
import visao.JPanelTelaAzul;
import visao.JPanelTelaVerde;

public class ControladorTelaVerde implements ActionListener{
	
	private JPanelTelaAzul telaAzul;
	private JPanelTelaVerde telaVerde;
	private JFramePrincipal frame;
	private ControladorTelaAzul controladortelaazul;
	
	
	public ControladorTelaVerde(JFramePrincipal frame, JPanelTelaAzul telaAzul, JPanelTelaVerde telaVerde) {
		this.telaAzul = telaAzul;
		this.telaVerde = telaVerde;
		this.frame = frame;
		this.AddEvent();
	}
	private void AddEvent() {
		getTelaVerde().getjButtonTelaAzul().addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getTelaVerde().getjButtonTelaAzul()) {
			
			this.getFrame().setContentPane(getTelaAzul());
			this.getFrame().repaint();
			this.getFrame().validate();
			JOptionPane.showMessageDialog(null, "deu bom");
			//this.getControladorTelaAzul();
			
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
			telaVerde= new JPanelTelaVerde();
		}
		
		return telaVerde;
	}


	public JFramePrincipal getFrame() {
		if(frame ==null) {
			frame = new JFramePrincipal();
		}
		return frame;
	}


	public ControladorTelaAzul getControladorTelaAzul() {
		if(controladortelaazul == null) {
			controladortelaazul = new ControladorTelaAzul(frame, getTelaAzul(), getTelaVerde());
		}
		
		return controladortelaazul;
	}
	
	
	

	
}

