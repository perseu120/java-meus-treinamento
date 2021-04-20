package otica;



public class Armacao
{
    private String material;
    private float precomaterial;
    private String cor;
    private float precocor;
    private String formato;
    private float precoformato;
    private String marca;
    private float precomarca;
    private String tamanho;
    private float precotamanho;
    private int estock = 0;
    
    public Armacao(){
        
    }
    
    public Armacao(String material, String cor,String formato,String marca,String tamanho){
        this.material = material;
        this.cor = cor;
        this.formato = formato;
        this.marca = marca;
        this.tamanho = tamanho;
  
    }
    
    public void setMaterial (String material){
        this.material = material;
    }
    
    public String getMaterial (){     
        return material;
    }
    
    public void setPrecoMaterial (float precomaterial){     
         this.precomaterial = precomaterial;
    }
    
    public float getPrecoMaterial (){     
        return precomaterial;
    }
    
    public void setCor (String cor){
        this.cor = cor;
    }
    
    public String getCor (){    
        return cor;
    }
    
    public void setPrecoCor (float precocor){     
         this.precocor = precocor;
    }
    
    public float getPrecoCor (){    
        return precocor;
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getMarca (){       
        return marca;
    }
    
    public void setPrecoMarca (float precomarca){     
         this.precomarca = precomarca;
    }
    
    public float getPrecoMarca (){       
        return precomarca;
    }
    
    public String getFormato (){       
        return formato;
    }
    
    public void setFormato (String formato){
        this.formato = formato;
    }
    
    public void setPrecoFormato (float precoformato){     
         this.precoformato = precoformato;
    }
    
    public float getPrecoFormato (){       
        return precomarca;
    }
    
    public void setTamanho (String tamanho){
        this.tamanho = tamanho; 
    }
    
    public String getTamanho (){        
        return tamanho;
    }
    
    public void setPrecoTamanho (float precotamanho){     
         this.precotamanho = precotamanho;
    }
    
    public float getPrecoTamanho (){       
        return precotamanho;
    }
    
    
}
