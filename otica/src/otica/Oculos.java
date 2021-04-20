package otica;


/**
 * Escreva a descrição da classe Oculos aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Oculos
{
    private Armacao armacao;
    private Lente lente;
    private float preco;
    private int anoFabricacao;
    private String linha;
    private int estoque;
    
    public Oculos(String material, String cor,String formato,String marca,String tamanho, 
                  String mat,String tipo,String grau,
                  float preco, int anoFabricacao, String linha, int estock, int estoque){
                      
                      armacao = new Armacao(material, cor, formato, marca, tamanho);
                      lente = new Lente(mat, tipo, grau);
                      this.preco = preco;
                      this.anoFabricacao = anoFabricacao;
                      this.linha = linha;
                      
    }
    
    public int getEstque(){
        return estoque;
    }
    
    public Armacao getArmacao(){
        return armacao;
    }
    
    public void setArmacao(Armacao armacao){
        this.armacao =  armacao;
    }
    
    public Lente getLente(){
        return lente;
    }
    
    public void setLente(Lente lente){
        this.lente =  lente;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public void setPreco(float preco){
        this.preco =  preco;
    }
    
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao =  anoFabricacao;
    }
    
    public String getLinha(){
        return linha;
    }
    
    public void setLinha(String linha){
        this.linha =  linha;
    }
   
}
