package calculosEstatisticos;

public class calculosEstatisticos {
	
	private long fatorial(long n1) {
		return (n1==0) ? 1 : n1==1 ? 1 : n1*fatorial(n1-1);
	}
	
	public void mostraFatorial(long n1) {
		System.out.println(fatorial(n1));
	}
	
	private double calculaArranjo(int n , int p) {
		return fatorial(n)/(fatorial(n-p));
	}
	
	public void arranjo(int n , int p) {
		System.out.println(calculaArranjo(n,p));
	}
	
	public double calculaCombinacao(int n , int p) {
		return calculaArranjo(n,p)/fatorial(p);
	}
	
	public void combinacao(int n , int p) {
		System.out.println(calculaCombinacao(n,p));
	}
	
	
	
	public static void main(String[] args) {
		
		calculosEstatisticos calculos = new calculosEstatisticos();
		
		calculos.mostraFatorial(5);
		calculos.arranjo(3,2);
		calculos.combinacao(3, 2);

	}

}
