import java.util.Scanner;

public class M5_ex4_damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
	    int rand = (int)Math.ceil((Math.random() * 10));
		int intentos = 4;
		
		//System.out.println(rand); Para comprobar que funciona
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix una xifra del 1 al 10: ");
		num = entrada.nextInt();
		
		while (num != rand && intentos > 0) {
			System.out.println("Torna a intentar-ho: ");
			num = entrada.nextInt();
			if(num != rand) {	
				intentos--;
			}
			}
		
		if (intentos == 0 && num != rand) {
			System.out.println("Has exhaurit totes les 5 possibilitats per encertar!");
			
		}else if(num == rand) {
			System.out.println("Enhorabona, has encertat la xifra que l´ordinador a generat!");
		}
		
	}

}
