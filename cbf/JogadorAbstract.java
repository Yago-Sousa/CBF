package br.ucb.ads.java.cbf;

public abstract class JogadorAbstract extends UsuarioAbstract implements Comparable{
	private int qtdGols;
	private int qtdAssistencias;
	
	public abstract double getCalculoSalarial();
	
	
	public int getQtdGols() {
		return qtdGols;
	}
	public void setQtdGols(int qtdGols) {
		this.qtdGols = qtdGols;
	}
	public int getQtdAssistencias() {
		return qtdAssistencias;
	}
	public void setQtdAssistencias(int qtdAssistencias) {
		this.qtdAssistencias = qtdAssistencias;
	}
}
