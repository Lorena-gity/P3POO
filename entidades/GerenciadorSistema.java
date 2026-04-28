package entidades;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorSistema {
    private Usuario usuarioLogado;
    private List<Produto> bancoProdutos;
    private List<TipoProduto> bancoTipos;

    public GerenciadorSistema(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
        this.bancoProdutos = new ArrayList<>();
        this.bancoTipos = new ArrayList<>();
    }

    public boolean login (String nome, String senha) {
        if (usuarioLogado != null && usuarioLogado.getNome().equals(nome) && usuarioLogado.autenticar(senha) == true) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Nome ou senha incorretos.");
            return false;
        }
    }

    public Produto pesquisarPorCodigo(String codigoBarras) {
        for (Produto produto : bancoProdutos) {
            if(produto.getCodigoBarras().equals(codigoBarras)) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> pesquisarPorNome(String nome) {
        List<Produto> encontrados = new ArrayList<>();


        for(Produto produto : bancoProdutos) {
            if (produto.getNome().contains(nome)) {
                encontrados.add(produto);
            } else {
                System.out.println("Produto não cadastrado.");
            }
        }
        return encontrados;
    }


    public boolean cadastrarProduto(Produto produto) {
        if (bancoProdutos.contains(produto)) {
            System.out.println("Produto já cadastrado");
            return false;
        } else {
            bancoProdutos.add(produto);
            System.out.println("Produto cadastrado com sucesso!");
            return true;
        }
    }


    public boolean alterarProduto(String codigoBarras, Produto novosDados) {
        for (Produto produto : bancoProdutos) {
            if (produto.getCodigoBarras().equals(codigoBarras)) {
                produto.setNome(novosDados.getNome());
                produto.setTipo(novosDados.getTipo());
                return true;
            }
        }
        return false;
    }


    public boolean deletarProduto(String codigoBarras) {
        for (Produto produto : bancoProdutos) {
            if (produto.getCodigoBarras().equals(codigoBarras)) {
                bancoProdutos.remove(produto);
                return true;
            }
        }
        return false;
    }


    public boolean cadastrarTipo(TipoProduto tipo) {
        for (TipoProduto t : bancoTipos) {
            if (t.getNome().equals(tipo.getNome())) {
                return false;
            }
        }
        bancoTipos.add(tipo);
        return true;
    }


    public boolean alterarTipo(int idTipo, TipoProduto novosDados) {
        for (TipoProduto t : bancoTipos) {
            if (t.getIdTipo() == idTipo) {
                t.setNome(novosDados.getNome());
                t.setFormaVenda(novosDados.getFormaDeVenda());
                return true;
            }
        }
        return false;
    }


    public boolean deletarTipo(int idTipo) {
        for (TipoProduto t : bancoTipos) {
            if (t.getIdTipo() == idTipo) {
                bancoTipos.remove(t);
                return true;
            }
        }
        return false;
    }


    public void comprarProduto(String codigoBarras, int quantidade) {
        for (Produto produto : bancoProdutos) {
            if (produto.getCodigoBarras().equals(codigoBarras)) {
                produto.adicionarProduto(quantidade);
                System.out.println("Compra realizada! Estoque atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }


    public boolean realizarVenda(NotaCompra nota) {
        for (ItemNota itens : nota.getListaItens()) {
            Produto produto = itens.getProduto();
            int quantidade = itens.getQuantidade();
            boolean conseguiu =  produto.removerEstoque(quantidade);


            if (!conseguiu) {
                System.out.println("Produto " + produto.getNome() + " em falta no estoque.");
                return false;
            }
        }
        System.out.println("Venda realizada! Estoque atualizado com sucesso!");
        return true;
    }


    public boolean verificarPermissaoGerente() {
        if (usuarioLogado == null) {
            return false;
        } else {
            return usuarioLogado.isGerente();
        }
    }
}