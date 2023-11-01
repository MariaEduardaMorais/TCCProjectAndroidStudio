package Ferramentas;

public class Usuario {
    private String nome, email;
    private Integer senha;

    public Usuario(String nome, String email, Integer senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getSenha() {
        return senha;
    }
}



