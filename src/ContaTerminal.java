import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contasBancarias = new ArrayList<>();

        System.out.print("Digite o seu nome para criarmos a sua conta: ");
        String titular1 = scanner.next();

        ContaBancaria contaBancaria1 = new ContaBancaria(titular1);
        contaBancaria1.setSaldo(Math.random());

        contasBancarias.add(contaBancaria1);

        System.out.print("Digite mais um nome para criarmos a sua conta: ");
        String titular2 = scanner.next();

        ContaBancaria contaBancaria2 = new ContaBancaria(titular2);
        contaBancaria2.setSaldo(Math.random());

        contasBancarias.add(contaBancaria2);



        for (ContaBancaria conta : contasBancarias){
            System.out.println(conta);
        }

        scanner.close();
    }
}
