package br.com.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println(" Enviando Mensagem pelo Mensagem");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println(" Recebendo Mensagem pelo Mensagem");
		
	}
	
}
