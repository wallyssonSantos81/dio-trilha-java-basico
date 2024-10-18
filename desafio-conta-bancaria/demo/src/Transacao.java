
public class Transacao {
    public static void main(String[] args) {
		Cliente wallisson = new Cliente();
		wallisson.setNome("Wallisson Santos");
		
		Conta cc = new ContaCorrente(wallisson);
		Conta poupanca = new ContaPoupanca(wallisson);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}