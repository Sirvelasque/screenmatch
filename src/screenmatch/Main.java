package screenmatch;

public class Main {

	public static void main(String[] args) {
		 Pelicula miPelicula = new Pelicula();
	        miPelicula.nombre = "Encanto";

	        miPelicula.muestraFichaTecnica();
	        miPelicula.evalua(10);
	        miPelicula.evalua(10);

	        System.out.println(miPelicula.getDuracionEnMinutos());
	        System.out.println(miPelicula.getTotalDelasEvaluaciones());
	        System.out.println(miPelicula.calculaMedia());




	}

}
