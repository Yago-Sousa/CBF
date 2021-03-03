package br.ucb.ads.java.cbf.interfaces;

import java.util.List;

public interface IImprimirJogadores <T>{
	public void imprimirTodosOsJogadores(List<T> jogadores);
	public void imprimirJogadoresCampo(List<T> jogadores);
	public void imprimirJogadoresFutsal(List<T> jogadores);
}
