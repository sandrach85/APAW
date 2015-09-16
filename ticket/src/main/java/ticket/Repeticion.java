package ticket;

import operaciones.Operacion;

public class Repeticion extends Linea {
	private int valor;

	public Repeticion(Articulo articulo, int valor) {
		super(articulo);
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public void aceptar(Operacion operacion) {
		operacion.operarConRepeticion(this);
	}

}
