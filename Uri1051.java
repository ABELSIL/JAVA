import java.util.Scanner;
public class Uri1051{
	public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

	double salario, imposto, faixa1, faixa2, faixa3;

	salario = teclado.nextDouble();
    
 	if(salario <= 2000){
   		System.out.print("Isento\n");
  	}else{
   		if(salario > 2000 && salario <= 3000){
    faixa1 = salario - 2000;
    faixa1 = ((faixa1 * 8) / 100);
    salario = faixa1;
   }else if(salario> 3000 && salario <= 4500){
    faixa1 = salario - 2000;
    faixa2 = faixa1 - 1000;
    faixa1 -= faixa2;
    faixa1 = ((faixa1 * 8) / 100);
    faixa2 = ((faixa2 * 18) / 100);
    salario = faixa2 + faixa1;
   }else{
    faixa1 = salario - 2000;
    faixa2 = faixa1 - 1000;
    faixa3 = faixa2 - 1500;
    faixa1 -= faixa2;
    faixa2 -= faixa3;
    faixa1 = ((faixa1 * 8) / 100);
    faixa2 = ((faixa2 * 18) / 100);
    faixa3 = ((faixa3 * 28) / 100);
    salario = faixa3 + faixa2 + faixa1;
   }
   System.out.printf("R$ %.2f\n",salario);
  }
 
    }
 
}
