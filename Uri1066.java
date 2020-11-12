import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

     	int numero;
	    int numPar=0;
	    int numImpar=0;
	    int numPosit=0;
	    int numNegat=0;
 
  		for (int cont = 1; cont <= 5; cont++) {
   		numero = teclado.nextInt();
  		if (numero % 2 == 0) {
   		numPar++;}
   
		if (numero % 2 != 0) {
    		numImpar++;}
   
		if (numero > 0) {
    		numPosit += 1;}
   
		if (numero < 0) {
    		numNegat += 1;}
   
  	}
  	System.out.print(numPar+" valor(es) par(es)\n");
  	System.out.print(numImpar+" valor(es) impar(es)\n");
  	System.out.print(numPosit+" valor(es) positivo(s)\n");
  	System.out.print(numNegat+" valor(es) negativo(s)\n");
 
    }
 
}