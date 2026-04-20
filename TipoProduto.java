package P3;

public class TipoProduto {
    private int idTipo;
    private String nome;
    // private FormaDeVenda formaVenda;

    public String getNome() {
    if (!nome.isEmpty()) {
        return "Nome de produto inválido";
    }
    return nome;
}

    // public getFormaVenda(){}
}
