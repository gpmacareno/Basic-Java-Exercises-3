package es.studium.proyecto1;

import java.util.Random;  //Importamos de la librería java esta opción para poder generar números aleatorios.

public class PseudoCodigo
{

	public static void main(String[] args)
	{
	
						
		int a = 0;		//Declaramos Variables.
		int b = 0;		//Asignamos valores a las variables.
		int n;			
		Random r = new Random();//Con este programa generaremos  un bucle que generará diez números al azar del "0" al "9",
								//en cada rotación se creará un nuevo número,  (a) será el número generado más la (a) de la rotación anterior.
								//y (b) se irá incrementando en 2, al llegar a la décima rotación llegará a ser 20. 
								//Se cumplirá la condición  del while. Parará la rotación y dividiremos el resultado final de (a) que se ha ido sumando entre b, 
								//que es 20. 
		do
		{
			n = r.nextInt(10); //En n, nos devolverá un número aleatorio comprendido entre 0 (incluido) y 9 ya que el 10 está excluido.
			a = a + n;
			b = b + 2;
			
		System.out.println("Rotación: ");
		System.out.println("n= " + n);			//En esta sección iremos mostrando en pantalla los diferentes valores que se irán generando en este bucle.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
			
		}
		
		while (b != 20);
		System.out.println((double)a / (double)b); //Al ser una división nos generará un número con decimales, algo no que no podremos hacer con un INT.
												   //Para ello, cambiamos estos valores enmascarándolos como doubles dándoles nosotros este valor entre paréntesis.
		
	}

}
