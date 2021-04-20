package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Modelo.Lente;
import Visao.FrameMestre;
import Visao.TelaArmacao;
import Visao.TelaCadastroVendedor;
import Visao.TelaEstoque;
import Visao.TelaInicial;
import Visao.TelaLente;

public class ControladorTelaLente implements ActionListener{

	private TelaLente telaLente;
	private TelaArmacao telaArmacao;
	private FrameMestre frameMestre;
	private TelaInicial telaInicial;
	
	ArrayList<Lente> arrayListLente = new ArrayList<Lente>();
	
	
	public ControladorTelaLente(TelaArmacao telaArmacao, FrameMestre frameMestre, TelaInicial telaInicial,
			TelaLente telaLente) {
		this.telaArmacao = telaArmacao;
		this.frameMestre = frameMestre;
		this.telaInicial = telaInicial;
		this.telaLente = telaLente;
		addEvento();
	}



	private void addEvento() {
		
		getTelaLente().getJButtonConfimar().addActionListener(this);
		getTelaLente().getJButtonCancelar().addActionListener(this);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getTelaLente().getJButtonConfimar()){
			
			String material = (String) getTelaLente().getLenteMaterial().getSelectedItem();
			String grau = (String) getTelaLente().getLenteGrau().getSelectedItem();
			String tipo = (String) getTelaLente().getLenteTipo().getSelectedItem();
			
			Lente lente = new Lente(material, tipo, grau);
			
			getArrayListLente().add(lente);
			
			System.out.println(getArrayListLente().size());
			
			getFrameMestre().setContentPane(getTelaInicial());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			
		}
		if(e.getSource() == getTelaLente().getJButtonCancelar()){
			
			getFrameMestre().setContentPane(getTelaArmacao());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			
		}
			
		
	}



	public TelaArmacao getTelaArmacao() {
		if(telaArmacao== null){
	
			telaArmacao = new TelaArmacao();
	
		}
		
		return telaArmacao;
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



	public TelaLente getTelaLente() {
		if(telaLente== null){
	
			telaLente = new TelaLente();
	
		}
		
		return telaLente;
	}



	public ArrayList<Lente> getArrayListLente() {
		if(arrayListLente== null){
	
			arrayListLente = new ArrayList<Lente>();
	
		}
		
		return arrayListLente;
	}

	
	
}
