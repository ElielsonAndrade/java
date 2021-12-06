import java.util.Scanner;

public class TesteEntrada {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int valor;
	System.out.println("Digite o Valor Numérico");
	valor=teclado.nextInt();
	System.out.println("Você Digitou"+valor);
}
}
