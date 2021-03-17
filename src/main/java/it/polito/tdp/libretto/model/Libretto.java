package it.polito.tdp.libretto.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	public void add(Voto v) {
		this.voti.add(v);
	}

	
	public List<Voto> listaVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		List<Voto> risultato = new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato= new Libretto();
		for(Voto v:this.voti) {
      if(v.getVoto()==punteggio) {
    	  risultato.add(v);
      }
      }
		return risultato;
	}
	
	public String toString() {
		String s="";
		for(Voto v : this.voti) {
			s=s+v.toString()+"\n";
		}
		return s;
	}
}


 