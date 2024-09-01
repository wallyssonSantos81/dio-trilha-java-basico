package br.com.batepapo;

import br.com.apps.FaceBookMessenger;
import br.com.apps.MSNMessenger;
import br.com.apps.ServicoMensagemInstantanea;
import br.com.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		/* 
		 Não se sabe qual App
		 mas qualquer um deverá enviar e receber a mensagem
		 */
		String appEscolhido = "telegram";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("facebook"))
			smi = new FaceBookMessenger();
		else if(appEscolhido.equals("telegram"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();	
	}
}
