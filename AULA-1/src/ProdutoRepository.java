import java.util.HashMap;

public class ProdutoRepository {
    private HashMap listaProdutos;

    public ProdutoRepository(){
        this.listaProdutos = new HashMap<Integer, Produto>();
    }

    public void addProduto( Integer newId, Produto newProduto){
        this.listaProdutos.put(newId, newProduto);
    }

    public HashMap<Integer, Produto> listarProdutos(){
        return this. listaProdutos;
    }

}
