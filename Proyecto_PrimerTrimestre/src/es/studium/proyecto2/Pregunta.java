package es.studium.proyecto2;

public class Pregunta        //Crearemos una clase POJO que no lleva m�todo MAIN llamada "Pregunta" donde asignar y crear variables.
{							

	private String enunciado;	//Necesitaremos un String llamado enunciado para guardar los enunciados de nuestras preguntas.
	private Boolean respuesta;	//Al ser un programa con respuestas Verdadero - Falso. Crearemos una variable tipo boolean que tendr� valores de true o false.

	public Pregunta(String enunciado, Boolean respuesta)
	{

		this.enunciado = enunciado; //Crearemos su correspondiente constructor por parametros, somos nosotros quienes les damos unos par�metros con 
		this.respuesta = respuesta;	//los que el programa pueda trabajar. En este constructor hay que tener sumo cuidado ya 
									//que el nombre de la variable y los atributos no pueden ser el mismo para que esto no ocurra usaremos el t�rmino this.
	}

	public String getEnunciado()	//Para terminar nuestra clase POJO crearemos los m�todos constructores Getter and Setter. 
									//El m�todo Get me permitir� obtener el valor del atributo que corresponda y el m�todo Set 
									//nos permitir� darle el valor al atributo que queramos.
	{
		return enunciado;
	}

	public void setEnunciado(String enunciado)
	{
		this.enunciado = enunciado;
	}

	public Boolean getRespuesta()
	{
		return respuesta;
	}

	public void setRespuesta(Boolean respuesta)
	{
		this.respuesta = respuesta;
	}

}
