import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
	    Scanner teclado = new Scanner(System.in);

        float numero;
        int qdtePositivos=0;

        for (int cont=1; cont <=6; cont++){
            numero = teclado.nextFloat();
            if (numero > 0){
            qdtePositivos++;
        }
    }
    System.out.println(qdtePositivos+" valores positivos");
} 
}   