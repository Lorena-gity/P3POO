package entidades;
import entidades.PerfilUsuario;

public class Usuario {
    private Integer idUsuario;
    private String nome;
    private String login;
    private String senha;

    public Integer getIdUsuario() {
        return idUsuario;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String setLogin(String novoLogin) { // para alterar o logib atual do usuário é necessário que o novo nome de login seja preenchido e que não seja igual ao anterior
        if (novoLogin == null || novoLogin.isEmpty()) {
            return "O Login não pode ser vazio.";
        } else if (this.login != null && novoLogin.equals(this.login)) { // .equals é usado para comparar o texto ( "==" iria comparar endereço de memória)
            return "O novo Login deve ser diferente do login atual.";
        } else {
            this.login = novoLogin;
            return "O login foi atualizado com sucesso!";
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

}