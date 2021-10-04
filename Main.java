import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, n;
        String funcao;

        System.out.print("Digite a função que deseja para calcular a integral: ");
        funcao = sc.nextLine();
        System.out.print("Digite o início do Intervalo: ");
        a = sc.nextDouble();
        System.out.print("Digite o fim do Intervalo: ");
        b = sc.nextDouble();
        System.out.print("Digite a largura de cada faixa: ");
        n = sc.nextDouble();

        
        Operacoes.eval("2+3 * (3-2^2)");




        sc.close();
    }
    
}
