public class Conta {
    String nome;
    String numeroDaConta;
    double saldo;

    public Conta(String nome, String numeroDaConta, double saldo) {
        this.nome = nome;
        this.numeroDaConta = uuid();
        this.saldo = saldo;
    }

    private String uuid() {

    }
}
