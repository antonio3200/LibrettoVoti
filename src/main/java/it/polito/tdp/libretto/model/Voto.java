package it.polito.tdp.libretto.model;

import java.time.LocalDate;

//POJO -Plain Old Java Object
//Java Bean
//semplice contenitore dati-- non ha logica

public class Voto {
 private String nome;
 private int voto; //30L come lo rapprsento?
 private LocalDate data;
 
public Voto(String nome, int voto, LocalDate data) {
	super();
	this.nome = nome;
	this.voto = voto;
	this.data = data;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getVoto() {
	return voto;
}

public void setVoto(int voto) {
	this.voto = voto;
}

public LocalDate getData() {
	return data;
}

public void setData(LocalDate data) {
	this.data = data;
}

@Override
public String toString() {
	return "Esame " + nome+" " + "superato con " + voto+" " + "in data " + data;
}
 
 
}
