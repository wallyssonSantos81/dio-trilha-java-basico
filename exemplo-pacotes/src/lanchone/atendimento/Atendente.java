package lanchone.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCA O GAS");
	}
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALÃO");
	}
}
