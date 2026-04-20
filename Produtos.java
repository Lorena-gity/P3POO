public class Produtos {
    private int idProduto;
    private String codigoBarras;
    private int quantidadeEstoque;
    private double preco;
    TipoProduto tipo;

    public int getIdProduto() {
        return idProduto;
    }
    
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras == null || codigoBarras.length() != 13) {
            System.out.println("Código de barras inválido.");
        } else {
            this.codigoBarras = codigoBarras;
        }
    }

    public void setTipo(TipoProduto tipo) {
        if (tipo == null) {
            System.out.println("Tipo de produto inválido");
        } else {
            this.tipo = tipo;
        }
    }

    public void adicionarProduto(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente");
            return false;
        } else {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
    }

    public void atualizarDados(double novoPreco) {
        if (novoPreco <= 0) {
            System.out.println("Preço inválido");
        } else {
            this.preco = novoPreco;
        }
    }
}