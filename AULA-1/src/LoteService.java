import java.util.ArrayList;
import java.util.Arrays;

public class LoteService {

    private LoteRepository loteRepository;

    public LoteService(){
        this.loteRepository = new LoteRepository();
    }

    public Lote cadastrarLote(int newQuantidade, String newData, Produto newProduto){
        Lote newLote = new Lote(newQuantidade, newData, newProduto);
        this.loteRepository.addLote(newLote);
        return newLote;
    }

    public ArrayList listarLotes(){
        ArrayList lotes = this.loteRepository.listarLotes();
        return lotes;
    }

}





