import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

	int horaInicio, horaFim, duracaoJogo;

	horaInicio = teclado.nextInt();
	horaFim = teclado.nextInt();

     	duracaoJogo = horaFim - horaInicio;

     	if (duracaoJogo <= 0){
        duracaoJogo = (duracaoJogo + 24);
        }
	System.out.println("O JOGO DUROU " +duracaoJogo+" HORA(S)");
 
 }
}