import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
int numero, novonumero, unidade, dezena, centena, resto;
System.out.println("digite o n�mero de tr�s digidos");
numero=teclado.nextInt();
centena=numero/ 100;
resto=numero % 100;
dezena=resto/10;
unidade=resto%10;
novonumero=unidade*100+dezena*10+centena;
System.out.println("o n�mero invertido vale"+novonumero);

}
}
