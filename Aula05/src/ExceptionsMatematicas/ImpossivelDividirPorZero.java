package ExceptionsMatematicas;

public class ImpossivelDividirPorZero extends Exception {
    
    int dividendo;
    
    public ImpossivelDividirPorZero(int dividendo) {
        this.dividendo = dividendo;
    }
    
    @Override
    public String getMessage() {
        return "Impossível dividir " + dividendo + " por zero!";
    }
}
