import java.util.Scanner;

public class InterfaceUsuario {
    public static void main(String[] args) {
        //Declarando scanner (habilitando teclado)
        Scanner entrada = new Scanner(System.in);

        //Pedindo uma entrada para meu usuário
        System.out.print("Digite seu nome: ");
        String nome = entrada.next();

        //entrada.nextLine()
        entrada.nextLine();//adaptação técnica
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite seu patrimonio R$: ");
        double patrimonio = entrada.nextDouble();

        //Exibindo a informação digitada pelo usuário
        System.out.println("O nome  digitado foi " + nome);
        System.out.println("O nome completo digitado foi " + nomeCompleto);

        //Fechar o objeto scanner (desabilitar  teclado)
        entrada.close();
    }
}
