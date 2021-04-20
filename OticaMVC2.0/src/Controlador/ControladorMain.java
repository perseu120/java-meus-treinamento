package Controlador;

import Visao.FrameMestre;
import Visao.TelaInicial;
import Visao.TelaLogin;

public class ControladorMain {
	
	public static FrameMestre frame;
	public static TelaLogin telaLogin;
	public static TelaInicial telaInicial;
	

	public static ControladorTelaLogin contoladorTelaLogin;
	
	public static void main(String[] args) {
		
		getFrame().setContentPane(getTelaLogin());
		getFrame().repaint();
		getFrame().validate();
		getContoladorTelaLogin();

	}

	public static FrameMestre getFrame() {
		if(frame== null){
	
			frame = new FrameMestre();
	
		}
		
		return frame;
	}

	public static TelaLogin getTelaLogin() {
		if(telaLogin== null){
	
			telaLogin = new TelaLogin();
	
		}
		
		return telaLogin;
	}

	public static TelaInicial getTelaInicial() {
		if(telaInicial== null){
	
			telaInicial = new TelaInicial();
	
		}
		
		return telaInicial;
	}
	
	public static ControladorTelaLogin getContoladorTelaLogin() {
		if(contoladorTelaLogin== null){
	
			contoladorTelaLogin = new ControladorTelaLogin(getTelaInicial(), getTelaLogin(), getFrame() );
	
		}
		
		return contoladorTelaLogin;
	}
	
	


	
}
