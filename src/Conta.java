public class Conta {

    private Integer numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public Integer getNumeroConta() { return numeroConta; }
    public void setNumeroConta(Integer numeroConta) { this.numeroConta = numeroConta; }
    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public Float getSaldo() { return saldo; }
    public void setSaldo(Float saldo) { this.saldo = saldo; }
    
    public void imprimir(){
        String mensagem = """
            Olá %s, obrigado por criar uma conta em nosso banco!
            Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.
            """.formatted(getNomeCliente(), getAgencia(), getNumeroConta(), getSaldo());
            
        System.out.println(mensagem);
    }
}
