package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

import Visao.FrameMestre;
import Visao.TelaArmacao;
import Visao.TelaCadastroVendedor;
import Visao.TelaEstoque;
import Visao.TelaInicial;

public class ControladorTelaCadastroVendedor implements ActionListener {
	
	private FrameMestre frameMestre;
	private TelaInicial telaInicial;
	private TelaArmacao telaArmacao;
	private TelaEstoque TelaEstoque;
	private TelaCadastroVendedor telaCadastroVendedor;
	private ControladorTelaInicial controladorTelaInicial;
	


	public ControladorTelaCadastroVendedor(FrameMestre frameMestre, TelaInicial telaInicial, TelaArmacao telaArmacao,
			Visao.TelaEstoque telaEstoque, TelaCadastroVendedor telaCadastroVendedor) {
		
		this.frameMestre = frameMestre;
		this.telaInicial = telaInicial;
		this.telaArmacao = telaArmacao;
		this.TelaEstoque = telaEstoque;
		this.telaCadastroVendedor = telaCadastroVendedor;
		addEvento();
		
	}
	
	private void addEvento() {
		
		getTelaCadastroVendedor().getJButtonConfimar().addActionListener(this);
		getTelaCadastroVendedor().getJButtonCancelar().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(getTelaCadastroVendedor().getJButtonConfimar() == e.getSource()) {//verifica se tem algum campo vazil
			
			
			
			JOptionPane.showMessageDialog(telaCadastroVendedor, "Vendedor Cadastrado com sucesso");
			
			getFrameMestre().setContentPane(getTelaInicial());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			//getControladorTelaInicial();
			
		}
		
		if(getTelaCadastroVendedor().getJButtonCancelar() == e.getSource()) {
			JOptionPane.showMessageDialog(telaCadastroVendedor, "Cadastro Cancelado");
			getFrameMestre().setContentPane(getTelaInicial());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			//getControladorTelaInicial();
			
		}
		
	}
	
	public ControladorTelaInicial getControladorTelaInicial() {
		if(controladorTelaInicial== null){
	
			controladorTelaInicial = new ControladorTelaInicial(getTelaInicial(), getTelaArmacao(), getTelaEstoque(), getTelaCadastroVendedor(), getFrameMestre());
	
		}
		
		return controladorTelaInicial;
	}
	
	public FrameMestre getFrameMestre() {
		if(frameMestre== null){
	
			frameMestre = new FrameMestre();
	
		}
		
		return frameMestre;
	}
	public TelaInicial getTelaInicial() {
		if(telaInicial== null){
	
			telaInicial = new TelaInicial();
	
		}
		
		return telaInicial;
	}
	public TelaArmacao getTelaArmacao() {
		if(telaArmacao== null){
	
			telaArmacao = new TelaArmacao();
	
		}
		
		return telaArmacao;
	}
	public TelaEstoque getTelaEstoque() {
		if(TelaEstoque== null){
	
			TelaEstoque = new TelaEstoque();
	
		}
		
		return TelaEstoque;
	}
	public TelaCadastroVendedor getTelaCadastroVendedor() {
		if(telaCadastroVendedor== null){
	
			telaCadastroVendedor = new TelaCadastroVendedor();
	
		}
		
		return telaCadastroVendedor;
	}
	
	

	

}
