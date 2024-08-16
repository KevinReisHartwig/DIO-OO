import model.*;

import java.util.Scanner;

public class AppBanco {

    private static Banco banco = new Banco();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("1. Criar conta");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Transferir");
            System.out.println("5. Imprimir Extrato");
            System.out.println("6. Imprimir Histórico");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarConta(scanner);
                    break;
                case 2:
                    sacar(scanner);
                    break;
                case 3:
                    depositar(scanner);
                    break;
                case 4:
                    transferir(scanner);
                    break;
                case 5:
                    imprimirExtrato(scanner);
                    break;
                case 6:
                    imprimirHistorico(scanner);
                    break;
                case 7:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

    private static void criarConta(Scanner scanner) {
        System.out.print("Nome do cliente: ");
        String nome = scanner.next();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);

        System.out.println("Tipo de conta (1 - Corrente, 2 - Poupança): ");
        int tipo = scanner.nextInt();

        Conta conta;
        if (tipo == 1) {
            conta = new ContaCorrente(cliente);
        } else {
            conta = new ContaPoupanca(cliente);
        }
        banco.adicionarConta(conta);
        System.out.println("Conta criada com sucesso!");
    }

    private static void sacar(Scanner scanner) {
        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();
        Conta conta = banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void depositar(Scanner scanner) {
        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();
        Conta conta = banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void transferir(Scanner scanner) {
        System.out.print("Número da conta de origem: ");
        int numeroOrigem = scanner.nextInt();
        Conta contaOrigem = banco.buscarContaPorNumero(numeroOrigem);

        if (contaOrigem != null) {
            System.out.print("Número da conta de destino: ");
            int numeroDestino = scanner.nextInt();
            Conta contaDestino = banco.buscarContaPorNumero(numeroDestino);

            if (contaDestino != null) {
                System.out.print("Valor da transferência: ");
                double valor = scanner.nextDouble();
                contaOrigem.transferir(valor, contaDestino);
            } else {
                System.out.println("Conta de destino não encontrada.");
            }
        } else {
            System.out.println("Conta de origem não encontrada.");
        }
    }

    private static void imprimirExtrato(Scanner scanner) {
        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();
        Conta conta = banco.buscarContaPorNumero(numero);

        if (conta != null) {
            conta.imprimirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void imprimirHistorico(Scanner scanner) {
        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();
        Conta conta = banco.buscarContaPorNumero(numero);

        if (conta != null) {
            conta.imprimirHistorico();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
