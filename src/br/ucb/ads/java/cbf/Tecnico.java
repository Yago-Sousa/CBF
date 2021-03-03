package br.ucb.ads.java.cbf;

import java.util.Iterator;
import java.util.List;

import br.ucb.ads.java.cbf.interfaces.IImprimirJogadores;

public class Tecnico extends UsuarioAbstract implements IImprimirJogadores, Comparable{
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	private void imprimir(List jogadores){
		for(Iterator iterator = jogadores.iterator(); iterator.hasNext();){
			JogadorAbstract jogador = (JogadorAbstract)iterator.next();
			System.out.println("Nome: "+jogador.getNome());
			System.out.println("Assistencias: "+jogador.getQtdAssistencias());
			System.out.println("Gols: "+jogador.getQtdGols());
		}
	}
	
	@Override
	public void imprimirTodosOsJogadores(List jogadores) {
		System.out.println("\n\nTodos os jogadores:");
		imprimir(jogadores);
		
	}
	
	@Override
	public void imprimirJogadoresCampo(List jogadores) {
		System.out.println("\n\nTodos os jogadores DE CAMPO!");
		imprimir(jogadores);
		
	}
	@Override
	public void imprimirJogadoresFutsal(List jogadores) {
		System.out.println("\n\nTodos os jogadores DE FUTSAL!");
		imprimir(jogadores);
		
	}
	@Override
	public int compareTo(Object o) {
		Tecnico t = (Tecnico)o;
		
		if(this.getQtdVitorias() < t.getQtdVitorias())
			return -1;
		else if(this.getQtdVitorias() > t.getQtdVitorias())
			return 1;
		return 0;
	}
}
