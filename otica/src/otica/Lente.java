package otica;


/**
 * Escreva a descrição da classe Lente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Lente
{
   private String material;
   private float precomaterial;
   private String tipo;
   private float precotipo;
   private String grau;
   private float precograu;

   
   public Lente(){
       
   }
   
   public Lente( String material,String tipo,String grau){
       this.material = material;
       this.tipo = tipo;
       this.grau = grau;
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
    
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo (){     
        return tipo;
    }
    
    public void setPrecoTipo (float precotipo){     
         this.precotipo = precotipo;
    }
    
    public float getPrecoTipo (){     
        return precotipo;
    }
    
    public void setGrau (String grau){
        this.grau = grau;
    }
    
    public String getGrau (){     
        return grau;
    }
    
    public void setPrecoGrau (float precograu){     
         this.precograu = precograu;
    }
    
    public float getPrecoGrau (){     
        return precograu;
    }
    
    
    
}
