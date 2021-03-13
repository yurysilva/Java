import java.util.Scanner;

public class Celsifah {
    
    static double conversaoCelsiusFahrenheit(double C){
        return 9 * C / 5 + 32;
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero em Celsius");
        double celsius = leitor.nextInt();
        System.out.println("O número convertido em Fahrenheit é: ");
        System.out.println(conversaoCelsiusFahrenheit(celsius));
    }
}
