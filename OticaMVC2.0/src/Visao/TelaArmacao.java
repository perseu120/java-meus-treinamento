package Visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaArmacao extends JPanel {

	/**
	 * Create the panel.
	 */
	private JComboBox armacaoMaterial;
    private JComboBox armacaoCor;
    private JComboBox armacaoFormato;
    private JPanel painelArmacao;
    private JComboBox armacaoMarca;
    private JComboBox armacaoTamanho;
    private JButton confirmar;
    private JButton cancelar; 
    private JLabel jLabelImagemInicial;
    
    
    public TelaArmacao(){
            setLayout(null);
            this.add(getArmacaoMaterial());
            this.add(getArmacaoCor());
            this.add(getArmacaoFormato());
            this.add(getArmacaoMarca());
            this.add(getArmacaoTamanho());
            this.add(getCancelarButton());
            this.add(getConfirmarButton());
            add(getJLabelImagemInicial());
            
    		
   
    }
    
    public JComboBox getArmacaoMaterial(){
        if(armacaoMaterial==null){
            armacaoMaterial = new JComboBox<String>();
            armacaoMaterial.setBorder(new TitledBorder(null, "Material", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            armacaoMaterial.setBounds(21, 45, 170, 48);
            armacaoMaterial.addItem("-----");
            armacaoMaterial.addItem("Pau");
            armacaoMaterial.addItem("ferro");
            armacaoMaterial.addItem("plastico");
            armacaoMaterial.addItem("aço");
            armacaoMaterial.addItem("Adamantium");
            
        }
        
        return armacaoMaterial;   
    }
    
    public JComboBox getArmacaoCor(){
        if(armacaoCor==null){
            armacaoCor = new JComboBox<String>();
            armacaoCor.setBorder(new TitledBorder(null, "Cor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            armacaoCor.setBounds(245, 121, 170, 48);
            armacaoCor.addItem("-----");
            armacaoCor.addItem("azul");
            armacaoCor.addItem("verde");
            armacaoCor.addItem("amarelo");
            armacaoCor.addItem("preto");
            armacaoCor.addItem("dourado");
            
        }
        
        return armacaoCor;   
    }
    
    public JComboBox getArmacaoFormato(){
        if(armacaoFormato==null){
            armacaoFormato = new JComboBox<String>();
            armacaoFormato.setBorder(new TitledBorder(null, "Formato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            armacaoFormato.setBounds(245, 45, 170, 48);
            armacaoFormato.addItem("-----");
            armacaoFormato.addItem("Redondo");
            armacaoFormato.addItem("Quadrado");
            armacaoFormato.addItem("Triangulo");
            armacaoFormato.addItem("Oval");
            armacaoFormato.addItem("Retangular");
        
        }
        
        return armacaoFormato;   
    }
 
    public JComboBox getArmacaoMarca(){
        if(armacaoMarca==null){
            armacaoMarca = new JComboBox<String>();
            armacaoMarca.setBorder(new TitledBorder(null, "Marca", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            armacaoMarca.setBounds(131, 184, 170, 48);
            armacaoMarca.addItem("-----");
            armacaoMarca.addItem("Burberry");
            armacaoMarca.addItem("Ray Ban");
            armacaoMarca.addItem("Oakley");
            armacaoMarca.addItem("Gucci");
            armacaoMarca.addItem("Chili Beans");
        
        }
        
        return armacaoMarca;   
    }  
    
    public JComboBox getArmacaoTamanho(){
        if(armacaoTamanho==null){
            armacaoTamanho = new JComboBox<String>();
            armacaoTamanho.setBorder(new TitledBorder(null, "Tamanho", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            armacaoTamanho.setBounds(21, 121, 170, 48);
            armacaoTamanho.addItem("-----");
            armacaoTamanho.addItem("GG");
            armacaoTamanho.addItem("G");
            armacaoTamanho.addItem("M");
            armacaoTamanho.addItem("P");
            armacaoTamanho.addItem("PP");
        
        }
        
        return armacaoTamanho;   
    }  
    
    public JButton getConfirmarButton() {
        if(confirmar == null) {
            confirmar = new JButton();
            confirmar.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            	}
            });
            confirmar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
            confirmar.setBounds(92, 258, 100, 30);
            confirmar.setText("Confimar");
            confirmar.setBackground(Color.WHITE);

        }
        
        return confirmar;
    }
    
    public JButton getCancelarButton() {
        
        if(cancelar == null) {
            cancelar = new JButton();
            cancelar.setBounds(245, 258, 100, 30);
            cancelar.setText("Cancelar");
            cancelar.setBackground(Color.WHITE);

        }
        
        return cancelar;
    }
    
    public JLabel getJLabelImagemInicial() {
		if (jLabelImagemInicial == null) {
			jLabelImagemInicial = new JLabel("");
			jLabelImagemInicial.setIcon(new ImageIcon(TelaArmacao.class.getResource("/imagem/oculos colorido.jpg")));
			jLabelImagemInicial.setBounds(0, 0, 450, 300);
		}
		return jLabelImagemInicial;
	}
}