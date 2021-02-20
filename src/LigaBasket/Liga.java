package LigaBasket;

import java.util.ArrayList;

public class Liga {

	private String nombre;
	private ArrayList<Equipo> equipos;

	public Liga(String nombre) {

		setNombre(nombre);
		equipos = new ArrayList<Equipo>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarJugador(String nombreEquipo, int numero, String apellido, String nombre, Posicion posicion,
			int valoracion) {
		boolean pude = false;

		Equipo equipo = this.buscarEquipo(nombreEquipo);

		if (equipo != null) {

			pude = equipo.agregarJugador(numero, apellido, nombre, posicion, valoracion);

		}

		return pude;
	}

	public boolean agregarEquipo(String nombre) {
		boolean pude = false;

		Equipo equipo = this.buscarEquipo(nombre);

		if (equipo == null) {

			this.equipos.add(new Equipo(nombre));
			pude = true;

		}

		return pude;

	}

	private Equipo buscarEquipo(String nombre) {

		Equipo equipoRet = null;

		int i = 0;

		while (i < this.equipos.size() && equipoRet == null) {

			if (equipos.get(i) != null && equipos.get(i).esNombreValido(nombre)) {
				equipoRet = equipos.get(i);

			} else {
				i++;
			}

		}

		return equipoRet;

	}

	public Resultado competir(String eLocal, String eVisitante) {

		Resultado resultado = Resultado.LOCAL;

		Equipo local = this.buscarEquipo(eLocal);

		if (local == null) { // ASI BUSCO SOLO UN EQUIPO ANTES DE BUSCAR EL OTRO

			resultado = Resultado.PARTIDO_INEXISTENTE;

		} else {

			Equipo visitante = this.buscarEquipo(eVisitante); // SI LLEGO ACA ES PROQUE EL EQUIPO ANTERIOR EXISTE

			if (visitante != null) { // SI ESTE NO ES ES NULL, ESTAN LOS DOS, EVALUO EL RESULTADO

				int totalLocal = local.obtenerTotalValoracioneJugadores();
				int totalVisitante = visitante.obtenerTotalValoracioneJugadores();

				if (totalLocal > totalVisitante) {

					resultado = Resultado.LOCAL;

				} else if (totalVisitante > totalLocal) {

					resultado = Resultado.VISITANTE;
				}

			} else { // SI EL IF ANTERIOR ES NULL, ES PORQUE NO ESTA EL EQUIPO, NO SE REALIZA LA
						// COMPETICION.

				resultado = Resultado.PARTIDO_INEXISTENTE;
			}
		}

		return resultado;

	}

	public void mostrarAllStar() {

		mostrarAllStar(Posicion.BASE);
		mostrarAllStar(Posicion.ESCOLTA);
		mostrarAllStar(Posicion.ALERO);
		mostrarAllStar(Posicion.PIVOT);
		mostrarAllStar(Posicion.ALA_PIVOT);

	}

	private void mostrarAllStar(Posicion pos) {

		Jugador jugadorProceso = null;
		Jugador jugador = null;
		int max = Integer.MIN_VALUE;

		for (Equipo equipo : equipos) {

			jugadorProceso = equipo.obtenerMejorJugadorEnPos(pos);

			if (jugadorProceso.getValoracion() > max) {
				max = jugadorProceso.getValoracion();
				jugador = jugadorProceso;
			}

		}

		System.out.println(pos + ": " + jugador.getApellido() + " , " + jugador.getNombre());

	}

}
