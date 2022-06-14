package entidades;

public class Usuario {
	private String email;
	private String senha;
	private String nome;
	private int pontos;
	
	public Usuario(String email, String senha, String nome, int pontos) {
		super();
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
}
