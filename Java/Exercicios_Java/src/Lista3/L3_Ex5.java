/* L3_Ex5
 *  Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 *  No final, mostre a soma dos n�meros digitados.
 */
package Lista3;
import java.util.*;

public class L3_Ex5 {
	public static void main(String args[])
	{
		Scanner read = new Scanner(System.in);
		int num, soma=0;
		
		System.out.println("Digite um n�mero");
		do 
		{
			num = read.nextInt();
			soma= soma + num;
			System.out.println("+");
		}while(num != 0);
		System.out.println("----------------");
		System.out.printf(" A soma deu %d", soma);
	}

}
