package V3_application;
/**
 * (versao 3)
 * classe Calculator com método estático
 * OBS: nao precisei instanciar, so dei o nome da class V3_calculadora,
 */

import V3_utilitarios.V3_calculadora;

import java.util.Locale;
import java.util.Scanner;

public class V3_program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva o raio:");
        double raio = sc.nextDouble();

        System.out.println("circuverencia: " + V3_calculadora.circuferencia(raio));
        System.out.println("volume: " + V3_calculadora.volume(raio));
        System.out.println("valor de PI: " + V3_calculadora.PI);
    }
}
