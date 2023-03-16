package arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {3, 5, 7, 9, 16, -2};

        System.out.println("Vetor: ");
        int count = 0;

        while(count <= (vetor.length -1)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("Vetor: ");
        for(int i = (vetor.length -1); i >= 0; i-- ) {
            System.out.println(vetor[i] + " " );
        }
    }
}
