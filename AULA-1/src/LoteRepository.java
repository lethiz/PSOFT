
import java.util.ArrayList;

public class LoteRepository {
    private ArrayList listaLotes;

    public LoteRepository(){
        this.listaLotes = new ArrayList<Lote>();
    }

    public void addLote(Lote newLote){
        this.listaLotes.add(newLote);
    }

    public ArrayList listarLotes(){
        return this.listaLotes;
    }
}
