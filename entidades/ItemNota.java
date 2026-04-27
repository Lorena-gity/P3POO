package entidades;

public class ItemNota {
    private double quantidade;
    private double precoUnitario;
    private Produto produto;

    // Construtores
    public ItemNota() {}
    
    public ItemNota(double quantidade, double precoUnitario, Produto produto) {
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.produto = produto;
	}

    // Getters e Setters
	public double getQuantidade() {
		return quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public Produto getProduto() {
		return produto;
	}
	

	// métodos públicos
    public void alterarQuantidade(Integer qtd) {
    	this.quantidade = qtd;
    }
    
    public void alterarPreco(Double preco) {
    	this.precoUnitario = preco;
    }
    
    //public void trocarProduto(Produto produto) {}
    
    public double calcularSubTotal() {
    	return quantidade * precoUnitario;
    }
}