package entidades;
public class Produto {
    private Integer idProduto;
    private String codigoBarras;
    private String nomeProduto;
    private String marca;
    private Integer quantidadeEstoque;
    private Double preco;
    private Categoria tipo;

    // Construtores
    public Produto() {}
    
    public Produto(Integer idProduto, String codigoBarras, String nomeProduto, String marca, Integer quantidadeEstoque,
			Double preco, Categoria tipo) {
		this.idProduto = idProduto;
		this.codigoBarras = codigoBarras;
		this.nomeProduto = nomeProduto;
		this.marca = marca;
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

    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public void setNomeProduto(String nome) {
    	this.nomeProduto = nome;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
    	this.marca = marca;
    }
    public double getPreco() {
        return preco;
    }


    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public Categoria getTipo() {
        return tipo;
    }


    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras == null || codigoBarras.length() != 13) {
            System.out.println("Código de barras inválido.");
        } else {
            this.codigoBarras = codigoBarras;
        }
    }


    public void setTipo(Categoria tipo) {
        if (tipo == null) {
            System.out.println("Tipo de produto inválido");
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