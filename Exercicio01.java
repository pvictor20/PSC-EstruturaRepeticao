/*
 * Escreva um programa que exibe os primeiros 100 números naturais. Faça versões
usando for, while e do/while.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i< 100; i++) {
            System.out.println(x+i);
            System.out.println("Até aqui foi em FOR!!!!!!!");
        }

        x = 0;

        while (x<=100) {
            System.out.println(x);
            x++;
            System.out.println("até aqui foi em WHILE!!!!!!!!");
        }

        x = 0;

        do{
            System.out.println(x);
            x++;
            System.out.println("até aqui foi em DO WHILE!!!!!!!!");
        }while (x<100);
    }
}
