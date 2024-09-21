public class Burguer implements Produto {

    private int gramas;
    private String descricao;
    private double preco;

    public Burguer(int gramas, String descricao, double preco) {
        this.gramas = gramas;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
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