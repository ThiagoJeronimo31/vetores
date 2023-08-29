package soma_vetor;

import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

 System.out.println("Quantos números você vai digitar? ");
 int n = sc.nextInt();
 double soma = 0;
 
 double[] vect = new double[n];

for(int i = 0; i<vect.length;i++){
    System.out.println("Digite um número: ");
    vect[i] = sc.nextDouble();
    soma+=vect[i];
    
} 

double media = soma/n;
        System.out.println("Valores = ");
for(int i = 0; i<vect.length;i++){
    System.out.printf("%.1f  ",vect[i]);

}
        System.out.println("");
        System.out.printf("Soma = %.2f%n ",soma);
        System.out.printf("MÉDIA = %.2f%n",media);




    }
    
}
