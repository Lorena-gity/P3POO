package entidades;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String senha;
    private PerfilUsuario perfil;

    // Construtores
    public Usuario() {}
    
    public Usuario(int idUsuario, String nome, String senha, PerfilUsuario perfil) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
        this.perfil = perfil;
	}

	public Integer getIdUsuario() {
        return idUsuario;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public String getSenha() {
        return senha;
    }

    public String setNome(String novoNome) { // para alterar o nome atual do usuário é necessário que o novo nome seja preenchido e que não seja igual ao anterior
        if (novoNome == null || novoNome.isEmpty()) {
            return "Nome não pode ser vazio.";
        } else if (this.nome != null && novoNome.equals(this.nome)) { // .equals é usado para comparar o texto ( "==" iria comparar endereço de memória)
            return "Novo nome deve ser diferente do nome atual.";
        } else {
            this.nome = novoNome;
            return "Nome atualizado com sucesso!";
        }
    }

    public String setSenha(String novaSenha) {
        if (novaSenha == null || novaSenha.isEmpty()) {
            return "Senha não pode ser vazia.";
        } else if (this.senha != null && novaSenha.equals(this.senha)) {
            return "Nova senha deve ser diferente da senha atual.";
        } else {
            this.senha = novaSenha;
            return "Senha atualizada com sucesso!";
        }
    }

    public boolean autenticar(String senhaDigitada) {
        if (senhaDigitada == null || this.senha == null) {
            return false;
        } else {
            return this.senha.equals(senhaDigitada);
        }
    }

    public boolean isGerente() {
        if (perfil == PerfilUsuario.GERENTE) {
            return true;
        } else {
            return false;
        }
    }
}