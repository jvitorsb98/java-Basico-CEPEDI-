package ExceptionsCredenciais;

public class AutenticacaoFalhouException extends Exception {
	
	public AutenticacaoFalhouException() {
		
	}
	
    @Override
    public String getMessage() {
        return "Autenticação falhou";
    }

}
