import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    public static void main(String[] args) {
        Fachada fachadinha = new Fachada();

        Produto computerzinhoSamsung =  fachadinha.cadastrarProduto(1, "Notebook X50", 500000, "Samsung");
        Produto computerzinhoApple =  fachadinha.cadastrarProduto(2, "Macbook Air", 1000000, "Apple");

        System.out.println(computerzinhoSamsung);
        System.out.println(computerzinhoApple);

        Lote loteSamsung = fachadinha.cadastradarLote(20, "04/10/2002", computerzinhoSamsung);
        Lote loteApple = fachadinha.cadastradarLote(10, "04/10/2002", computerzinhoApple);

        System.out.println(loteSamsung);
        System.out.println(loteApple);

        ArrayList produtos = fachadinha.listarProdutos();
        ArrayList lotes = fachadinha.listarLotes();

        System.out.println(produtos);
        System.out.println(lotes);
    }
}