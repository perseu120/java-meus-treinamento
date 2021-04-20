package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import Visao.FrameMestre;
import Visao.TelaArmacao;
import Visao.TelaCadastroVendedor;
import Visao.TelaEstoque;
import Visao.TelaInicial;
import Visao.TelaLogin;

public class ControladorTelaInicial implements ActionListener {

	private TelaInicial telaInicial;
	private TelaArmacao telaArmacao;
	private TelaEstoque TelaEstoque;
	private TelaLogin telaLogin;
	private TelaCadastroVendedor telaCadastroVendedor;
	private FrameMestre frameMestre;

	private ControladorTelaCadastroVendedor controladorTelaCadastroVendedor;
	private ControladorTelaArmacao controladorTelaArmacao;
	

	


	public ControladorTelaInicial(TelaInicial telaInicial, TelaArmacao telaArmacao, TelaEstoque telaEstoque,
			TelaCadastroVendedor telaCadastroVendedor, FrameMestre frameMestre) {
		
		this.telaInicial = telaInicial;
		this.telaArmacao = telaArmacao;
		this.TelaEstoque = telaEstoque;
		this.telaCadastroVendedor = telaCadastroVendedor;
		this.frameMestre = frameMestre;
		
		addEvento();
	}

	private void addEvento() {

		getTelaInicial().getJButtonCadastro().addActionListener(this);
		getTelaInicial().getJButtonVender().addActionListener(this);
		getTelaInicial().getJButtonRelatorio().addActionListener(this);
		getTelaInicial().getJButtonEstoque().addActionListener(this);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (getTelaInicial().getJButtonCadastro() == e.getSource()) {

			getFrameMestre().setContentPane(getTelaCadastroVendedor());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			getControladorTelaCadastroVendedor();

		}
		
		if (getTelaInicial().getJButtonVender() == e.getSource()) {

			getFrameMestre().setContentPane(getTelaArmacao());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			getControladorTelaArmacao();
			
		}
		
		if(getTelaInicial().getJButtonRelatorio() == e.getSource()) {
			
			JOptionPane.showMessageDialog(null, "Aqui vai mostra a quantide de produtos vendido");
			
		}
		if(getTelaInicial().getJButtonEstoque() == e.getSource()) {
			
			getFrameMestre().setContentPane(getTelaEstoque());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			//chama o controlador da tela
		}
	
	}	

	public TelaLogin getTelaLogin() {
		if(telaLogin== null){
	
			telaLogin = new TelaLogin();
	
		}
		
		return telaLogin;
	}

	public ControladorTelaCadastroVendedor getControladorTelaCadastroVendedor() {
		if(controladorTelaCadastroVendedor== null){
	
			controladorTelaCadastroVendedor = new ControladorTelaCadastroVendedor(getFrameMestre(), getTelaInicial(), getTelaArmacao(), getTelaEstoque(), getTelaCadastroVendedor());
	
		}
		
		return controladorTelaCadastroVendedor;
	}
	



	public TelaInicial getTelaInicial() {
		if (telaInicial == null) {

			telaInicial = new TelaInicial();

		}

		return telaInicial;
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

	public FrameMestre getFrameMestre() {
		if (frameMestre == null) {

			frameMestre = new FrameMestre();

		}

		return frameMestre;
	}


	public ControladorTelaArmacao getControladorTelaArmacao() {
		if(controladorTelaArmacao== null){
	
			controladorTelaArmacao = new ControladorTelaArmacao(getFrameMestre(), getTelaArmacao(), getTelaCadastroVendedor(), getTelaInicial(), getTelaEstoque());
	
		}
		
		return controladorTelaArmacao;
	}
	
}
