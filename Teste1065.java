import java.util.Scanner;
public class Teste1065{
        public static void main(String args[]){
	    Scanner teclado = new Scanner(System.in);  
  
        int a, i;
        int tmp = 0;
 
            for (i = 0; i < 5; ++i){
  
            a = teclado.nextInt();
             if(a < 0){
             a = -a;
            }

            if(a % 2 == 0){
             tmp++;
            }
         }

    System.out.printf("%d valores pares\n", tmp);
    }
}