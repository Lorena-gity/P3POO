package entidades;
import java.util.List;

public class GerenciadorSistema {
    private Usuario usuarioLogado;
    //private List<Produto> bancoProdutos;
    //private List<TipoProduto> bancoTipos;
    List<Produto> produtos;

    void cadastrarProduto(Usuario u, Produto p) {
    
    }

    Produto buscarPorCodigo(String codigo) {
        return null; // implementação
    }

    Nota criarNotaVenda(Usuario u) {
        return new Nota();
    }
  
}