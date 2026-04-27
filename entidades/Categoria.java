package entidades;
import entidades.FormaDeVenda;

public class Categoria {
    private int idCategoria;
    private String nomeCategoria;
    private FormaDeVenda formaVenda;
    
    // Construtores
    public Categoria() {}
    
    public Categoria(int idCategoria, String nomeCategoria, FormaDeVenda formaVenda) {
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.formaVenda = formaVenda;
	}

	public Integer getIdCategoria() {
        return idCategoria;
    }
   
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public FormaDeVenda getFormaDeVenda() {
        return formaVenda;
    }

    public void setNomeCategoria(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido");
        } else {
            this.nomeCategoria = nome;
        }
    }

    public void setFormaVenda(FormaDeVenda formaVenda) {
        if (formaVenda == null) {
            this.formaVenda = FormaDeVenda.UNIDADE;
        } else {
            this.formaVenda = formaVenda;
        }
    }
}