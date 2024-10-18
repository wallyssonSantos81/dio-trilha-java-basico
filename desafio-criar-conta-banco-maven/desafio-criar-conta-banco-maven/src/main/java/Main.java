
public class Main {

    public static void main(String[] args) {

        Cliente wallisson = new Cliente();
        wallisson.setNome("Wallisson");

        Conta cc = new ContaCorrente(wallisson);
        Conta poupanca = new ContaPoupanca(wallisson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}