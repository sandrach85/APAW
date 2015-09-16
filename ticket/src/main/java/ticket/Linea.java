package ticket;

import operaciones.Operacion;

public abstract class Linea {
	private Articulo articulo;

	public Linea(Articulo articulo) {
		this.articulo = articulo;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public abstract void aceptar(Operacion operacion);
}
