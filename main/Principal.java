package br.ucb.ads.java.cbf.main;

import java.util.ArrayList;
import java.util.List;

import br.ucb.ads.java.cbf.JogadorAbstract;
import br.ucb.ads.java.cbf.JogadorCampo;
import br.ucb.ads.java.cbf.JogadorFutsal;
import br.ucb.ads.java.cbf.Tecnico;
import br.ucb.ads.java.cbf.admin.Administrador;
import br.ucb.ads.java.cbf.exception.SalarioAtletaFutsalInvalidoException;

public class Principal {
	public static void main(String[] args) {
		JogadorFutsal jFutsal1 = new JogadorFutsal();
		jFutsal1.setNome("Falcao");
		jFutsal1.setQtdAssistencias(5);
		jFutsal1.setQtdGols(10);
		try {
			jFutsal1.setSalario(29999);
		} catch (SalarioAtletaFutsalInvalidoException e) {
			e.printStackTrace();
		}
		
		JogadorFutsal jFutsal2 = new JogadorFutsal();
		jFutsal2.setNome("Junior do Futebol Areia Mais conhecido como Giba!");
		jFutsal2.setQtdAssistencias(7);
		jFutsal2.setQtdGols(8);
		try {
			jFutsal2.setSalario(20000);
		} catch (SalarioAtletaFutsalInvalidoException e) {
			e.printStackTrace();
		}
		
		JogadorCampo jCampo1 = new JogadorCampo();
		jCampo1.setNome("Taffarel!!!!");
		jCampo1.setQtdAssistencias(15);
		jCampo1.setQtdGols(1500);
		jCampo1.setValorPasse(500000000);
		
		JogadorCampo jCampo2 = new JogadorCampo();
		jCampo2.setNome("Xuainstaiguer Djokovic da Costa e Silva!!!");
		jCampo2.setQtdAssistencias(15);
		jCampo2.setQtdGols(1500);
		jCampo2.setValorPasse(499999999);
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Titebilidade");
		t1.setQtdVitorias(5);
		t1.setQtdEmpates(500);
		t1.setQtdDerrotas(3);
		
		Tecnico t2 = new Tecnico();
		t2.setNome("Ibraimotite");
		t2.setQtdVitorias(500);
		t2.setQtdEmpates(52);
		t2.setQtdDerrotas(3);
		
		Tecnico t3 = new Tecnico();
		t3.setNome("Chevychenko Guardiola Pep");
		t3.setQtdVitorias(2255);
		t3.setQtdEmpates(52);
		t3.setQtdDerrotas(3);
		
		
		List<JogadorAbstract> jogadoresCampo = new ArrayList();
		jogadoresCampo.add(jCampo1);
		jogadoresCampo.add(jCampo2);
		
		List<JogadorAbstract> jogadoresFutsal = new ArrayList();
		jogadoresFutsal.add(jFutsal1);
		jogadoresFutsal.add(jFutsal2);
		
		List<JogadorAbstract> todosOsJogadores = new ArrayList();
		todosOsJogadores.addAll(jogadoresCampo);
		todosOsJogadores.addAll(jogadoresFutsal);
		
		List<Tecnico> tecnicos = new ArrayList();
		tecnicos.add(t1);
		tecnicos.add(t2);
		tecnicos.add(t3);
		
		Administrador administrador = new Administrador();
		administrador.setNome("Galvao Bueno");
		administrador.setMatricula("Globo e vc tudo a ver!");
		
		t1.imprimirJogadoresCampo(jogadoresCampo);
		t1.imprimirJogadoresFutsal(jogadoresFutsal);
		t1.imprimirTodosOsJogadores(todosOsJogadores);
		
		System.out.println("--------------------------------------");
		administrador.imprimirJogadoresCampo(jogadoresCampo);
		administrador.imprimirJogadoresFutsal(jogadoresFutsal);
		administrador.imprimirTodosOsJogadores(todosOsJogadores);
		administrador.imprimirTecnicos(tecnicos);
		
		administrador.imprimirTodosOsJogadores(administrador.listarJogadoresComSalarioAcima(todosOsJogadores, 50000));  ;
		
		
		
		
		
		
		
		
		
		
	}
}
