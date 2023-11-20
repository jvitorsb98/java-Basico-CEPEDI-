package exerciciodata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Estudante {
	
	private String Nome;
	private Date dataNascimento;
	private String CPF;
	private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 

	public void mostraDataNascimento() {
		
		System.out.println("Data de Nascimento : " + formato.format(dataNascimento));
	}
	
	public void mostraEstudante() {
		System.out.println("Nome : " + getNome());
		System.out.println("CPF  : " + getCPF());
		mostraDataNascimento();
		System.out.println("Idade : " + calculaIdade());
	}
	
	
	public Estudante(String nome, Date dataNascimento, String cPF) {
		Nome = nome;
		this.dataNascimento = dataNascimento;
		CPF = cPF;
	}
	
	public Estudante() {
		
	}


	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public void CadastrarEstudante() throws ParseException {
		String nome,cpf;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome : ");
		nome = sc.nextLine();	
		
		System.out.print("Digite o cpf : ");
		cpf = sc.nextLine();
		

		
		Date date = solicitaDataEConverte();	
				
		setNome(nome);
		setDataNascimento(date);
		setCPF(cpf);
		
	}
	
	private int calculaIdade() {
		LocalDate ldirthday = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return Period.between(ldirthday, LocalDate.now()).getYears();
		
	}
	
	private Date solicitaDataEConverte() throws ParseException {
		String dataEmString;
		
		System.out.print("Digite a data de nascimento : ");
		Scanner sc = new Scanner(System.in);
		dataEmString = sc .nextLine();	
		return formato.parse(dataEmString);
	}
	
	
	public static void main(String[] args) throws ParseException {
		
		Estudante estudante = new Estudante();
		estudante.CadastrarEstudante();
		
		estudante.mostraEstudante();
		
		
	}
	
	
	

}
