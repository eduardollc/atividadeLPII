public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(String numeroConta, String agencia, Double saldo) {
        super(numeroConta, agencia, saldo);
    }
    
    public void rendimento(){
        
        double porcentagem = 0.0105;
        setSaldo(getSaldo() + (getSaldo() * porcentagem));
    }
    
}
