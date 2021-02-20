package LigaBasket;

import java.util.ArrayList;

public class Equipo {

	final int MAX_JUGADORES = 18;
	private String nombre;
	private ArrayList<Jugador> jugadores;

	public Equipo(String nombre) {

		setNombre(nombre);
		jugadores = new ArrayList<Jugador>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarJugador(int numero, String apellido, String nombre, Posicion posicion, int valoracion) {
		boolean pude = false;
		Jugador jugador = buscarJugador(numero);

		if (jugador == null && this.cantJugadoresEnLista() < MAX_JUGADORES) {
			this.jugadores.add(new Jugador(numero, apellido, nombre, posicion, valoracion));
			pude = true;
		}

		return pude;

	}

	private Jugador buscarJugador(int numero) {

		Jugador jugadorRet = null;
		int i = 0;

		while (i < this.jugadores.size() && jugadorRet == null) {

			if (jugadores.get(i) != null && jugadores.get(i).esNumeroValido(numero)) {
				jugadorRet = jugadores.get(i);

			} else {
				i++;
			}

		}

		return jugadorRet;

	}

	private int cantJugadoresEnLista() {

		return this.jugadores.size();

	}

	public boolean esNombreValido(String nombre) {

		return this.nombre.equalsIgnoreCase(nombre);

	}

	public int obtenerTotalValoracioneJugadores() {
		int total = 0;
		for (Jugador jugador : jugadores) {

			total += jugador.getValoracion();

		}
		return total;
	}

	public Jugador obtenerMejorJugadorEnPos(Posicion pos) {
		int max = Integer.MIN_VALUE;

		Jugador jugardorRet = null;

		for (Jugador jugador : jugadores) {

			if (jugador.esPosValida(pos) && jugador.getValoracion() > max) {

				max = jugador.getValoracion();
				jugardorRet = jugador;

			}

		}
		return jugardorRet;

	}

}
