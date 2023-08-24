import java.util.UUID;

public class ContaBancaria {
    private UUID numeroConta;
    private String titular;
    private Double saldo;

    public ContaBancaria(String titular) {
        this.numeroConta = UUID.randomUUID();
        this.titular = titular;
        this.saldo = 0.0;
    }

    public UUID getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(UUID numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Número da Conta: " + numeroConta + ", Titular: " + titular + ", Saldo: " + saldo;
    }
}
