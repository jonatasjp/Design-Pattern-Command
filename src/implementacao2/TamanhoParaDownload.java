package implementacao2;

import java.util.List;

import implementacao2.Produto;
import implementacao2.ProdutoDigital;

public class TamanhoParaDownload extends ComandoCarrinho {

	private List<Produto> produtos;
	private double tamanho = 0;

	public TamanhoParaDownload(ComandoCarrinho proximoComando) {
		super(proximoComando);
	}

	public void setListaProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public Object executarComando() {
		for(Produto p : produtos){
			if(p.isDigital()){
				this.tamanho += ((ProdutoDigital)p).getTamanhoDownload();
			}
		}
		
		return this.tamanho;
	}

	@Override
	public Object getResultado() {
		return this.tamanho;
	}
}
