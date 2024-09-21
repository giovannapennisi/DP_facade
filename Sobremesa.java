public class Sobremesa implements Produto{

    private int ml;
    private String descricao;
    private double preco;


   public Sobremesa (int ml, String descricao, double preco) {
        this.ml = ml;
        this.descricao = descricao;
        this.preco = preco;
    }
    
      public int getMl() {
        return ml;
    }
    
    public void setML(int ml) {
        this.ml = ml;
    }

    
    public String getDescricao() {
        return descricao;
    }

  
    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }

   
    public double getPreco() {
       return preco;
    }

   
    public void setPreco(double preco) {
       this.preco = preco;
    }
    
}