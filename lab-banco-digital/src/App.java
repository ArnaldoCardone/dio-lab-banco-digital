public class App {

    public static void main(String[] args) throws Exception {
      
	
		Cliente cliente = new Cliente();
		cliente.setNome("Cliente 1");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

        poupanca.depositar(200);
        poupanca.sacar(100);
        poupanca.transferir(50, cc);
        

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
    
}
