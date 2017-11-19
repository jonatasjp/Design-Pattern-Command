package implementacao2;

public abstract class ComandoCarrinho {

	private ComandoCarrinho proximoComando;

	public ComandoCarrinho(ComandoCarrinho proximoComando) {
		this.proximoComando = proximoComando;
	}

	public void executar() {
		executarComando();

		if (proximoComando != null)
			this.proximoComando.executar();
		
	}

	public abstract Object executarComando();
	
	public abstract Object getResultado();

}
