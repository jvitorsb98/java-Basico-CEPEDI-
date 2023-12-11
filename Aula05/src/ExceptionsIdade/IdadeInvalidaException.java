package ExceptionsIdade;

public class IdadeInvalidaException extends Exception {

	int idade;
	
	public IdadeInvalidaException(int idade ) {
		this.idade = idade;
	}
	
    @Override
    public String getMessage() {
        return "Idade(" +idade+")  inválida  deve ser entre 150 e 0 ";
    }
	
}
