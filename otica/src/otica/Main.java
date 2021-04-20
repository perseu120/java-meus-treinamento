package otica;


/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;

public class Main
{ 
    public static void main (String [] args){
        
        Grafic grafico = new Grafic();
/*        
        Armacao armacao[] = new Armacao[5];
        Lente lente[] = new Lente[5];
   
        Vendedor paulo = new Vendedor("paulo", "123-45678", "123456", 998.00f);
        Vendedor caique = new Vendedor("caique", "098-54321", "456789", 998.00f);
        Vendedor rodrigo = new Vendedor("rodrigo", "543-32176", "098765", 998.00f);
        
        
        for(int i=0; i<5; i++){
           armacao[i] = new Armacao();
           lente[i] = new Lente();
           
        }
        
        
        armacao[0].setMaterial ("pau");
        armacao[1].setMaterial ("ferro");
        armacao[2].setMaterial ("plastico");
        armacao[3].setMaterial ("aço");
        armacao[4].setMaterial ("Adamantium");
        
        armacao[0].setCor ("azul");
        armacao[1].setCor ("verde");
        armacao[2].setCor ("amarelo");
        armacao[3].setCor ("preto");
        armacao[4].setCor ("dourado");
        
        armacao[0].setFormato ("Redondo");
        armacao[1].setFormato ("Quadrado");
        armacao[2].setFormato ("Triangulo ");
        armacao[3].setFormato ("Oval ");
        armacao[4].setFormato ("Retangular");       
        
        armacao[0].setMarca ("Burberry");
        armacao[1].setMarca ("Ray Ban");
        armacao[2].setMarca ("Oakley ");
        armacao[3].setMarca ("Gucci ");
        armacao[4].setMarca ("Chili Beans");  
        
        armacao[0].setTamanho ("GG");
        armacao[1].setTamanho ("G");
        armacao[2].setTamanho ("M ");
        armacao[3].setTamanho ("P ");
        armacao[4].setTamanho ("PP");  

        armacao[0].setPrecoMaterial (10.00f);
        armacao[1].setPrecoMaterial (20.00f);
        armacao[2].setPrecoMaterial (30.00f);
        armacao[3].setPrecoMaterial (40.00f);
        armacao[4].setPrecoMaterial (50.00f);
        
        armacao[0].setPrecoCor (2.00f);
        armacao[1].setPrecoCor (2.00f);
        armacao[2].setPrecoCor (2.00f);
        armacao[3].setPrecoCor (2.00f);
        armacao[4].setPrecoCor (5.00f);
        
        armacao[0].setPrecoFormato (1.00f);
        armacao[1].setPrecoFormato (1.00f);
        armacao[2].setPrecoFormato (1.00f);
        armacao[3].setPrecoFormato (1.00f);
        armacao[4].setPrecoFormato (1.00f);
        
        armacao[0].setPrecoMarca (200.00f);
        armacao[1].setPrecoMarca (452.00f);
        armacao[2].setPrecoMarca (153.00f);
        armacao[3].setPrecoMarca (332.00f);
        armacao[4].setPrecoMarca (123.00f);
        
        armacao[0].setPrecoTamanho (18.00f);
        armacao[1].setPrecoTamanho (15.00f);
        armacao[2].setPrecoTamanho (13.00f);
        armacao[3].setPrecoTamanho (10.00f);
        armacao[4].setPrecoTamanho (5.00f);
        
        lente[0].setMaterial ("vidro");
        lente[1].setMaterial ("resina");
        lente[2].setMaterial ("policarbonato");
        lente[3].setMaterial ("trivez");
        lente[4].setMaterial ("diamante");
        
        lente[0].setTipo ("comum");
        lente[1].setTipo ("transition");
        lente[2].setTipo ("solar");
        lente[3].setTipo ("anti reflexo");
        lente[4].setTipo ("bifocal");
        
        lente[0].setGrau ("0,25");
        lente[1].setGrau ("0,50");
        lente[2].setGrau ("1,00");
        lente[3].setGrau ("1,50");
        lente[4].setGrau ("2,00");
        
        lente[0].setPrecoMaterial (53.00f);
        lente[1].setPrecoMaterial (68.00f);
        lente[2].setPrecoMaterial (74.00f);
        lente[3].setPrecoMaterial (82.00f);
        lente[4].setPrecoMaterial (150.00f);       
        
        lente[0].setPrecoTipo (30.00f);
        lente[1].setPrecoTipo (67.00f);
        lente[2].setPrecoTipo (40.00f);
        lente[3].setPrecoTipo (100.00f);
        lente[4].setPrecoTipo (98.00f);  
        
        lente[0].setPrecoGrau (20.00f);
        lente[1].setPrecoGrau (30.00f);
        lente[2].setPrecoGrau (40.00f);
        lente[3].setPrecoGrau (50.00f);
        lente[4].setPrecoGrau (60.00f); 
        
        int op;
        int oculos= 2;
    while(oculos > 0 ){  
        
        op = Integer.parseInt(JOptionPane.showInputDialog("MATERIAL DA ARMAÇÃO\n 0 - pau\n1 - ferro\n2 - plastico\n3 - aço\n4 - adamantium "));
        
        
        float precomaterial = 0.0f;
        float precocor = 0.0f;
        float precoformato = 0.0f;
        float precomarca = 0.0f;
        float precotamanho = 0.0f;
        
      
        
        switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                precomaterial = armacao[0].getPrecoMaterial();
            }
            case 1 :{
                precomaterial = armacao[1].getPrecoMaterial();
            }
            
            case 2 :{
                precomaterial = armacao[2].getPrecoMaterial();
            }
            
            case 3 :{
                precomaterial = armacao[3].getPrecoMaterial();
            }
            
            case 4 :{
                precomaterial = armacao[4].getPrecoMaterial();
            }
               
            
        }
            
        op = Integer.parseInt(JOptionPane.showInputDialog("COR DA ARMAÇÃO\n 0 - azul\n1 - verde\n2 - amarelo\n3 - preto\n4 - dourado "));
        
         switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                precocor = armacao[0].getPrecoCor();
            }
            case 1 :{
                 precocor = armacao[1].getPrecoCor();
            }
            
            case 2 :{
                 precocor = armacao[2].getPrecoCor();
            }
            
            case 3 :{
                precocor = armacao[3].getPrecoCor();
            }
            
            case 4 :{
                 precocor = armacao[4].getPrecoCor();
            }
               
            
        }      

            
        op = Integer.parseInt(JOptionPane.showInputDialog("FORMATO DA ARMAÇÃO\n 0 - Redondo\n1 - Quadrado\n2 - Triangulo\n3 - Oval\n4 - Retangular"));

        
         switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                 precoformato = armacao[0].getPrecoFormato();
            }
            case 1 :{
                 precoformato = armacao[1].getPrecoFormato();
            }
            
            case 2 :{
                 precoformato = armacao[2].getPrecoFormato();
            }
            
            case 3 :{
                 precoformato = armacao[3].getPrecoFormato();
            }
            
            case 4 :{
                 precoformato = armacao[4].getPrecoFormato();
            }
               
            
        }         
        
            
        op = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A MARCA ARMAÇÃO\n 0 - Burberry\n1 - Ray Ban\n2 - Oakley\n3 - Gucci\n4 - Chili Beans"));

        
         switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                 precomarca = armacao[0].getPrecoMarca();
            }
            case 1 :{
                 precomarca = armacao[1].getPrecoMarca();
            }
            
            case 2 :{
                 precomarca = armacao[2].getPrecoMarca();
            }
            
            case 3 :{
                 precomarca = armacao[3].getPrecoMarca();
            }
            
            case 4 :{
                 precomarca = armacao[4].getPrecoMarca();
            }
               
            
        }
            
        op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O TAMANHO ARMAÇÃO\n 0 - GG\n1 - G\n2 - M\n3 - P\n4 - PP"));
 
        
        switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                 precotamanho = armacao[0].getPrecoTamanho();
            }
            case 1 :{
                 precotamanho = armacao[1].getPrecoTamanho();
            }
            
            case 2 :{
                 precotamanho = armacao[2].getPrecoTamanho();
            }
            
            case 3 :{
                 precotamanho = armacao[3].getPrecoTamanho();
            }
            
            case 4 :{
                 precotamanho = armacao[4].getPrecoTamanho();
            }
               
            
        }   
        
        float lentematerial = 0.0f;
        float tipo = 0.0f;
        float grau = 0.0f;
       
            
        op = Integer.parseInt(JOptionPane.showInputDialog("MATERIAL DA LENTE\n 0 - vidro\n1 - resina\n2 - policarbonato\n3 - trivez\n4 - diamante"));
 
        
        switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                 lentematerial = lente[0].getPrecoMaterial();
            }
            case 1 :{
                 lentematerial = lente[1].getPrecoMaterial();
            }
            
            case 2 :{
                 lentematerial = lente[2].getPrecoMaterial();
            }
            
            case 3 :{
                 lentematerial = lente[3].getPrecoMaterial();
            }
            
            case 4 :{
                 lentematerial = lente[4].getPrecoMaterial();
            }
               
            
        }
        
        op = Integer.parseInt(JOptionPane.showInputDialog("TIPO DA LENTE\n 0 - comum\n1 - transition\n2 - solar\n3 - anti reflexo\n4 - bifocal"));
 
        
        switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                 tipo = lente[0].getPrecoTipo();
            }
            case 1 :{
                 tipo = lente[1].getPrecoTipo();
            }
            
            case 2 :{
                 tipo = lente[2].getPrecoTipo();
            }
            
            case 3 :{
                 tipo = lente[3].getPrecoTipo();
            }
            
            case 4 :{
                 tipo = lente[4].getPrecoTipo();
            }
               
            
        }
            
        op = Integer.parseInt(JOptionPane.showInputDialog("GRAU DA LENTE\n 0 - 0,25\n1 - 0,50\n2 - 1,00\n3 - 1,50\n4 - 2,00"));
 
        
        switch(op){
            
            case 0 :{
               //material = armacao[0].getMaterial() ;
                 grau = lente[0].getPrecoGrau();
            }
            case 1 :{
                 grau = lente[1].getPrecoGrau();
            }
                
            case 2 :{
                 grau = lente[2].getPrecoGrau();
            }
            
            case 3 :{
                 grau = lente[3].getPrecoGrau();
            }
            
            case 4 :{
                 grau = lente[4].getPrecoGrau();
            }
               
            
        }
        
    
        float total = lentematerial + tipo + grau +precomaterial+precocor+precoformato+precomarca+precotamanho;
        float lent = tipo + grau + lentematerial;
        float arma = precomaterial + precocor + precoformato + precomarca + precotamanho;
        
        
        JOptionPane.showMessageDialog(null , "valor total do oculos " + total + "\n valor da armação " + arma + "\nvalor da lente "+ lent);
        int montagem;
        
        int codvendedor;
        codvendedor = Integer.parseInt(JOptionPane.showInputDialog("Qqual vendedor ti atendeu?\nPaulo - 1\nCaique - 2\nRodrigo - 3"));;
        
        
        montagem = Integer.parseInt(JOptionPane.showInputDialog("Deseja que o vendedor monte seu oculos?\nSIM - 1\nNÂO - 0"));
        
        
        if(codvendedor == 1){
            if(montagem ==1){
                paulo.setComissao((total*0.03f)+10.00f );
            }else{
                paulo.setComissao((total*0.03f) );
                
            }
             oculos = paulo.baixaEstoque( oculos);
        }
        else if(codvendedor == 2){
            if(montagem ==1){
                caique.setComissao((total*0.03f)+10.00f );
            }else{
                caique.setComissao((total*0.03f) );
                
            }
             oculos = caique.baixaEstoque( oculos);
        }
        else if(codvendedor == 3){
            if(montagem ==3){
                rodrigo.setComissao((total*0.03f)+10.00f );
                 
            }else{
                rodrigo.setComissao((total*0.03f) );
                 
            }
            
             oculos = rodrigo.baixaEstoque( oculos);
        }
        
        
        
        
    }  
          
        float salariop =  paulo.getSalario() + paulo.getComissao();
        float salarioc = caique.getSalario() + caique.getComissao();
        float salarior = rodrigo.getSalario() + rodrigo.getComissao();
        
        JOptionPane.showMessageDialog(null , "FOLHA DE PAGAMENTO\n Paulo: " + salariop + "\nCaique: " + salarioc + "\nRodrigo: " + salarior  );
*/
        
    /*    
    String material = JOptionPane.showInputDialog("por favor, digite o material da armação"); 
    String cor = JOptionPane.showInputDialog("por favor, digite a cor da armação");
    String formato = JOptionPane.showInputDialog("por favor, digite o formato da armação");
    String marca = JOptionPane.showInputDialog("por favor, digite a marca da armação");
    String tamanho = JOptionPane.showInputDialog("por favor, digite o tamanho da armação"); 
    String mat = JOptionPane.showInputDialog("por favor, digite o material da lente");
    String tipo = JOptionPane.showInputDialog("por favor, digite o tipo da lente");
    String grau = JOptionPane.showInputDialog("por favor, digite o grau da lente");
    float preco = Float.parseFloat(JOptionPane.showInputDialog("por favor, digite o preço dos óculos"));
    int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("por favor, digite o ano de fabricação dos óculos")); 
    String linha = JOptionPane.showInputDialog("por favor, digite a linha dos óculos");*/
        // Oculos oculos = new Oculos(material, cor,formato,marca,tamanho, mat,tipo,grau, preco, anoFabricacao, linha)
        
        
        //JOptionPane.showMessageDialog(null, "ano de fabricacao: " + oculos.getAnoFabricacao()
                                            //+ "\nlinha: " + oculos.getLinha()
                                            //+ "\ngrau da lente: " + oculos.getLente().getGrau());
        //oculos.setAnoFabricacao(2002);
        //oculos.getLente().setGrau("9 astigmatismo");
        
        
        
        
    }
}
