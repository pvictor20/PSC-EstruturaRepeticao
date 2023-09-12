/*
 *Escreva um programa que exibe os primeiros 100 números naturais. Faça versões
usando for, while e do/while.
Reimplemente o exercício 1, fazendo com que os valores sejam exibidos em ordem
reversa.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        int x = 0;

        for (x = 99; x >=0; x--) {
            System.out.println(x);
            System.out.println("até aqui foi em for!!!");
        }

        x = 99;

        while (x>=0) {
            System.out.println(x);
            x--;
            System.out.println("até aqui foi em while!!!");
        }

        x = 99;

        do{
            System.out.println(x);
            x--;
            System.out.println("até aqui foi em do while!!!");
        } while (x>=0);
    }
}
