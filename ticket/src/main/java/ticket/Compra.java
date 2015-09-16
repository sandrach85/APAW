package ticket;

import operaciones.Operacion;

public class Compra extends Linea {

	public Compra(Articulo articulo) {
		super(articulo);
	}

	@Override
	public void aceptar(Operacion operacion) {
		operacion.operarConCompra(this);
	}

}
