package controle;

import visao.JFramePrincipal;
import visao.JPanelTelaAzul;
import visao.JPanelTelaVerde;

public class ControladorMain {
	
	private static JPanelTelaAzul telaAzul;
	private static JPanelTelaVerde telaVerde;
	private static JFramePrincipal frame;
	private static ControladorTelaAzul controladorTelaAzul;
	
	
	public static void main(String[] args) {
		getFrame().setContentPane(getTelaAzul());
		getFrame().repaint();
		getFrame().validate();
		getControladorTelaAzul();
			
	}

	
	public static JPanelTelaAzul getTelaAzul() {
		if(telaAzul == null) {
			telaAzul = new JPanelTelaAzul();
		}
		return telaAzul;
	}

	public static ControladorTelaAzul getControladorTelaAzul() {
		if(controladorTelaAzul == null) {
			controladorTelaAzul= new ControladorTelaAzul(frame, telaAzul,telaVerde);
		}
		return controladorTelaAzul;
	}


	public static JPanelTelaVerde getTelaVerde() {
		if(telaVerde == null) {
			telaVerde= new JPanelTelaVerde();
		}
		return telaVerde;
	}


	public static JFramePrincipal getFrame() {
		if(frame == null) {
			frame= new JFramePrincipal();
		}
		return frame;
	}

	
	
}
