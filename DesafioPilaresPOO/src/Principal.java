public class Principal {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca();
        
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        

        
        
    }
}
