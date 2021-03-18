import java.util.Scanner;

public class HorasExtras {
    public static void main(String[] args) {
        //coletar informações

        //perguntar nome do usuário
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual o nome do funcionário: ");
        String nome = entrada.nextLine();

        //Pergutar hora e minuto de entrada
        System.out.print("Qual a hora de entrada: ");
        int horaEntrada = entrada.nextInt();
        System.out.print("Qual o minuto de entrada: ");
        int minutoEntrada = entrada.nextInt();

        //Pergutar hora e minuto de saida
        System.out.print("Qual a hora de saida: ");
        int horaSaida = entrada.nextInt();
        System.out.print("Qual o minuto de saida: ");
        int minutoSaida = entrada.nextInt();

        //valor da hora
        System.out.print("Qual o valor da hora do funcionário: ");
        double valorHora = entrada.nextDouble();

        //saber quanto tempo ficou no trabalho
        
        //calcula as horas totais
        int horasTotais = horaSaida - horaEntrada;
        //minutoEntrada -= 60;
        int minutosParaHora = (minutoEntrada == minutoSaida && minutoEntrada > 0 && minutoSaida > 0) ? 1 : 0;
        int horaComMinutos = horasTotais + minutosParaHora;//valor total das horas com os minutos  
        int demaisHoras = (horaComMinutos > 10) ? horaComMinutos % 10: 0;
        int horaAcrescentada = (horaComMinutos > 8) ? (horaComMinutos % 8) - demaisHoras: 0;

        //calcula o valor das horas
        double valorHoraPadrao = valorHora * horaComMinutos;
        double valorAcrescentada = ((valorHora * 0.55) + valorHora) * horaAcrescentada;
        double valorDemaisHoras = ((valorHora * 0.60) + valorHora) * demaisHoras;
        double totalDiaria = valorHoraPadrao + valorAcrescentada + valorDemaisHoras;



        //Imprimir o resultado na tela
        System.out.println("Olá "+nome+" você teve o total de "+horaComMinutos+" horas sendo "+horaAcrescentada+"  horas extras e "+demaisHoras+" horas demais");
        System.out.println("No caso você teve um total do dia de R$"+totalDiaria+" sendo R$"+valorAcrescentada+" horas extras e "+valorDemaisHoras+" demais horas.");
        entrada.close();
    }
}
