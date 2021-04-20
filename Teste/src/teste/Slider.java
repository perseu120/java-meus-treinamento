package teste;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
 
public class Slider extends JPanel implements ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Declara componentes
    JLabel titulo;
    JLabel valor;
    JSlider slider;
    JButton botao;
 
    // Declara variaveis
    int sMin = 0;
    int sMax = 50;
    int sPos = 25;
    String mostraValor = "Valor escolhido �: ";
 
    Slider()
    {
        // Cria componentes
        titulo = new JLabel("Desenvolvimento Aberto - JSlider");
        valor = new JLabel(mostraValor);
        slider = new JSlider(JSlider.HORIZONTAL, sMin, sMax, sPos);
        botao = new JButton("Ok");
 
        // Adiciona propriedades ao componentes
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
 
        botao.addActionListener(this);
 
        // Cria layout
        GridLayout layout = new GridLayout(0,1,5,10);
 
        setLayout(layout);
 
        // Adiciona componentes no painel
        add(titulo);
        add(valor);
        add(slider);
        add(botao);
 
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
 
    }
 
    public void actionPerformed(ActionEvent arg0)
    {
        // Evento do bot�o
        if (arg0.getSource() == botao)
        {
            valor.setText(mostraValor + String.valueOf(slider.getValue()));
        }
 
    }
 
     private static void mostraGui()
        {
            // Cria GUI
            JFrame formulario = new JFrame("JSlider");
            formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
            JComponent painel = new Slider();
            painel.setOpaque(true);
 
            formulario.setContentPane(painel);
            formulario.pack();
            formulario.setVisible(true);
        }
 
    public static void main(String[] args)
    {
 
        // Mostra GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
 
                mostraGui();
 
            }
        });
 
    }
}