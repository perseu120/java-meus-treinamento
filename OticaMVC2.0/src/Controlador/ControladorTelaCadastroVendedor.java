package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Vendedor;
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
	private ArrayList<Vendedor> arrayListVendedor;
	


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
			
			String validarCpf = (String) getTelaCadastroVendedor().getTextFieldCpf().getText();
			
			if( ValidaCPF(validarCpf) == true ){
				
				String nome = (String) getTelaCadastroVendedor().getTextFieldNome().getText();
				String cpf = (String) getTelaCadastroVendedor().getTextFieldCpf().getText();
				String pis = (String) getTelaCadastroVendedor().getTextFieldPis().getText();
				
				
				Vendedor vendedor = new Vendedor(nome, cpf, pis);
				
				getArrayListVendedor().add(vendedor);
				
				
				JOptionPane.showMessageDialog(telaCadastroVendedor, "Vendedor Cadastrado com sucesso");
				getFrameMestre().setContentPane(getTelaInicial());
				getFrameMestre().repaint();
				getFrameMestre().validate();

			}else {
				
				JOptionPane.showMessageDialog(null, getTelaCadastroVendedor().getTextFieldCpf().getText());
				
			}
			
			
		}
		
		if(getTelaCadastroVendedor().getJButtonCancelar() == e.getSource()) {
			JOptionPane.showMessageDialog(telaCadastroVendedor, "Cadastro Cancelado");
			getFrameMestre().setContentPane(getTelaInicial());
			getFrameMestre().repaint();
			getFrameMestre().validate();
			
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
	
	private boolean ValidaCPF(String Cpf){
		int iDigito1Aux = 0, iDigito2Aux = 0, iDigitoCPF;
		int iDigito1 = 0, iDigito2 = 0, iRestoDivisao = 0;
		String strDigitoVerificador, strDigitoResultado;
		
		if (! Cpf.substring(0,1).equals("")){
		    try{
		        Cpf = Cpf.replace('.',' ');
		        Cpf = Cpf.replace('-',' ');
		        Cpf = Cpf.replaceAll(" ","");
		        for (int iCont = 1; iCont < Cpf.length() -1; iCont++) {
		            iDigitoCPF = Integer.valueOf(Cpf.substring(iCont -1, iCont)).intValue();
		            iDigito1Aux = iDigito1Aux + (11 - iCont) * iDigitoCPF;
		            iDigito2Aux = iDigito2Aux + (12 - iCont) * iDigitoCPF;
		        }
		        iRestoDivisao = (iDigito1Aux % 11);
		        if (iRestoDivisao < 2) {
		            iDigito1 = 0;
		        } else {
		            iDigito1 = 11 - iRestoDivisao;
		        }
		        iDigito2Aux += 2 * iDigito1;
		        iRestoDivisao = (iDigito2Aux % 11);
		        if (iRestoDivisao < 2) {
		            iDigito2 = 0;
		        } else {
		            iDigito2 = 11 - iRestoDivisao;
		        }
		        strDigitoVerificador = Cpf.substring(Cpf.length()-2, Cpf.length());
		        strDigitoResultado = String.valueOf(iDigito1) + String.valueOf(iDigito2);
		        strDigitoVerificador.equals(strDigitoResultado);
		        return true;
		    } catch (Exception e) {
		        return false;
		    }
		} else {
		    return false;
		}
		
		
		
	}

	public ArrayList<Vendedor> getArrayListVendedor() {
		if(arrayListVendedor== null){
	
			arrayListVendedor = new ArrayList<Vendedor>();
	
		}
		
		return arrayListVendedor;
	}

	

}
