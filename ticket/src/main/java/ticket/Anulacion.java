package ticket;

import operaciones.Operacion;

public class Anulacion extends Linea {

	public Anulacion(Articulo articulo) {
		super(articulo);
	}

	@Override
	public void aceptar(Operacion operacion) {
		operacion.operarConAnulacion(this);
	}

}
