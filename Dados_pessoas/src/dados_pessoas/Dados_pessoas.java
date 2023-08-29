
package dados_pessoas;

import java.util.Scanner;

public class Dados_pessoas {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        int i,m = 0,f=0;
        double[] altura = new double[n];
        char[] sexo = new char[n];
        double menorA=2.0, maiorA=0,media,soma=0;
        for(i=0;i<sexo.length;i++){
            System.out.println("Altura da "+(i+1)+"ª pessoa: ");
            altura[i] = sc.nextDouble();
            
            System.out.println("Gênero da "+(i+1)+"ª pessoa: ");
            sexo[i] = sc.next().toUpperCase().charAt(0);
            
        }
        
        for(i=0;i<altura.length;i++){
            if(altura[i] > maiorA){
                maiorA = altura[i];
            }
            if (altura[i]<menorA){
                menorA = altura[i];
            }    
        }
        
        System.out.println("Menor altura = "+menorA );
        System.out.println("Maior altura = "+maiorA);
        
    
    
    for(i=0;i<n;i++){
        
       if(sexo[i] == 'F'){
           soma+=altura[i];
           f++;
           
       }
       else{
           m++;
       }    
}
    media = soma/f;
        System.out.println("Média das alturas das mulheres = "+media);
        System.out.println("Número de homens = "+m);
    
}
}