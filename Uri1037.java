import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

    float numero;
  	numero = teclado.nextFloat();

	if (numero >=0 && numero <= 25.0000) {
   		System.out.printf("Intervalo [0,25]\n");

  	}else if (numero >= 25.00001 && numero <= 50.0000000) {
  		System.out.printf("Intervalo (25,50]\n");

  	}else if (numero >= 50.00001 && numero <= 75.0000000) {
   		System.out.printf("Intervalo (50,75]\n");
  
	}else if (numero >= 75.00001 && numero <=100.0000000) {
   		System.out.printf("Intervalo (75,100]\n");
  	}else {
   		System.out.print("Fora de intervalo\n");
  }

 }

}