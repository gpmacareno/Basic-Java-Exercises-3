package es.studium.proyecto1;

import java.util.Random;  //Importamos de la librer�a java esta opci�n para poder generar n�meros aleatorios.

public class PseudoCodigo
{

	public static void main(String[] args)
	{
	
						
		int a = 0;		//Declaramos Variables.
		int b = 0;		//Asignamos valores a las variables.
		int n;			
		Random r = new Random();//Con este programa generaremos  un bucle que generar� diez n�meros al azar del "0" al "9",
								//en cada rotaci�n se crear� un nuevo n�mero,  (a) ser� el n�mero generado m�s la (a) de la rotaci�n anterior.
								//y (b) se ir� incrementando en 2, al llegar a la d�cima rotaci�n llegar� a ser 20. 
								//Se cumplir� la condici�n  del while. Parar� la rotaci�n y dividiremos el resultado final de (a) que se ha ido sumando entre b, 
								//que es 20. 
		do
		{
			n = r.nextInt(10); //En n, nos devolver� un n�mero aleatorio comprendido entre 0 (incluido) y 9 ya que el 10 est� excluido.
			a = a + n;
			b = b + 2;
			
		System.out.println("Rotaci�n: ");
		System.out.println("n= " + n);			//En esta secci�n iremos mostrando en pantalla los diferentes valores que se ir�n generando en este bucle.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
			
		}
		
		while (b != 20);
		System.out.println((double)a / (double)b); //Al ser una divisi�n nos generar� un n�mero con decimales, algo no que no podremos hacer con un INT.
												   //Para ello, cambiamos estos valores enmascar�ndolos como doubles d�ndoles nosotros este valor entre par�ntesis.
		
	}

}
