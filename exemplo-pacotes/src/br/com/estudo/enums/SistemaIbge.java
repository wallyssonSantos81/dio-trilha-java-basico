package br.com.estudo.enums;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla()+" - " + e.getNome());			
		}
		EstadoBrasileiro eb = EstadoBrasileiro.PERNAMBUCO;
		System.out.println();
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIbge());
	}
}
