
package soma_vetores;

import java.util.Scanner;

public class Soma_vetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int i;
        int[] veta = new int[n];
        int[] vetb = new int[n];
        int[] vetc = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for(i=0;i<n;i++){
            veta[i] = sc.nextInt();
        }
        System.out.println("Digite os valores");
        for(i=0;i<n;i++){
            vetb[i] = sc.nextInt();
            
        }
        for(i=0;i<n;i++){
            vetc[i] = veta[i] + vetb[i];
            System.out.println(vetc[i]);
        }
        
    }
    
}
