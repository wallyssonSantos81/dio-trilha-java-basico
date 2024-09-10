package smart.phone;

import equipamentos.aparelho.telefonico.AparelhoTelefonico;
import equipamentos.aparelho.telefonico.Telefone;
import equipamentos.navegador.Internet;
import equipamentos.navegador.NavegadorInternet;
import equipamentos.reprodutor.musical.Musica;
import equipamentos.reprodutor.musical.ReprodutorMusical;

public class SmartPhone {

	public static void main(String[] args) {
		AparelhoTelefonico telefone = new Telefone();
		NavegadorInternet internet = new Internet();
		ReprodutorMusical musica = new Musica();
		
		musica.tocarMusica("Tocando Musica.");
		musica.pausarMusica();
		musica.pararMusica();
		internet.abrirPagina("www.google.com.br");
		internet.navegarPara("www.dio.com.br");
		internet.fecharPagina();
		telefone.fazerChamada("Realizando uma chamando");
		telefone.receberChamada("finalizado a chamada ");
		telefone.encerrarChamada();
		
	}

}
