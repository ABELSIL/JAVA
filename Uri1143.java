import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);

      	int N;
	int Res;
	int Res2;
	int Res3;
	N = 0;
	Res = 1;

	N = teclado.nextInt();
	for (int cont=1; cont <=N ; cont++){
		System.out.println(Res+ " " +(Res*Res) + " " +(Res*Res*Res));
		Res+=1;
	}
}
}