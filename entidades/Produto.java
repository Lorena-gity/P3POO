package entidades;
public class Produto {
    private int idProduto;
    private String codigoBarras;
    private String nome;
    private int quantidadeEstoque;
    private double preco;
    private TipoProduto tipo;

    // Construtores
    public Produto() {}
    
    public Produto(int idProduto, String codigoBarras, String nome, int quantidadeEstoque, double preco, TipoProduto tipo) {
		this.idProduto = idProduto;
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.quantidadeEstoque = quantidadeEstoque;
		this.preco = preco;
		this.tipo = tipo;
	}   

	// Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }
   
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNome() {
        return nome;
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

    public void setNome(String nome) {
    	if (nome == null || nome.isEmpty()) {
            System.out.println("Nome de produto inválido.");
        } else {
            this.nome = nome;
        }
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
            System.out.println("Categoria inválida");
        } else {
            this.tipo = tipo;
        }
    }

    // métodos públicos
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