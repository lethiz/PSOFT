import java.util.Objects;

public class Lote {
    int quantidade;
    String data;
    Produto produto;

    public Lote(int newQuantidade, String newData, Produto newProduto){
        this.quantidade = newQuantidade;
        this.data = newData;
        this.produto = newProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lote lote = (Lote) o;
        return quantidade == lote.quantidade && Objects.equals(data, lote.data) && Objects.equals(produto, lote.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidade, data, produto);
    }

    @Override
    public String toString(){
        return this.quantidade + ": " + this.produto;
    }
}
