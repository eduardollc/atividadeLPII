
import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(String numeroConta, String agencia, Double saldo) {
        super(numeroConta, agencia, saldo);
    }
    
    public void rendimento(){
        
        double porcentagem = 0.0105;
        setSaldo(getSaldo() + (getSaldo() * porcentagem));
    }
    
    public void depositar(Double valor) {
        
        if (valor <= 0) {
          JOptionPane.showMessageDialog(null, "Erro, não é possivel depositar um valor abaixo ou igual a 0 !!!");
        } else {
            setSaldo(getSaldo() + valor);
        }
        
    }
    
    public void sacar(Double valor){
        
        if(valor > getSaldo() || valor == 0){
            JOptionPane.showMessageDialog(null, "Erro, não é possivel sacar um valor acima do seu saldo ou 0 !!!");
        } else {
            setSaldo(getSaldo() - valor);
        }
        
    }
    
    public Double obterSaldo(){
        
       return getSaldo();
        
    }
 
}
