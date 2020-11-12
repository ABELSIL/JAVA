import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idFuncionario = teclado.nextInt();
        int horasTrabalhadas = teclado.nextInt();
        double valorHora = teclado.nextDouble();
        
        System.out.printf("NUMBER = %d%n", idFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", horasTrabalhadas * valorHora);
    }
}