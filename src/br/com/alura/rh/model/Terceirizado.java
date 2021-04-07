package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private DadosPessoais dadosPessoais;
	private String empresa;
	
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais.setNome(nome);
		this.dadosPessoais.setCpf(cpf);
		this.dadosPessoais.setCargo(cargo);
		this.dadosPessoais.setSalario(salario);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
