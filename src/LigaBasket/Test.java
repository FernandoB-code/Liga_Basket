package LigaBasket;

public class Test {

	public static void main(String[] args) {

		Liga liga = new Liga("NBA");

		System.out.println(liga.agregarEquipo("LA Lakers"));
		System.out.println(liga.agregarEquipo("Miami Heat"));

		System.out.println(liga.agregarJugador("LA Lakers", 23, "James", "Lebron", Posicion.ALERO, 99));
		System.out.println(liga.agregarJugador("LA Lakers", 1, "Caldwell Pope", "Kentavious", Posicion.ESCOLTA, 86));
		System.out.println(liga.agregarJugador("LA Lakers", 9, "Rondo", "Rajon", Posicion.BASE, 90));
		System.out.println(liga.agregarJugador("LA Lakers", 4, "Caruso", "Alex", Posicion.ESCOLTA, 82));
		System.out.println(liga.agregarJugador("LA Lakers", 3, "Davis", "Anthony", Posicion.ALA_PIVOT, 95));
		System.out.println(liga.agregarJugador("LA Lakers", 39, "Howard", "Dwight", Posicion.PIVOT, 84));
		
		
		System.out.println(liga.agregarJugador("Miami Heat", 7, "Dragic", "Goran", Posicion.BASE, 87));
		System.out.println(liga.agregarJugador("Miami Heat", 14, "Herro", "Tyler", Posicion.ESCOLTA, 84));
		System.out.println(liga.agregarJugador("Miami Heat", 28, "Iguodala", "Andre", Posicion.ESCOLTA, 88));
		System.out.println(liga.agregarJugador("Miami Heat", 99, "Crowder", "Jae", Posicion.ALERO, 83));
		System.out.println(liga.agregarJugador("Miami Heat", 22, "Butler", "Jimmy", Posicion.ALA_PIVOT, 97));
		System.out.println(liga.agregarJugador("Miami Heat", 13, "Adebayo", "Bam", Posicion.PIVOT, 91));

		System.out.println("*** PARTIDO LA Lakers vs Heat ***");
		System.out.println("GANADOR: " + liga.competir("LA Lakers", "Miami Heat"));
		
		System.out.println("***** EQUIPO ALL STAR DE LA NBA *****");
		
		liga.mostrarAllStar();
		
	}

}
