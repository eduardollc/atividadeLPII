public class Conta {
    
    private String numeroConta;
    private String agencia;
    private Double saldo;

    public Conta(String numeroConta, String agencia, Double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0.00;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
 
    @Override
    public String toString() {
        return String.format("%s \n%s: %s \n%s: %s",
                "Sucesso ao acessar conta",
                "Número da conta", numeroConta,
                "Agência", agencia);
    }
    
}
