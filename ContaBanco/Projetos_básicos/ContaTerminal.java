package ContaBanco.Projetos_básicos;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numeroConta;
        String agencia, nomeCliente;
        float saldo = 541.50f;

        System.out.println("Digite o numero da conta:");
        numeroConta=ent.nextInt();
        System.out.println("Digite agencia da conta:");
        agencia=ent.next();
        System.out.println("Digite o nome do cliente:");
        nomeCliente=ent.next();

        System.out.printf("Olá "+ nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agêcia é "+ agencia+ " conta "+ numeroConta+" e seu saldo "+ saldo+ "já está disponível para saque"); 

    }
}