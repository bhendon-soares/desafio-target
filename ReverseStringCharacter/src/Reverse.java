/* Escreva um programa que inverta os caracteres de um string.
    IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse; */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um string para inverte-lá: ");
        String userString = scanner.nextLine();

        String reversedString = reverseString(userString);

        System.out.println("Sua string: " + userString);
        System.out.println("String invertida: " + reversedString);
    }
    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while(start < end) {
            //Faz a troca dos caracteres no ínicio e no fim
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            //Move os ponteiros
            start++;
            end--;
        }

        //Constrói e retorna a string invertida a partir do nosso array de caracteres
        return new String(characters);
    }
}

