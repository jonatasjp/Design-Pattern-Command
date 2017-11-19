package implementacao;

public class ProdutoDigital extends Produto{
	
	private double tamanhoDownload;
	
	public ProdutoDigital() {
		setDigital(true);
	}

	public double getTamanhoDownload() {
		return tamanhoDownload;
	}

	public void setTamanhoDownload(double tamanhoDownload) {
		this.tamanhoDownload = tamanhoDownload;
	}
	
	
}
