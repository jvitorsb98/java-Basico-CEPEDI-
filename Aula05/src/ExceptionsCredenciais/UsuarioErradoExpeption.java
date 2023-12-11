package ExceptionsCredenciais;

public class UsuarioErradoExpeption  extends Exception{
	
	public UsuarioErradoExpeption() {
		
	}
	
    @Override
    public String getMessage() {
        return "Nome de usuário não encontrado";
    }

}
