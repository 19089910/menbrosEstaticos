package V3_utilitarios;//sao metidos estaticos(nao mudam)

public class V3_calculadora {
    public static final double PI = 3.14;//3.14159

    public static double circuferencia(double raio) {//
        return 2 * PI * raio;
    }

    public static double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }
}
