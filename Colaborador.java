package br.com.vainaweb.backend.classeabstrata;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private String matricula;
	private String admissao;
	private int idade;
	private boolean isAtivo = true;
	private double salario;

	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, String matricula, String admissao, int idade, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.admissao = admissao;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getAdmissao() {
		return admissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getIsAtivo() {

		return isAtivo;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String visualizar() {
		return "[ " + this.nome + ", " + this.idade + " ]" + "\nCPF: " + this.cpf + "\nMatricula: " + this.matricula
				+ "\nSalário: " + this.salario + "\nEstá ativo ?: " + this.isAtivo;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deseja desvincular " + this.nome + " da empresa S/N?");
		Character resposta = sc.next().charAt(0);
		Character.toLowerCase(resposta);
		if (resposta.equals('s')) {
			System.out.println(this.nome + " está demitido(a)");
			this.isAtivo = false;
		}
		sc.close();
	}

	public abstract void receberAumento(double porcentagem);

}
