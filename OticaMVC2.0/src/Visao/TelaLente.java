package Visao;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class TelaLente extends JPanel {

	 	private JComboBox lenteMaterial;
	    private JComboBox lenteTipo;
	    private JComboBox lenteGrau;
	    private JButton confirmar;
	    private JButton cancelar;
	    private JLabel jLabelImagemInicial;
	    
	    public TelaLente() {
	    	
	    	setLayout(null);
	    	repaint();
	    	validate();
	    	add(getLenteMaterial());
	    	add(getLenteTipo());
	    	add(getLenteGrau());
	    	add(getJButtonConfimar());
	    	add(getJButtonCancelar());
	    	
	    	
	    	
	    	add(getJLabelImagemInicial());
	    	
		}
	    
	    
	    public JLabel getJLabelImagemInicial() {
			if (jLabelImagemInicial == null) {
				jLabelImagemInicial = new JLabel("");
				jLabelImagemInicial.setIcon(new ImageIcon(TelaLente.class.getResource("/imagem/oculos colorido.jpg")));
				jLabelImagemInicial.setBounds(0, 0, 450, 300);
			}
			return jLabelImagemInicial;
		}
	    




		public JButton getConfirmar() {
			if(confirmar== null){
		
				confirmar = new JButton();
		
			}
			
			return confirmar;
		}



		public JButton getCancelar() {
			if(cancelar== null){
		
				cancelar = new JButton();
		
			}
			
			return cancelar;
		}

		public JComboBox getLenteMaterial(){
			
	        if(lenteMaterial==null){
	            lenteMaterial = new JComboBox<String>();
	            lenteMaterial.setBorder(new TitledBorder(null, "Material", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	            lenteMaterial.setBounds(110, 23, 227, 48);
	            lenteMaterial.addItem("-----");
	            lenteMaterial.addItem("vidro");
	            lenteMaterial.addItem("resina");
	            lenteMaterial.addItem("policarbonato");
	            lenteMaterial.addItem("trivez");
	            lenteMaterial.addItem("diamante");
	        }
	        
	        return lenteMaterial;   
	    }
	    
	    public JComboBox getLenteTipo(){
	        if(lenteTipo==null){
	            lenteTipo = new JComboBox<String>();
	            lenteTipo.setBorder(new TitledBorder(null, "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	            lenteTipo.setBounds(110, 96, 227, 48);
	            lenteTipo.addItem("-----");
	            lenteTipo.addItem("comum");
	            lenteTipo.addItem("transition");
	            lenteTipo.addItem("solar");
	            lenteTipo.addItem("anti reflexo");
	            lenteTipo.addItem("bifocal");
	        }
	        return lenteTipo;
	        
	    }
	    
	    public JComboBox getLenteGrau(){
	        if(lenteGrau==null){
	            lenteGrau = new JComboBox<String>();
	            lenteGrau.setBorder(new TitledBorder(null, "Grau", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	            lenteGrau.setBounds(110, 166, 227, 48);
	            lenteGrau.addItem("-----");
	            lenteGrau.addItem("0,25");
	            lenteGrau.addItem("0,50");
	            lenteGrau.addItem("1,00");
	            lenteGrau.addItem("1,50");
	            lenteGrau.addItem("2,00");
	        }
	        return lenteGrau;   
	    }
	    
	    public JButton getJButtonConfimar() {
	        if(confirmar == null) {
	            confirmar = new JButton();
	            confirmar.setBounds(110, 242, 100, 30);
	            confirmar.setText("Confimar");
	        }
	        
	        return confirmar;
	    }
	    
	    public JButton getJButtonCancelar() {
	        
	        if(cancelar == null) {
	            cancelar = new JButton();
	            cancelar.setText("Cancelar");
	            cancelar.setBounds(237, 242, 100, 30);

	        }
	        
	        return cancelar;
	    }
	
	
}
