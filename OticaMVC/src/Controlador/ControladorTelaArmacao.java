package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Armacao;
import Visao.FrameMestre;
import Visao.TelaArmacao;
import Visao.TelaCadastroVendedor;
import Visao.TelaEstoque;
import Visao.TelaInicial;
import Visao.TelaLente;

public class ControladorTelaArmacao implements ActionListener{

	
	private FrameMestre frameMestre;
	private TelaArmacao telaArmacao;
	private TelaCadastroVendedor telaCadastroVendedor;
	private TelaInicial telaInicial;
	private TelaEstoque telaEstoque;
	private TelaLente telaLente;
	private ControladorTelaLente controladorTelaLente;
	private ControladorTelaInicial controladorTelaInicial;
	
	ArrayList<Armacao> arrayListArmacao = new ArrayList<Armacao>();



	public ControladorTelaArmacao(FrameMestre frameMestre, TelaArmacao telaArmacao,
			TelaCadastroVendedor telaCadastroVendedor, TelaInicial telaInicial, TelaEstoque telaEstoque) {
		
		this.frameMestre = frameMestre;
		this.telaArmacao = telaArmacao;
		this.telaCadastroVendedor = telaCadastroVendedor;
		this.telaInicial = telaInicial;
		this.telaEstoque = telaEstoque;
		addEvento();
		
	}


	private void addEvento() {
		
		getTelaArmacao().getCancelarButton().addActionListener(this);
		getTelaArmacao().getConfirmarButton().addActionListener(this);
		//getTelaArmacao().getConfirmarButton().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(getTelaArmacao().getConfirmarButton() == e.getSource()) {
			
			String material = (String) getTelaArmacao().getArmacaoMaterial().getSelectedItem();
			String formato = (String) getTelaArmacao().getArmacaoFormato().getSelectedItem();
			String marca = (String) getTelaArmacao().getArmacaoMarca().getSelectedItem();
			String cor = (String) getTelaArmacao().getArmacaoCor().getSelectedItem();
			String tamanho = (String) getTelaArmacao().getArmacaoTamanho().getSelectedItem();

			Armacao armacao = new Armacao(material, formato, marca, cor, tamanho);
			
			getArrayListArmacao().add(armacao);
			
			System.out.println(getArrayListArmacao().size());
			
			getFrameMestre().setContentPane(getTelaLente());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			getControladorTelaLente();
				
		}
		
		if(getTelaArmacao().getCancelarButton() == e.getSource()) {
			
			JOptionPane.showMessageDialog(getTelaArmacao(), "Venda Cancelada");
			
			getFrameMestre().setContentPane(getTelaInicial());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			//getControladorTelaInicial();
			
		}
		
	}
	
	public FrameMestre getFrameMestre() {
		if(frameMestre== null){
	
			frameMestre = new FrameMestre();
	
		}
		
		return frameMestre;
	}


	public TelaArmacao getTelaArmacao() {
		if(telaArmacao== null){
	
			telaArmacao = new TelaArmacao();
	
		}
		
		return telaArmacao;
	}


	public TelaCadastroVendedor getTelaCadastroVendedor() {
		if(telaCadastroVendedor== null){
	
			telaCadastroVendedor = new TelaCadastroVendedor();
	
		}
		
		return telaCadastroVendedor;
	}


	public TelaInicial getTelaInicial() {
		if(telaInicial== null){
	
			telaInicial = new TelaInicial();
	
		}
		
		return telaInicial;
	}


	public TelaEstoque getTelaEstoque() {
		if(telaEstoque== null){
	
			telaEstoque = new TelaEstoque();
	
		}
		
		return telaEstoque;
	}

	public ControladorTelaInicial getControladorTelaInicial() {
		if(controladorTelaInicial== null){
	
			controladorTelaInicial = new ControladorTelaInicial(getTelaInicial(), getTelaArmacao(), getTelaEstoque(), getTelaCadastroVendedor(), getFrameMestre());
	
		}
		
		return controladorTelaInicial;
	}


	public TelaLente getTelaLente() {
		if(telaLente== null){
	
			telaLente = new TelaLente();
	
		}
		
		return telaLente;
	}


	public ControladorTelaLente getControladorTelaLente() {
		if(controladorTelaLente== null){
	
			controladorTelaLente = new ControladorTelaLente(getTelaArmacao(), getFrameMestre(), getTelaInicial(), getTelaLente());
	
		}
		
		return controladorTelaLente;
	}


	public ArrayList<Armacao> getArrayListArmacao() {
		if(arrayListArmacao== null){
	
			arrayListArmacao = new ArrayList<Armacao>();
	
		}
		
		return arrayListArmacao;
	}

	
	
	
	
	
}
