package lanchone;

import lanchone.area.cliente.Cliente;
import lanchone.atendimento.Atendente;
import lanchone.atendimento.cozinha.Almoxarife;
import lanchone.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
	Cozinheiro cozinheiro = new Cozinheiro();
	
	//ações que estabelecimento precisa ter ciência
	cozinheiro.adicionarSucoNoBalcao();;
	cozinheiro.adicionarLancheNoBalcao();
	cozinheiro.adicionarComboNoBalcao();
	
	Atendente atendente = new Atendente();
	atendente.servindoMesa();
	atendente.receberPagamento();
	
	Cliente cliente = new Cliente();
	cliente.escolherLanche();
	cliente.fazerPedido();
	cliente.pagarConta();		
	}
}
