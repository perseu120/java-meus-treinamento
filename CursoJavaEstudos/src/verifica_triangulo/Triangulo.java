package verifica_triangulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Triangulo extends JFrame implements ChangeListener, ActionListener {
	
	
	private JPanel painel;
	private JButton verifica;
	private JLabel imagem;
	private JLabel resultado;
	private JLabel tipoTriangulo;
	private JSlider sliderA;
	private JSlider sliderB;
	private JSlider sliderC;
	private JLabel segmento1;
	private JLabel segmento2;
	private JLabel segmento3;
	private JLabel valor1;
	private JLabel valor2;
	private JLabel valor3;
	
	public Triangulo() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setContentPane(getPainel());
		AddEvent();
		
	}
	
	public static void main(String [] args) {
		
		Triangulo classe = new Triangulo();
		
	}

	
	public JPanel getPainel() {
		
		if(painel == null){
	
			painel = new JPanel();
			painel.setLayout(null);
			painel.repaint();
			painel.validate();
			painel.add(getVerifica());
			painel.add(getImagem());
			painel.add(getSliderA());
			painel.add(getSliderB());
			painel.add(getSliderC());
			painel.add(getSegmento1());
			painel.add(getSegmento2());
			painel.add(getSegmento3());
			painel.add(getValor1());
			painel.add(getValor2());
			painel.add(getValor3());
			painel.add(getResultado());
			painel.add(getTipoTriangulo());
	
		}
		return painel;
	}

	public JButton getVerifica() {
		
		if(verifica == null){
	
			verifica = new JButton("Verificar");
			verifica.setBounds(358, 209, 87, 28);
	
		}
		
		return verifica;
	}

	public JLabel getImagem() {
		
		if(imagem == null){
	
			imagem = new JLabel();
			imagem.setBounds(304, 11, 170, 132);
			imagem.setIcon(new ImageIcon("C:\\Users\\josim\\OneDrive\\Imagens\\triangulo2.png"));
			
	
		}
		return imagem;
	}

	public JLabel getResultado() {
		
		if(resultado == null){
	
			resultado = new JLabel();
			resultado.setBounds(67, 40, 154, 28);
			resultado.setVisible(false);
	
		}
		return resultado;
	}

	public JLabel getTipoTriangulo() {
		
		if(tipoTriangulo == null){
	
			tipoTriangulo = new JLabel();
			tipoTriangulo.setBounds(67, 91, 148, 21);
			tipoTriangulo.setVisible(false);
	
		}
		return tipoTriangulo;
	}

	public JSlider getSliderA() {
		
		if(sliderA == null){
	
			sliderA = new JSlider(JSlider.HORIZONTAL, 0, 15, 7);
			sliderA.setBounds(108, 152, 170, 21);
	
		}
		return sliderA;
	}

	public JSlider getSliderB() {
		
		if(sliderB == null){
	
			sliderB = new JSlider(JSlider.HORIZONTAL, 0, 15, 7);
			sliderB.setBounds(108, 184, 170, 21);
	
		}
		return sliderB;
	}

	public JSlider getSliderC() {
		
		if(sliderC == null){
	
			sliderC = new JSlider(JSlider.HORIZONTAL, 0 , 15, 7);
			sliderC.setBounds(108, 216, 170, 21);
	
		}
		return sliderC;
	}

	public JLabel getSegmento1() {
		
		if(segmento1 == null){
	
			segmento1 = new JLabel("Segmento A");
			segmento1.setBounds(33, 152, 70, 21);
	
		}
		return segmento1;
	}

	public JLabel getSegmento2() {
		
		if(segmento2 == null){
	
			segmento2 = new JLabel("Segmento B");
			segmento2.setBounds(33, 184, 70, 21);
	
		}
		return segmento2;
	}

	public JLabel getSegmento3() {
		
		if(segmento3 == null){
	
			segmento3 = new JLabel("Segmento C");
			segmento3.setBounds(33, 213, 70, 21);
	
		}
		return segmento3;
	}

	public JLabel getValor1() {
		
		if(valor1 == null){
	
			valor1 = new JLabel("A");
			valor1.setBounds(288, 145, 29, 28);
	
		}
		return valor1;
	}

	public JLabel getValor2() {
		
		if(valor2 == null){
	
			valor2 = new JLabel("B");
			valor2.setBounds(288, 177, 29, 28);
	
		}
		return valor2;
	}

	public JLabel getValor3() {
		
		if(valor3 == null){
	
			valor3 = new JLabel("C");
			valor3.setBounds(288, 209, 29, 28);
	
		}
		return valor3;
	}

	public int a, b, c ;
	
	public void AddEvent(){
		
	
		
		getSliderA().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				getValor1().setText(Integer.toString( getSliderA().getValue() ) );
				
				a=getSliderA().getValue();
			}
		});
		
		getSliderB().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				getValor2().setText(Integer.toString( getSliderB().getValue() ) );
				
				b = getSliderB().getValue();
			}
		});
		
		getSliderC().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				getValor3().setText(Integer.toString(getSliderC().getValue()));
				
				c = getSliderC().getValue();
			}
		});
		
		getVerifica().addActionListener(this);
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == getVerifica()) {
			
			if((a < b+c) && (b< a+c) && (c< a+b)) {
				
				getResultado().setText("Forma um Triangulo");
				getResultado().setVisible(true);
				
				if(a == b && b == c) {
					
					getTipoTriangulo().setText("Triangulo Equilatero");
					getTipoTriangulo().setVisible(true);
					
				}else if((a == b && b!= c) || (a ==c && c!=b ) || (b==c && c!=a)  ) {
					
					getTipoTriangulo().setText("Triangulo isorceles");
					getTipoTriangulo().setVisible(true);
					
				}else if(a!=b && b!=c) {
					
					getTipoTriangulo().setText("Triangulo Escaleno");
					getTipoTriangulo().setVisible(true);;
				}
				
			}else {
				
				getResultado().setText("Não Forma um Triangulo");
				getResultado().setVisible(true);
				getTipoTriangulo().setVisible(false);;
			}
			
		
			
		}
		
	}
	
	
}
