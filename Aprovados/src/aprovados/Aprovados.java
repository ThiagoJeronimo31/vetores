
package aprovados;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("Quantos alunos serão digitados");
    int n = sc.nextInt();
    int i;
    double media, soma=0,soma1=0;
    String[] nome = new String[n];
    double[] nota1 = new double[n];
    double[] nota2 = new double[n];
    
    for(i=0;i<n;i++){
        sc.nextLine();
        System.out.println("Digite nome, primeira e segunda nota do " +(i+1)+"ª aluno: ");
       
       nome[i] = sc.nextLine();
       nota1[i] = sc.nextDouble();
       nota2[i] = sc.nextDouble();
       
    }
        System.out.println("Alunos aprovados: ");
        for(i=0;i<n;i++){
            if((nota1[i] + nota2[i])/2 >= 6)
                System.out.println(nome[i]);
        }
        
    
    

    }
    
}
