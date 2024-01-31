package br.com.vainaweb.backend.classeabstrata;

public class DevBackEnd extends Colaborador {

	private String habilidadeTecnica;
	private String senioridade;

	public DevBackEnd() {
		super();
	}

	public DevBackEnd(String nome, String cpf, String matricula, String admissao, int idade, double salario, String habilidadeTecnica, String senioridade) {
		super(nome, cpf, matricula, admissao, idade, salario);
		this.habilidadeTecnica = habilidadeTecnica;
		this.senioridade = senioridade;
	}

	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}

	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}
	
	public String getSenioridade() {
		return senioridade;
	}


	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

	@Override
	public void receberAumento(double porcentagem) {
		super.setSalario(this.getSalario() + (this.getSalario() * (porcentagem / 100)));
		
	}

	@Override
	public String visualizar() {
		return super.visualizar() + "\nCaracteristicas: " + this.habilidadeTecnica + "\nSenioridade: " + this.senioridade;
	}

}
