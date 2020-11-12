import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

	int hInicio, hFim, mInicio, mFim, durTotal, durHoras, durMin;

	hInicio=teclado.nextInt();
	mInicio=teclado.nextInt();
	hFim=teclado.nextInt();
	mFim=teclado.nextInt();

	durTotal = (hFim * 60 + mFim) - (hInicio * 60 + mInicio);

	if (durTotal <= 0){
		durTotal = (durTotal + 24*60);
	}
	durHoras = durTotal / 60;
	durMin = durTotal % 60;

	System.out.println("O JOGO DUROU " +durHoras+ " HORA(S) E" +durMin+ " MINUTO(S)");
}
}