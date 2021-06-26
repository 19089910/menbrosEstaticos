/**
 * (versao 1)
 * métodos na própria classe(INICIALIZACAO) do programa
 * OBS: dentro de um método estático você não pode chamar membros de
 * instância da mesma classe.
 */

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static final double PI = 3.14;//3.14159

    public static void main(String[] args) {//observe que o mein e estatico; nao pode chamar um metodo nao estatico em um estaticos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);//objeto(sc) instanciado(new Scanner)
        program program = new program();//instancie a propia classe dentro
        //assim vc tem todos os metodos da classe sendo ela estatico ou nao.
        //alegoria: um quarto so tem acesso o que tem nele, indo para sala, vc tem acesso a todos os quartos
        //so tem que dar o emdereco do quarto

        System.out.println("escreva o raio:");
        double raio = sc.nextDouble();

        System.out.println("circuverencia: " + circuferencia(raio));
        //membros que fazem sentido independentemente de objetos.
        //(nao precisa de objeto para serem chamados)
        //sao chamados a partir do propio nome da classe

        System.out.println("volume: " + program.volume(raio));//contornar o problema para nao usar metodo estatico
        System.out.println("valor de PI: " + PI);

    }

    public static double circuferencia(double raio) {//
        return 2 * PI * raio;
    }

    public double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }
}