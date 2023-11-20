package geradorPrimos;

public class geradorPrimos {
	
	public static void mostraDivisores(int n) {
		for(int i = 1 ; i < n/2 + 1 ; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
	
	private int quantidadeDivisores(int n ) {
		int qtd = 0;
		for(int i = 1 ; i < n/2 + 1 ; i++) {
			if(n%i==0) {
				qtd++;
			}
		}
		qtd++;
		
		return qtd;
	}
	
	public boolean isPrimo(int n) {
		return (quantidadeDivisores(n ) == 2);
	}
	
	public void verificaSeEPrimo(int n) {
		if(isPrimo(n)) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
		}
	}
	
	public void mostaPrimos(int n ) {
		for(int i = 2 ; i < n ; i++) {
			if(this.isPrimo(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		geradorPrimos gerador = new geradorPrimos();
		
		mostraDivisores(36);
				
		gerador.verificaSeEPrimo(97);
		
		gerador.mostaPrimos(100);
		
	}
}
