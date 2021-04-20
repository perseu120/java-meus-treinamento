package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Visao.FrameMestre;
import Visao.TelaArmacao;
import Visao.TelaCadastroVendedor;
import Visao.TelaEstoque;
import Visao.TelaInicial;
import Visao.TelaLogin;

public class ControladorTelaLogin implements ActionListener {

	private TelaInicial telaInicial;
	private TelaLogin telaLogin;
	private FrameMestre frame;
	private ControladorTelaInicial controladorTelaInicial;
	


	private TelaArmacao telaArmacao;
	private TelaEstoque TelaEstoque;
	private TelaCadastroVendedor telaCadastroVendedor;
	private ControladorTelaLogin controladorTelaLogin;

	public ControladorTelaLogin(TelaInicial telaInicial, TelaLogin telaLogin, FrameMestre frame) {

		this.telaInicial = telaInicial;
		this.telaLogin = telaLogin;
		this.frame = frame;
		addEvento();
	}

	private void addEvento() {
		
		getTelaLogin().getJButtonConfirmar().addActionListener(this);
		getFrame().getMenuItemLogoff().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getTelaLogin().getJButtonConfirmar()) {

			getFrame().setContentPane(getTelaInicial());
			getFrame().repaint();
			getFrame().validate();
			getControladorTelaInicial();

		}
		
		if(e.getSource() == getFrame().getMenuItemLogoff()) {
			
			if(getFrame().getContentPane()== getTelaLogin()) {
				
			}else {
				JOptionPane.showMessageDialog(null, "Logoff Feito com sucesso");
				getFrame().setContentPane(getTelaLogin());
				getFrame().repaint();
				getFrame().validate();
				
			}
			
			
				
		}

	}

	public ControladorTelaInicial getControladorTelaInicial() {
		if (controladorTelaInicial == null) {

			controladorTelaInicial = new ControladorTelaInicial(getTelaInicial(), getTelaArmacao(), getTelaEstoque(),
					getTelaCadastroVendedor(), getFrame());

		}

		return controladorTelaInicial;
	}

	public TelaArmacao getTelaArmacao() {
		if (telaArmacao == null) {

			telaArmacao = new TelaArmacao();

		}

		return telaArmacao;
	}

	public TelaEstoque getTelaEstoque() {
		if (TelaEstoque == null) {

			TelaEstoque = new TelaEstoque();

		}

		return TelaEstoque;
	}

	public TelaCadastroVendedor getTelaCadastroVendedor() {
		if (telaCadastroVendedor == null) {

			telaCadastroVendedor = new TelaCadastroVendedor();

		}

		return telaCadastroVendedor;
	}

	public TelaInicial getTelaInicial() {

		if (telaInicial == null) {

			telaInicial = new TelaInicial();

		}

		return telaInicial;
	}

	public TelaLogin getTelaLogin() {
		if (telaLogin == null) {

			telaLogin = new TelaLogin();

		}

		return telaLogin;
	}

	public FrameMestre getFrame() {
		if (frame == null) {

			frame = new FrameMestre();

		}

		return frame;
	}

	public ControladorTelaLogin getControladorTelaLogin() {
		if(controladorTelaLogin== null){
	
			controladorTelaLogin = new ControladorTelaLogin(getTelaInicial(), getTelaLogin(), getFrame());
	
		}
		
		return controladorTelaLogin;
	}
	
	

}
