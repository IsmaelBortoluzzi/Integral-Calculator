import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, n;
        String funcao;  
       
        System.out.print("Digite a função que deseja para calcular a integral: ");
        funcao = sc.nextLine();
        System.out.print("Digite o início do Intervalo: ");
        a = sc.nextDouble();
        System.out.print("Digite o fim do Intervalo: ");
        b = sc.nextDouble();
        System.out.print("Digite quantidade de faixas: ");
        n = sc.nextDouble();

        Riemann soma = new Riemann(a, b, n, funcao);
        System.out.println(soma.getIntegralAsString());

        sc.close();
    }
    
}
