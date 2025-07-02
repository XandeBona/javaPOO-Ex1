import java.util.ArrayList;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private Double saldo;

    public ArrayList<String> lista = new ArrayList<>();

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

    public Double getSaldo() {
        return saldo;
    }

    public void mostrarSaldo() {
        System.out.println("O saldo do " + titular + " é R$" + saldo);
    }

    public void depositar(Double valor) {
        if (valor < 0) {
            System.out.println("Insira um valor positivo!");
        } else {
            saldo += valor;
            System.out.println("Operação realizada!");
            lista.add("Foi depositado um valor de: " + valor);
        }
    }

    public void sacar(Double valor) {
        if (valor > saldo) {
            System.out.println("Este valor é maior que o disponível em sua conta!");
        } else {
            saldo -= valor;
            System.out.println("Operação realizada!");
            lista.add("Foi sacado um valor de: " + valor);

        }

    }

    public void listar() {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
