public class Sistema {
    public static void main(String[] args) {
        Produto produtinho = new Produto("Computador", 500000, "Samsung");
        Lote lotinho = new Lote(13, "28-09-2022", produtinho);
    }
}