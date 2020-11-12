import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

	float salario;
	    
    salario = teclado.nextFloat();
    if (salario <= 400.0)
    System.out.printf("Novo salario: %.2f\nReajuste: %.2f\nEm percentual: 15 %%\n", salario * 1.15, salario * 0.15);
    else if (salario <= 800.0)
    System.out.printf("Novo salario: %.2f\nReajuste: %.2f\nEm percentual: 12 %%\n", salario * 1.12, salario * 0.12);
    else if (salario <= 1200.0)
    System.out.printf("Novo salario: %.2f\nReajuste: %.2f\nEm percentual: 10 %%\n", salario * 1.10, salario * 0.10);
    else if (salario <= 2000.0)
    System.out.printf("Novo salario: %.2f\nReajuste: %.2f\nEm percentual: 7 %%\n", salario * 1.07, salario * 0.07);
    else
    System.out.printf("Novo salario: %.2f\nReajuste: %.2f\nEm percentual: 4 %%\n", salario * 1.04, salario * 0.04);
 }
}