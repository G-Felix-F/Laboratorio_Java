package arquivo;

public class Arquivo {

	private String nome, conteudo;
	
	public Arquivo(String nome, String conteudo) {
		setNome(nome);
		setConteudo(conteudo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}