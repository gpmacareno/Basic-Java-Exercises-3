package es.studium.alternativa;

import java.util.Scanner;

public class alternativa
{

	public static void main(String[] args)
	{
		String cadenas[] = new String[10]; //Guardamos una nueva tabla de hasta 10 cadenas.
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < cadenas.length; i++) //Buscaremos en la tabla. Desde 0 hasta el máximo de la longitud de la tabla incrementando en uno.
		{
			System.out.println("Introduce la frase nº" + (i + 1)); //syso para mostrar en pantalla lo que quiere el usuario que escriba, entre parentesis saldra el número de la cadena porque vamos sumando en 1.
			cadenas[i] = teclado.nextLine();
		}

		String menor = cadenas[0];	//Comenzamos nuestra busqueda y comparacion en la tabla en la posición 0. 
		for (int i = 1; i < cadenas.length; i++) //Criterio: para i  = 1 mientras que la posición sea menor la longitud de la cadena incrementando en 1.
		{										//porque hemos definido 0 como primera frase a comparar.

			if (cadenas[i].length() < menor.length()) //y una vez dentro de ese bucle vas comparando la frase  con la que toque, ademas[i] es nuestro candidato a ser el mayor
				// y mayor la cadena mas larga encontrada
				// con el .length() vemos la longitud de caracteres
			{
				menor = cadenas[i]; //se registrará el valor mas bajo en este nueva variable.
			}
		}
		System.out.println("La frase de menor tamaño es :");
		System.out.println(menor);
		teclado.close();
	}

}
