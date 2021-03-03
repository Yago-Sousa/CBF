package br.ucb.ads.java.cbf;

public class JogadorCampo extends JogadorAbstract{

	private double valorPasse;
	
	@Override
	public double getCalculoSalarial() {
		return this.getValorPasse() * 0.01;
	}

	public double getValorPasse() {
		return valorPasse;
	}

	public void setValorPasse(double valorPasse) {
		this.valorPasse = valorPasse;
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
