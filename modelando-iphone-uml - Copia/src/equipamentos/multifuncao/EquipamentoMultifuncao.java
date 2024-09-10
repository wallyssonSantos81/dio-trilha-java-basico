package equipamentos.multifuncao;

import equipamentos.aparelho.telefonico.AparelhoTelefonico;
import equipamentos.navegador.NavegadorInternet;
import equipamentos.reprodutor.musical.ReprodutorMusical;

public class EquipamentoMultifuncao implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	public void fazerChamada(String numero) {
		 System.out.println("Fazendo chamada para: " + numero);	
	}

	public void receberChamada(String numero) {
		System.out.println("Recebendo chamada de: " + numero);
	}

	public void encerrarChamada() {
		 System.out.println("Chamada encerrada.");
	}

	public void abrirPagina(String url) {
		System.out.println("Abrindo página: " + url);
	}

	public void fecharPagina() {
		 System.out.println("Página fechada.");
	}

	public void navegarPara(String url) {
		System.out.println("Navegando para: " + url);
	}

	public void tocarMusica(String musica) {
		System.out.println("Tocando música: " + musica);
	}

	public void pausarMusica() {
		System.out.println("Música pausada.");
	}

	public void pararMusica() {
		System.out.println("Música parada.");
	}

}










