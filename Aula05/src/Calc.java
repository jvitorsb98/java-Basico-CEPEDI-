import ExceptionsMatematicas.ImpossivelDividirPorZero;

public class Calc {
	
	public static float soma(float a , float b ) {
		return a+b;
	}
	
	public static int soma(int a , int b ) {
		return (int)soma((float)a,(float)b);
	}
	
	public static float subtrai(float a , float b ) {
		return a-b;
	}
	
	
	public static int subtrai(int a , int b ) {
		return (int)subtrai((float)a,(float)b);
	}
	

	public static int produto(int a , int b ) {
		return a*b;
	}
	
	public static float produto(float a , float b ) {
		return (int)produto((float)a,(float)b);
	}
	
	public static int dividir(int a , int b )throws ImpossivelDividirPorZero {
		return (int)dividir((float)a,(float)b);
	}
	
	public static float dividir(float a, float b) throws ImpossivelDividirPorZero{
	    try {
	        if (b == 0) {
	            throw new ImpossivelDividirPorZero((int)a);
	        } else {
	            return a / b;
	        }
	    } catch (ImpossivelDividirPorZero e) {
	        System.out.println("Erro: " + e.getMessage());
	        return 0; 
	    }
	}
	
	public static void executaCalc(){
		int a = 5 , b = 0;
		try {
			System.out.println(dividir(a,b));
		}catch(ImpossivelDividirPorZero e ) {
			System.out.println("Erro : " + e);
		}
	}
	

	public static void main(String[] args) {

		executaCalc();

	}

}
