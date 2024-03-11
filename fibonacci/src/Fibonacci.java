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

        return b == num;
    }

    public static void showFibonacci(int num) {
        int a = 0;
        int b = 1;

        while(a <= num) {
            System.out.println(a + " ");
            int aux = b;
            b = a + b;
            a = aux;
        }
    }
}
