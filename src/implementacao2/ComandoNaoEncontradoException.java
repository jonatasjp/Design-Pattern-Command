package implementacao2;

public class ComandoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ComandoNaoEncontradoException() {

	}
	
	public ComandoNaoEncontradoException(String msg) {
		super(msg);
	}
	
}
