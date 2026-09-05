import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("""
              
            =====CONTA=NO=TERMINAL=====
                Faça uma escolha: 
                1 - Criar Conta
                0 - Sair
            ===========================
            """);
            
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1 -> {
                    System.out.println("Por favor, digite o número da Agência :");
                    
                    conta.setAgencia(scanner.next());
                    scanner.nextLine(); 
                    System.out.println("Agora digite seu nome completo: ");
                    conta.setNomeCliente(scanner.nextLine()); 
                    System.out.println("Agora digite o número da sua conta: ");
                    conta.setNumeroConta(scanner.nextInt());
                    scanner.nextLine(); 
                    System.out.println("Agora digite seu saldo inicial: ");
                    float saldo = scanner.nextFloat();
                    conta.setSaldo(saldo);
                    scanner.nextLine(); 
                    System.out.println("\n===========================");
                    
                    
                    
                }
                default -> System.out.println("Você Saiu do Sistema");
            }
            
            conta.imprimir();
            scanner.close();
        } 
    }
}
