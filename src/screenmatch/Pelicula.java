package screenmatch;

public class Pelicula {
	
	 String nombre;
	    private int fechaDeLanzamiento;
	    private int duracionEnMinutos;
	    private boolean incluidoEnElPlan;
	    private double sumaDeLasEvaluaciones;
	    private int totalDelasEvaluaciones;


			
	    public String getNombre() {
				return nombre;
			}

			public int getFechaDeLanzamiento() {
				return fechaDeLanzamiento;
			}

			public int getDuracionEnMinutos() {
				return duracionEnMinutos;
			}

			public boolean isIncluidoEnElPlan() {
				return incluidoEnElPlan;
			}

			public double getSumaDeLasEvaluaciones() {
				return sumaDeLasEvaluaciones;
			}

			public int getTotalDelasEvaluaciones() {
				return totalDelasEvaluaciones;
			}

			void muestraFichaTecnica(){
	        System.out.println("El nombre de la película es: " + nombre);
	        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
	        System.out.println("Duración en minutos: "+ duracionEnMinutos);
	    }

	    void evalua(double nota){
	        sumaDeLasEvaluaciones += nota;
	        totalDelasEvaluaciones++;
	    }

	    double calculaMedia(){
	        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
	    }

}
