package br.com.vainaweb.backend.classeabstrata;

public class Designer extends Colaborador {

	
	private String habilidadeTecnica;
	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designer(String nome, String cpf, String matricula, String admissao, int idade, double salario, String habilidadeTecnica) {
		super(nome, cpf, matricula, admissao, idade, salario);
		this.habilidadeTecnica = habilidadeTecnica;
	}


	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}


	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}

	
	@Override
	public void receberAumento(double porcentagem) {
		super.setSalario(this.getSalario() + (this.getSalario() * (porcentagem / 100)));
		
	}
	
	@Override
	public String visualizar() {
		return super.visualizar()+  "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
