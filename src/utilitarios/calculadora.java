package utilitarios;

public class calculadora {
    public double PI = 3.14;//3.14159
    public double circuferencia(double raio) {//
        return 2 * PI * raio;
    }

    public double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }
}
