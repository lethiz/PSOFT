import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(){
        this.produtoRepository = new ProdutoRepository();
    }

    public Produto cadastrarProduto(Integer newId, String newNome, double newPreco, String newFrabicante){
        Produto newProduto = new Produto(newId, newNome, newPreco, newFrabicante);
        this.produtoRepository.addProduto(newId, newProduto);
        return newProduto;
    }

    public ArrayList listarProdutos(){
        ArrayList produtos = new ArrayList<>();
        produtos.addAll(this.produtoRepository.listarProdutos().values());
        return produtos;
    }

}
