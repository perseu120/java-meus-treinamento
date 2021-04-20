import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalc extends JFrame implements ActionListener{
	
	public JPanel painel;
	public JLabel um;
	public JLabel dois;
	public JLabel trez;
	public JLabel quatro;
	public JLabel cinco;
	public JLabel seis;
	public JLabel sete;
	public JLabel oito;
	public JLabel nove;
	public JLabel dez;
	public JLabel onze;
	public JLabel doze;
	public JButton botao;
	public JTextField campo;
	
	
	public TelaCalc() {
		setContentPane(getPainel());
		setVisible(true);
		setSize(600, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

	public JPanel getPainel() {
		
		if(painel == null){
	
			painel = new JPanel();
			painel.setBackground(Color.GRAY);
			painel.setLayout(null);
			painel.add(getUm());
			painel.add(getDois());
			painel.add(getTrez());
			painel.add(getQuatro());
			painel.add(getCinco());
			painel.add(getSeis());
			painel.add(getSete());
			painel.add(getOito());
			painel.add(getNove());
			painel.add(getDez());
			painel.add(getOnze());
			painel.add(getDoze());
			painel.add(getBotao());
			painel.add(getCampo());
			
			
			addevent();
		}
		
		return painel;
	}
	
	


	public JTextField getCampo() {
		
		if(campo == null){
	
			campo = new JTextField();
			campo.setBounds(312, 261, 86, 20);
	
		}
		return campo;
	}

	public JLabel getUm() {
		
		if(um == null){
	
			um = new JLabel("Resto da divisao por 2");
			um.setBounds(10, 59, 180, 20);
	
		}
		return um;
	}


	public JLabel getDois() {
		
		if(dois == null){
	
			dois = new JLabel("Elevado ao Cubo");
			dois.setBounds(10, 90, 180, 20);
	
		}
		return dois;
	}


	public JLabel getTrez() {
		
		if(trez == null){
	
			trez = new JLabel("Raiz quadrada");
			trez.setBounds(10, 120, 180, 20);
	
		}
		return trez;
	}


	public JLabel getQuatro() {
		
		if(quatro == null){
	
			quatro = new JLabel("Raiz cubica");
			quatro.setBounds(10, 150, 180, 20);
	
		}
		return quatro;
	}


	public JLabel getCinco() {
		
		if(cinco == null){
	
			cinco = new JLabel("Valor Absoluto");
			cinco.setBounds(10,180, 113, 20);
	
		}
		return cinco;
	}


	public JLabel getSeis() {
		
		if(seis == null){
	
			seis = new JLabel("0");
			seis.setBounds(200, 59, 180, 20);
			
	
		}
		return seis;
	}

	public JLabel getSete() {
		
		if(sete == null){
	
			sete = new JLabel("0");
			sete.setBounds(200, 90, 180, 20);
	
		}
		return sete;
	}


	public JLabel getOito() {
		
		if(oito == null){
	
			oito = new JLabel("0");
			oito.setBounds(200, 120, 180, 20);
	
		}
		return oito;
	}


	public JLabel getNove() {
		
		if(nove == null){
	
			nove = new JLabel("0");
			nove.setBounds(200, 150, 180, 20);
	
		}
		return nove;
	}

	public JLabel getDez() {
		
		if(dez == null){
	
			dez = new JLabel("0");
			dez.setBounds(200, 180, 180, 20);
	
		}
		return dez;
	}



	public JLabel getOnze() {
		
		if(onze == null){
	
			onze = new JLabel("Digite um Valor");
			onze.setBounds(113, 260, 180, 20);
	
		}
		return onze;
	}


	public JLabel getDoze() {
		
		if(doze == null){
	
			doze = new JLabel();
			doze.setLocation(374, 11);
			doze.setSize(200, 200);
		

		}
		return doze;
	}


	public JButton getBotao() {
		
		if(botao == null){
	
			botao = new JButton("calcular");
			botao.setLocation(200, 374);
			botao.setSize(113, 40);
	
		}
		return botao;
	}









	public void setSeis(JLabel seis) {
		this.seis = seis;
	}

	public void setSete(JLabel sete) {
		this.sete = sete;
	}

	public void setOito(JLabel oito) {
		this.oito = oito;
	}

	public void setNove(JLabel nove) {
		this.nove = nove;
	}

	public void setDez(JLabel dez) {
		this.dez = dez;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getBotao()) {
			int variavel;
			int resto;
			double cubo;
			
			variavel = Integer.parseInt(getCampo().getText());
			
			resto = variavel % 2;
			
			getSeis().setText(Integer.toString(resto));
			
			cubo = Math.pow(variavel, 3);
			
			getSete().setText(Double.toString(cubo));
			
			cubo = Math.sqrt(variavel);
			
			getOito().setText(Double.toString(cubo));
			
			cubo = Math.cbrt(variavel);
			
			getNove().setText(Double.toString(cubo));
			
			resto = Math.abs(variavel);
			
			getDez().setText(Integer.toString(resto));
		}
		
	}
	
	private void addevent() {
		getBotao().addActionListener(this);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaCalc tela = new TelaCalc();
	}
}
