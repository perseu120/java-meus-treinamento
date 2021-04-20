package JogoAdivinhação;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Jogo extends JFrame implements ActionListener{

	
	private JPanel painel;
	private JLabel balao;
	private JLabel genio;
	private JLabel resposta;
	private JLabel Valor;
	private JSpinner numero;
	private JButton botao;
	
	
	public Jogo() {
		
		this.setContentPane(getPainel());
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo jogo = new Jogo();
	}



	public JPanel getPainel() {
		
		if(painel == null){
	
			painel = new JPanel();
			painel.setLayout(null);
			painel.setSize(600, 400);
			painel.add(getResposta());
			painel.add(getBalao());
			painel.add(getGenio());
			painel.add(getValor());
			painel.add(getNumero());
			painel.add(getBotao());
			painel.add(getBotao());
			addevent();
	
		}
		
		return painel;
	}

	public JLabel getGenio() {
		
		if(genio == null){
	
			genio = new JLabel();
			genio.setBounds(365, 121, 219, 240);
			genio.setIcon(new ImageIcon("C:\\Users\\josim\\OneDrive\\Imagens\\genio.jpg"));
	
		}
		return genio;
	}



	public JLabel getBalao() {
		
		if(balao == null){
	
			balao = new JLabel();
			balao.setBounds(156, -11, 250, 229);
			balao.setIcon(new  ImageIcon("C:\\Users\\josim\\OneDrive\\Imagens\\balao.jpg"));
			
		}
		return balao;
	}



	public JLabel getResposta() {
		
		if(resposta == null){
	
			resposta = new JLabel("resposta");
			resposta.setFont(new Font("Tahoma", Font.PLAIN, 18));
			resposta.setBounds(175, 22, 197, 115);
	
		}
		return resposta;
	}



	public JLabel getValor() {
		
		if(Valor == null){
	
			Valor = new JLabel("<html>Adivinhe em que numero estou pensando (1 a 5)<html>");
			Valor.setFont(new Font("Tahoma", Font.PLAIN, 18));
			Valor.setBounds(23, 214, 210, 73);
		}
		return Valor;
	}



	public JSpinner getNumero() {
		
		if(numero == null){
	
			numero = new JSpinner(new SpinnerNumberModel(1, 1 , 5, +1));
			numero.setBounds(47, 298, 40, 30);
		}
		return numero;
	}



	public JButton getBotao() {
		
		if(botao == null){
	
			botao = new JButton("Palpite");
			botao.setFont(new Font("Tahoma", Font.PLAIN, 18));
			botao.setBounds(112, 285, 104, 50);
	
		}
		return botao;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == getBotao()) {
			double valor = 1 + Math.random() * (6-1);
			int numero = (int) valor;
			
			int numDigitado = Integer.parseInt(getNumero().getValue().toString());
			
			String resposta = (numero == numDigitado) ?"Acertou!":"<html>Errou! pensei em <html>" + numero;
			
			getResposta().setText( resposta );
			
			System.out.println(numDigitado);
			
		}
		
	}
	
	private void addevent() {
		// TODO Auto-generated method stub
		getBotao().addActionListener(this);
	}
	
	
	

}
