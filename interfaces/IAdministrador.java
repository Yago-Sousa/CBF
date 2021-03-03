package br.ucb.ads.java.cbf.interfaces;

import java.util.List;

import br.ucb.ads.java.cbf.Tecnico;

public interface IAdministrador <T> extends IImprimirJogadores <T>{
	public List listarJogadoresComSalarioAcima(List<T> todosJogadores, double valorSalario);
	public void imprimirTecnicos(List<Tecnico> tecnicos); 
}
