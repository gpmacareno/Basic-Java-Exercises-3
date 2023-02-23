package es.studium.alternativa;

public class alternativa2
{

	public static void main(String[] args)
	{
		final int MAX = 4; //Declaramos una Constante de tama�o 4
		String fosas[] =   //Creamos una tabla de 4 Strings o cadenas con el nombre que nos pide el enunciado.
		{ "Calipso", "Marianas", "Puerto Rico", "Aleutianas"};
		int profundidades[] = //Creamos una tabla de 4 enteros con las profundidades dadas en el enunciado.
		{ 5270, 11034, 8800, 7822};
		int maximo = profundidades[0];   //Creamos una variable llamada m�ximo situada en la posici�n 0 de la tabla de profundidades.
		int minimo = profundidades[0];	 //Creamos una variable llamada minima situada en la posici�n 0 de la tabla de profundidades.
		int masprofunda = 0;		//Creamos una variable llamada masprofunda con valor base de 0.
		int menosprofunda = 0;		//Creamos una variable llamada menosprofunda con valor base de 0.
		for (int i = 0; i < MAX; i++) //Recorremos la tabla que hemos creado desde la posicion cero, contando que el iterador siempre ser�
		{							//menor que el tama�o m�ximo de la tabla nunca igual, e ira en incremento de uno hasta llegar al tope asignado.
			if (profundidades[i] > maximo)
			{								//Si, la posici�n de las profundidades en la tabla es mayor que el m�ximo esta se convertir�
				maximo = profundidades[i];	// en las profundidades mas profundas y la asignaremos su variable.
				masprofunda = i;			//Si, la posicion 0 de profundidad se va a ir comparando con los distintos valores de la tabla
			}								//5270 es mayor que la posicion 0? Es lo mismo, asi que se guardara esa info. 11 se compara con 5270
											// 
			if (profundidades[i] < minimo) //Si, la posici�n de las profundidades en la tabla es menor que el minimo esta se convertir�
			{								// en las profundidades menos profundas y la asignaremos su variable.
				minimo = profundidades[i];
				menosprofunda = i;
			}
		}
		System.out.println(fosas[masprofunda]); //Mostramos en pantalla el resultado deseado.
		System.out.println(profundidades[masprofunda]);
		System.out.println(fosas[menosprofunda]);
		System.out.println(profundidades[menosprofunda]);
	}

}
