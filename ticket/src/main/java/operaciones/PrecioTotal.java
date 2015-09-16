package operaciones;

import ticket.Anulacion;
import ticket.Compra;
import ticket.Descuento;
import ticket.Repeticion;

public class PrecioTotal extends Operacion {
	private int total;

	public PrecioTotal() {
		this.total = 0;
	}

	public int getTotal() {
		return this.total;
	}

	@Override
	public void operarConAnulacion(Anulacion anulacion) {
		this.total -= anulacion.getArticulo().getPrecio();
	}

	@Override
	public void operarConCompra(Compra compra) {
		this.total += compra.getArticulo().getPrecio();
	}

	@Override
	public void operarConRepeticion(Repeticion repeticion) {
		this.total += repeticion.getArticulo().getPrecio()
				* repeticion.getValor();
	}

	@Override
	public void operarConDescuento(Descuento descuento) {
		this.total -= descuento.getArticulo().getPrecio();
	}

}