public class TipoProduto {
    private int idTipo;
    private String nome;
    private FormaDeVenda formaVenda;

    public String getNome() {
    if (nome == null || nome.isEmpty()) { // se nome está vazio, produto é inválido
        return "Nome de produto inválido";
    }
    return nome;
}

    // public getFormaVenda(){}
}
