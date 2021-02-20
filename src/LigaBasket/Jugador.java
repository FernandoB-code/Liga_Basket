package LigaBasket;

public class Jugador {
	private static final int MAX_VALORACION = 100;
	private static final int MIN_VALORACION = 50;

	private int numero;
	private String apellido;
	private String nombre;
	private Posicion posicion;
	private int valoracion;

	/**
	 * Constructor parametrizado
	 * 
	 * @param numero
	 * @param apellido
	 * @param nombre
	 * @param posicion
	 * @param valoracion
	 */
	public Jugador(int numero, String apellido, String nombre, Posicion posicion, int valoracion) {
		setNumero(numero);
		setNombre(nombre);
		setApellido(apellido);
		setPosicion(posicion);
		setValoracion(valoracion);
	}

	/**
	 * @return El apellido del jugador.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return El numero del jugador
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return La posición del jugador.
	 */
	public Posicion getPosicion() {
		return posicion;
	}

	/**
	 * @return El nombre del jugador.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return La valoracion del jugador.
	 */
	public int getValoracion() {
		return valoracion;
	}

	/**
	 * @param apellido El apellido del jugador.
	 */
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @param numero El número del jugador.
	 */
	private void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @param posicion La posición del jugador.
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	/**
	 * @param nombre El nombre del jugador.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param valoracion La valoración del jugador.
	 */
	private void setValoracion(int valoracion) {
		if (valoracion > MAX_VALORACION) {
			this.valoracion = MAX_VALORACION;
		} else if (valoracion < MIN_VALORACION) {
			this.valoracion = MIN_VALORACION;
		} else {
			this.valoracion = valoracion;

		}
	}

	
	
	public boolean esNumeroValido(int numero) {
		
		return this.numero == numero;
	}

	public boolean esPosValida(Posicion pos) {
		
		return this.posicion.equals(pos);
		
		
	}

}