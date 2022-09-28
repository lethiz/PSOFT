import java.util.Objects;

public class Produto {
    private String nome;
    private  double preco;
    private String frabricante;

    public Produto(String newNome, double newPreco, String newFrabicante){
        this.nome = newNome;
        this.preco = newPreco;
        this.frabricante = newFrabicante;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFrabricante() {
        return frabricante;
    }

    public void setFrabricante(String frabricante) {
        this.frabricante = frabricante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 && Objects.equals(nome, produto.nome) && Objects.equals(frabricante, produto.frabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, frabricante);
    }
}
