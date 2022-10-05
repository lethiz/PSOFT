import java.util.ArrayList;
import java.util.HashMap;

public class Fachada {

    private LoteService loteService;
    private ProdutoService produtoService;

    public Fachada(){
        this.loteService = new LoteService();
        this.produtoService = new ProdutoService();
    }

    public Produto cadastrarProduto(Integer newId, String newNome, double newPreco, String newFrabicante){
        return this.produtoService.cadastrarProduto(newId, newNome, newPreco, newFrabicante);
    }

    public Lote cadastradarLote(int newQuantidade, String newData, Produto newProduto){
        return this.loteService.cadastrarLote(newQuantidade, newData, newProduto);
    }

    public ArrayList listarProdutos(){
        return this.produtoService.listarProdutos();
    }

    public ArrayList listarLotes(){
        return this.loteService.listarLotes();
    }

}
