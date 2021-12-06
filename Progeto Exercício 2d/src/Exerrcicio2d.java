import java.util.Scanner;

public class Exerrcicio2d {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double diagonal1, diagonal2, area;
	System.out.println("por favor digite a diagonal1");
	diagonal1=teclado.nextDouble();
	System.out.println("por favor digite a diagonal2");
	diagonal2=teclado.nextDouble();
	area=diagonal1*diagonal2;
	System.out.println("o valor da área vale"+area);

}
}
