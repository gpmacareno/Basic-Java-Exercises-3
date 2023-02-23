package es.studium.proyecto1;

import java.util.Scanner; 

public class Ordenacion
{

	public static void main(String[] args)
	{
		final int MAX = 10;				//Asignamos las variables.
		int tabla[] = new int[MAX];
		int i;
		int j;
		int aux;
		int ind_menor;
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < MAX; i++) //Creamos el bucle donde se guardar� la tabla.
		{
			System.out.println("D�me un n�mero entero: "); 
			tabla[i] = teclado.nextInt();
		}
		teclado.close();

		for (i = 0; i < MAX - 1; i++) //Comienza la b�squeda en la tabla.
		{

			ind_menor = i; // El n�mero menor es el de la posici�n 0.
			for (j = i + 1; j < MAX; j++) // �ndice el siguiente de i.
			{
				if (tabla[j] < tabla[ind_menor]) // Al encontrar uno menor lo guardar� en el �ndice j.
				{
					ind_menor = j;

				}

			}
			aux = tabla[i]; // En este proceso se realiza el intercambio.
			tabla[i] = tabla[ind_menor];
			tabla[ind_menor] = aux;
		}

		System.out.println("La tabla ordenada queda as�: ");	//Mostraremos por pantalla.
		for (i = 0; i < MAX; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
