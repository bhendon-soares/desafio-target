/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
 calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        num = scanner.nextInt();

        if(isFibonacci(num)) {
            System.out.println(num + " está na sequência de Fibonacci:");
            showFibonacci(num);
        } else {
            System.out.println(num + " não está na sequência de Fibonacci!");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (b < num) {
            int aux = b;
            b = a + b;
            a = aux;
        }

        return b == num; //se B for igual ao numero fornecido, retorna true(está na sequência de Fibonacci), caso contrário false
    }

    public static void showFibonacci(int num) {
        int a = 0;
        int b = 1;

        while(a <= num) {
            System.out.println(a);
            int aux = b;
            b = a + b;
            a = aux;
        }
    }
}
