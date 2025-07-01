public class ContaBancaria {
    String titular;
    String numeroConta;
    Double saldo;

    public ContaBancaria(String titular, String numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    void mostrarSaldo() {
        System.out.println("O saldo do " + titular + " é R$" + saldo);
    }

    void depositar(Double valor) {
        saldo += valor;
    }

    void sacar(Double valor) {
        saldo -= valor;
    }
}
