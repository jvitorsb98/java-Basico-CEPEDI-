package ExceptionsArquivos;

public class ArquivoNaoEncontradoException extends Exception {
	
	
	public ArquivoNaoEncontradoException() {
	}
	
    @Override
    public String getMessage() {
        return "Arquivo não encontrado! ";
    }
	

}
