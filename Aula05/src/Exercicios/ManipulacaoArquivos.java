package Exercicios;

import java.io.File;

import ExceptionsArquivos.ArquivoNaoEncontradoException;

public class ManipulacaoArquivos {
	
	public static void RecebeArquivo(){
		String filePath = "D::/enderecoestranho.txt";
		try {
			File file = new File(filePath);
			verificaEndereco(file);
		}catch(ArquivoNaoEncontradoException e) {
			System.out.println("Erro " + e );
		}catch(Exception e){
			System.out.println("Erro " + e );
		}
	}
	
	public static void verificaEndereco(File file) throws ArquivoNaoEncontradoException {
		if(!file.exists()) {
			throw new ArquivoNaoEncontradoException();
		}
	}
	
	public static void main(String[] args) {
		ManipulacaoArquivos.RecebeArquivo();
	}

}
