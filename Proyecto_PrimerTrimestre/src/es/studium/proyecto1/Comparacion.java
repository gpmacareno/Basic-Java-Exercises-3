package es.studium.proyecto1;

import java.util.Scanner;

public class Comparacion
{

	public static void main(String[] args)
	{

		String cadenas[] = new String[10]; // Guardamos una nueva tabla de hasta 10 cadenas.
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < cadenas.length; i++) // Rellenamos la tabla. Desde 0 hasta el máximo de la longitud de la
													// tabla incrementando en uno.
		{
			System.out.println("Introduce la cadena nº" + (i + 1)); // syso para mostrar en pantalla lo que quiere el
																	// usuario que escriba,
			cadenas[i] = teclado.nextLine(); // entre paréntesis saldrá el número de la cadena porque vamos sumando en
												// 1.
		}

		String mayor = cadenas[0]; // Comenzamos nuestra busqueda y comparacion en la tabla en la posición 0.
		for (int i = 1; i < cadenas.length; i++) // Criterio: Irá comparando por la longitud de las cadenas.
		{ // La (i) será igual a 1 porque hemos definido 0 como primera frase a comparar.

			if (cadenas[i].length() > mayor.length()) // Una vez dentro de ese bucle va comparando la frase con la que
														// toque.
			// Además[i] es nuestro candidato a ser el mayor.
			// Con el .length() vemos la longitud de caracteres y las va comparando.
			{
				mayor = cadenas[i]; // se registrará el valor más alto en esta nueva variable.
			}
		}
		System.out.println("La cadena de mayor tamaño es :"); // Mostraremos en pantalla el resultado.
		System.out.println(mayor);
		teclado.close();
	}

}
