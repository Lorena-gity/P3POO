public class Produtos {
    private int idProduto;
    private String codigoBarras;
    private int quantidadeEstoque;
    private double preco;
    // FormaDeVenda formaVenda;
    // TipoProduto tipo;

    // public String getCodigoBarras() {}

    // public double getPreco() {}

    // public double getQuantidade() {}

    public void adicionarProduto(double quantidadeEstoque) {
        quantidadeEstoque++;
    }

    // public boolean removerEstoque(double quantidadeEstoque) {}

    public void atualizarDados(double novoPreco) {
        preco = novoPreco;
    }


    // pra cadastrar o produto vou ter que criar um construtor
}
