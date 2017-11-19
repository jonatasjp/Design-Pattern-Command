package implementacao;

public class Produto {

	private String nome;
	private double preco;
	private boolean digital;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDigital() {
		return this.digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

}
