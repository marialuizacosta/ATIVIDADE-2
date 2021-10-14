public class Questao4 {
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        produto.setNome("OVO");
        produto.setPreco(2.99f);
        produto.setQuantidade(10);

        System.out.println("\nProduto: "+produto.getNome());
        System.out.println("Valor: "+produto.getPreco());
        System.out.println("Quantidade: "+produto.getQuantidade());

        produto.comprar();
        System.out.println("Quantidade: "+produto.getQuantidade());

        produto.comprar();
        System.out.println("Quantidade: "+produto.getQuantidade());

        for (int i = 0; i < 9; i++) {
            produto.comprar();
        }
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
