package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		/**
		ValidacaoPercentualReajuste vpr = new ValidacaoPercentualReajuste();
		ValidacaoPeriodicidadeEntreReajustes vpe = new ValidacaoPeriodicidadeEntreReajustes();
		
		vpr.validar(funcionario, aumento);
		vpe.validar(funcionario, aumento);
		**/
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
		
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
	
}
