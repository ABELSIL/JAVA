import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codItem1 = teclado.nextInt();
		int qtdItem1 = teclado.nextInt();
		double valorItem1 = teclado.nextDouble();
		int codItem2 = teclado.nextInt();
		int qtdItem2 = teclado.nextInt();
		double valorItem2 = teclado.nextDouble();
		
		double valorTotal = (qtdItem1 * valorItem1) + (qtdItem2 * valorItem2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
    }
}