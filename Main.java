import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        double a=0, b=1, n=0.25;
        String funcao = "x^2";

        Riemann soma = new Riemann(a, b, n, funcao);

        soma.calculateIntegral();

        System.out.println(soma.getSomaMaior() + " " + soma.getSomaMenor());

        // System.out.print("Digite a função que deseja para calcular a integral: ");
        // funcao = sc.nextLine();
        // System.out.print("Digite o início do Intervalo: ");
        // a = sc.nextDouble();
        // System.out.print("Digite o fim do Intervalo: ");
        // b = sc.nextDouble();
        // System.out.print("Digite a largura de cada faixa: ");
        // n = sc.nextDouble();



        System.out.println(Operacoes.eval(funcao));


        //sc.close();
    }
    
}
