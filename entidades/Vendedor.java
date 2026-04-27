package entidades;

public class Vendedor extends Usuario {
	
	public Nota criarNota(GerenciadorSistema sistema) {}

    public void adicionarItem(GerenciadorSistema sistema, Nota n, Produto p, int qtd) {}

    public void removerItem(GerenciadorSistema sistema, Nota n, Produto p) {}

    public void trocarItem(GerenciadorSistema sistema, Nota n, Produto antigo, Produto novo, int qtd) {}

    public double fecharVenda(GerenciadorSistema sistema, Nota n) {}

}
