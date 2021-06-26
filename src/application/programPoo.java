package application;
 /** (versao 2)
 *  classe Calculator com membros de instância
*/

import utilitarios.calculadora;

import java.util.Locale;
import java.util.Scanner;

    public class programPoo {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            calculadora calculadora = new calculadora();

            System.out.println("escreva o raio:");
            double raio = sc.nextDouble();

            System.out.println("circuverencia: " + calculadora.circuferencia(raio));
            System.out.println("volume: " + calculadora.volume(raio));
            System.out.println("valor de PI: " + calculadora.PI);
        }
}
