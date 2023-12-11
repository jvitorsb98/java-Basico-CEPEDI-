package ExceptionsDinheiro;

public class ValorInvalidoException extends Exception{

	int valor;
	
	public ValorInvalidoException(int valor ) {
		this.valor = valor;
	}
	
    @Override
    public String getMessage() {
        return "Valor(" +valor+")  deve ser multiplo de 10 ";
    }
	
}
