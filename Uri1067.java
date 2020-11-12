import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

	int numero;
        
        numero = teclado.nextInt();

        System.out.print(1+"\n");
        
		for (int cont = 1; cont < numero-1; cont+=2) {
           	int numImpar = cont + 2;
            System.out.print(numImpar+"\n");
        }
    }
 
}