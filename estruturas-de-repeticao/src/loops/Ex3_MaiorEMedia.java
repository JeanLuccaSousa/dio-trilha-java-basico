package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int media = 0;
        int maior = 0;

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            media = media + numero;

            if(numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números digitados é: " + (media/5));
    }
}
