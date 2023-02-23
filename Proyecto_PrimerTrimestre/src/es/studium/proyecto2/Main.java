package es.studium.proyecto2;

import java.util.ArrayList;
import java.util.List;		//Importamos de la librer�a java estas opciones para poder generar diferentes utilidades.
import java.util.Random;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)	//Como lo aprendido en ED, instanciaremos 10 nuevas preguntas con el m�todo new d�ndoles diferentes valores al gusto.
	{
		Pregunta p1 = new Pregunta("�Llueve acido?", false);
		Pregunta p2 = new Pregunta("�2+2 son 5?", false);
		Pregunta p3 = new Pregunta("�El tomate es una fruta?", true);
		Pregunta p4 = new Pregunta("�El Sol est� m�s cerca que la Luna?", false);
		Pregunta p5 = new Pregunta("�Diez m�s diez son veinte?", true);
		Pregunta p6 = new Pregunta("�China est� en Europa?", false);
		Pregunta p7 = new Pregunta("�Los �rboles son rojos?", false);
		Pregunta p8 = new Pregunta("�Los �rboles son verdes?", true);
		Pregunta p9 = new Pregunta("�La tierra se puede beber?", false);
		Pregunta p10 = new Pregunta("�Jap�n est� en Asia?", true);

		List<Pregunta> preguntas = new ArrayList<>(); //Guardamos nuestras preguntas en una "lista de array" que nos permite almacenar los datos de forma similar
		preguntas.add(p1);							  //al array con la ventaja que estas "listas de array" no hace falta declarar su tama�o con anterioridad.
		preguntas.add(p2);
		preguntas.add(p3);
		preguntas.add(p4);
		preguntas.add(p5);
		preguntas.add(p6);
		preguntas.add(p7);
		preguntas.add(p8);
		preguntas.add(p9);
		preguntas.add(p10);

		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		int aciertos = 0;	//Declararemos una nueva variable llamada aciertos d�ndole un valor de 0.

		for (int i = 1; i <= 3; i++) //Se inicia nuestro bucle donde recorrer� desde 1 hasta 3 o menos en nuestra lista para coger 3 preguntas.
		{							 //si pusi�semos i = 0, contar�a hasta 4 preguntas.

			int preg = random.nextInt(0, preguntas.size());//Generaremos de forma aleatoria en una nueva variable una pregunta desde la posici�n 0 hasta el m�ximo.
			Pregunta p = preguntas.get(preg); //Con Get accederemos a los valores de esta pregunta.
			System.out.println(p.getEnunciado()); //Sacaremos la pregunta por pantalla.

			System.out.println("Verdadero (v) /// Falso (f)"); //Pediremos al usuario que nos de la respuesta.

			String respuesta = teclado.nextLine(); //Compararemos cadenas. Si el usuario escribe "v" y el booleano tiene el valor "true" sumar� un acierto.
			if ((respuesta.equals("v")) == p.getRespuesta())
				aciertos++;
			preguntas.remove(preg); //Para evitar la repetici�n de preguntas usaremos una funcionalidad que se llama remove para ir eliminando preguntas del bucle.

		}
		System.out.println("�Total aciertos! " + aciertos + "/3"); //Mostraremos por pantalla el resultado final de aciertos.
		teclado.close();

	}

}
