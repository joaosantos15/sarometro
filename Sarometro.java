import java.util.Scanner;

public class Sarometro {

	void dorme(int mili){

	}

	public static void main(String[] args) {

		

		Scanner user_input = new Scanner( System.in );
		String first_name;
		
		System.out.println("ola, insira as horas a que combinou encontrar-se com a Sara");
		System.out.println(" (numero inteiro de 1 a 24)");
		first_name = user_input.next( );

		int hora = Integer.parseInt(first_name);
		//hora=hora%10;

		if(hora%2==0){
				hora=hora+2;
			}
			else
				hora=hora+3;

		try {
    			Thread.sleep(1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
    		}

    		System.out.println("...Calculando...");

    		try {
    			Thread.sleep(1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
    		}

    		System.out.println("...Calculando...");

try {
    			Thread.sleep(1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
    		}

    		System.out.println("...Calculando...");

    		try {
    			Thread.sleep(1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
    		}

    		System.out.println("...Calculando...");
    		System.out.println("-> A Sara vai chegar às "+hora+" horas");
    	}

    }