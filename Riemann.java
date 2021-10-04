public class Riemann {

    private double a;
    private double b;
    private double n;
    private double somaMaior = 0;
    private double somaMenor = 0;
    private String funcao;

    public Riemann(double a, double b, double n,String funcao) {

        this.a = a;
        this.b = b;
        this.n = n;
        this.funcao = funcao;

    }

    private void somaPelaDireita() {

        for(double i = this.a+n; i<=b; i+=n) {

            this.somaMaior += n * Operacoes.eval(funcao.replaceAll("x", Double.toString(i)));
        }

    }
    private void somaPelaEsquerda() {

        for(double i = this.a; i<b; i+=n) {

            this.somaMenor += n * Operacoes.eval(funcao.replaceAll("x", Double.toString(i)));
        }

    }

    public void calculateIntegral() {
        somaPelaDireita();
        somaPelaEsquerda();
    }
    public double getSomaMaior() {
        return this.somaMaior;
    }
    public double getSomaMenor() {
        return this.somaMenor;
    }
    
}

