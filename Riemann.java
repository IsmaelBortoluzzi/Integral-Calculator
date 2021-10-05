public class Riemann {

    private double a;
    private double b;
    private double n;
    private String funcao;

    public Riemann(double a, double b, double n, String funcao) {

        this.a = a;
        this.b = b;
        this.n = (a+b)/n;
        this.funcao = funcao;
    }

    public double[] calculateIntegral() {

        double[] integrais = new double[2];
        integrais[0] = integrais[1] = 0;

        for(double i = this.a+n; i<=b; i+=n) {

            integrais[0] += n * Operacoes.eval(funcao.replaceAll("x", Double.toString(i)));
        }

        for(double i = this.a; i<b; i+=n) {

            integrais[1] += n * Operacoes.eval(funcao.replaceAll("x", Double.toString(i)));
        }

        integrais[0] = Math.abs(integrais[0]);
        integrais[1] = Math.abs(integrais[1]);

        return integrais;
    }

    public String getIntegralAsString() {

        double[] vect = calculateIntegral();
        return Double.toString(vect[0]) + " < A < " + Double.toString(vect[1]);
    }

}
