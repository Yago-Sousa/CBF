package br.ucb.ads.java.cbf.admin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.ucb.ads.java.cbf.JogadorAbstract;
import br.ucb.ads.java.cbf.Tecnico;
import br.ucb.ads.java.cbf.UsuarioAbstract;
import br.ucb.ads.java.cbf.interfaces.IAdministrador;

public class Administrador extends UsuarioAbstract implements IAdministrador<JogadorAbstract>{
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	private void imprimir(List<JogadorAbstract> jogadores){
		for(Iterator iterator = jogadores.iterator(); iterator.hasNext();){
			JogadorAbstract jogador = (JogadorAbstract)iterator.next();
			System.out.println("Nome: "+jogador.getNome());
			System.out.println("Assistencias: "+jogador.getQtdAssistencias());
			System.out.println("Gols: "+jogador.getQtdGols());
			System.out.println("Salario do craque: "+jogador.getCalculoSalarial());
		}
	}
	
	@Override
	public void imprimirTodosOsJogadores(List<JogadorAbstract> jogadores) {
		System.out.println("\n\nTodos os jogadores:");
		imprimir(jogadores);
		
	}
	
	@Override
	public void imprimirJogadoresCampo(List<JogadorAbstract> jogadores) {
		System.out.println("\n\nTodos os jogadores DE CAMPO!");
		imprimir(jogadores);
		
	}
	@Override
	public void imprimirJogadoresFutsal(List<JogadorAbstract> jogadores) {
		System.out.println("\n\nTodos os jogadores DE FUTSAL!");
		imprimir(jogadores);
		
	}

	@Override
	public List<JogadorAbstract> listarJogadoresComSalarioAcima(List<JogadorAbstract> todosJogadores,
			double valorSalario) {
		List<JogadorAbstract> listaJogadoresAcima = new ArrayList<>();
		
		for(Iterator iterator = todosJogadores.iterator(); iterator.hasNext();){
			JogadorAbstract jogador = (JogadorAbstract)iterator.next();
			if(jogador.getCalculoSalarial() > valorSalario ){
				listaJogadoresAcima.add(jogador);
			}
		}
		Collections.sort(listaJogadoresAcima);
		Collections.reverse(listaJogadoresAcima);
		return listaJogadoresAcima;
	}

	@Override
	public void imprimirTecnicos(List<Tecnico> tecnicos) {
		System.out.println("\n\nTodos os TECNICOS!");
		Collections.sort(tecnicos);
		Collections.reverse(tecnicos);
		for(Iterator iterator = tecnicos.iterator(); iterator.hasNext();){
			Tecnico tecnico = (Tecnico)iterator.next();
			System.out.println("Nome: "+tecnico.getNome());
			System.out.println("Qtde de Vitorias: "+tecnico.getQtdVitorias());
			System.out.println("Qtde de Empates: "+tecnico.getQtdEmpates());
			System.out.println("Qtde de Derrotas: "+tecnico.getQtdDerrotas());
		}
	}
}
