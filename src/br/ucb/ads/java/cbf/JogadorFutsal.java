package br.ucb.ads.java.cbf;

import br.ucb.ads.java.cbf.exception.SalarioAtletaFutsalInvalidoException;

public class JogadorFutsal extends JogadorAbstract{

	private final int SALARIO_TETO = 30000;
	private double salario;
	
	@Override
	public double getCalculoSalarial() {
		return this.salario;
	}

	public void setSalario(double salario) throws SalarioAtletaFutsalInvalidoException {
		if(salario > this.SALARIO_TETO)
			throw new SalarioAtletaFutsalInvalidoException("Salário não pode ser acima do teto de "+this.SALARIO_TETO+" reais!");
		this.salario = salario;
	}

	@Override
	public int compareTo(Object o) {
		JogadorAbstract t = (JogadorAbstract)o;
		
		if(this.getCalculoSalarial() < t.getCalculoSalarial())
			return -1;
		else if(this.getCalculoSalarial() > t.getCalculoSalarial())
			return 1;
		return 0;
	}

}
