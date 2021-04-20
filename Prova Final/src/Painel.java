import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Painel extends JPanel {
	
	JButton JButtonSoma;
	JButton JButtonSubtracao;
	JButton JButtonMultiplicacao;
	JButton JButtonDivisao;
	
	
	public Painel() {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setLayout(null);
		
		getJButtonSoma().setBounds(34, 148, 89, 23);
		add(getJButtonSoma());
		
	
		getJButtonSubtracao().setBounds(159, 148, 89, 23);
		add(getJButtonSubtracao());
		
	
		getJButtonMultiplicacao().setBounds(269, 148, 114, 23);
		add(getJButtonMultiplicacao());
		
		getJButtonDivisao().setBounds(138, 223, 89, 23);
		add(getJButtonDivisao());
		
		
		
	}


	public JButton getJButtonSoma() {
		if(JButtonSoma == null){
	
			return JButtonSoma = new JButton("Soma");
		}
	
		return JButtonSoma;
	}


	public JButton getJButtonSubtracao() {
		if(JButtonSubtracao == null){
	
			return JButtonSubtracao = new JButton("subtra\u00E7\u00E3o");
		}
	
		return JButtonSubtracao;
	}


	public JButton getJButtonMultiplicacao() {
		if(JButtonMultiplicacao == null){
	
			return JButtonMultiplicacao = new JButton("Multiplica\u00E7\u00E3o");
		}
	
		return JButtonMultiplicacao;
	}


	public JButton getJButtonDivisao() {
		if(JButtonDivisao == null){
	
			return JButtonDivisao = new JButton("Divis\u00E3o");
		}
	
		return JButtonDivisao;
	}
	
}
