package br.com.apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
	
	protected void validarConectadoInternet() {
		System.out.println(" Validando se esta Conectado a Internet.");
	}
}
