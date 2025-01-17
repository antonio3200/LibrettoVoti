package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;
	public Libretto() {
		this.voti= new ArrayList<>();
		System.out.println("Sono Libretto e sono vivo");
	}
	public void add(Voto v) {
		this.voti.add(v);
		
	}
	/*
	public void StampaVotiUguali(int punteggio) {
		//il libretto stampa solo i voti
	}
	public String VotiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sara poi il chiamante a stamparli
	}
	*/
	
	public List<Voto> listaVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		
		List<Voto> risultato= new ArrayList<>();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato= new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	/**
	 * ricerca un voto per il corso di cui è specificato il nome
	 * @param nomeCorso
	 * @return
	 */
	
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato= null;
		for(Voto v : this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato=v;
			    break;
			}
		}
		return risultato;
	}

	public String toString() {
		String s="";
		for(Voto v : this.voti) {
			s= s+v.toString()+"\n";
		}
		return s;
	}
}
