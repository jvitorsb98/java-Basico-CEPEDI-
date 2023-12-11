package ExceptionsCredenciais;

public class CredenciaisInvalidasException extends Exception{
	
	public CredenciaisInvalidasException() {
	}

    @Override
    public String getMessage() {
        return "Nome de usuário vazio ou a senha tem menos de 6 caracteres";
    }
}
