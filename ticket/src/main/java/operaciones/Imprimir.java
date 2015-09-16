package operaciones;

import impresora.Impresora;
import ticket.Anulacion;
import ticket.Compra;
import ticket.Descuento;
import ticket.Repeticion;

public class Imprimir extends Operacion {

	public Imprimir() {
	}

	@Override
	public void operarConAnulacion(Anulacion anulacion) {
		Impresora.getImpresoraActiva().println(
				"(Anul.) " + anulacion.getArticulo().getDescripcion()
						+ " .... -" + anulacion.getArticulo().getPrecio());
	}

	@Override
	public void operarConCompra(Compra compra) {
		Impresora.getImpresoraActiva().println(
				compra.getArticulo().getDescripcion() + " .... +"
						+ compra.getArticulo().getPrecio());
	}

	@Override
	public void operarConRepeticion(Repeticion repeticion) {
		Impresora.getImpresoraActiva().println(
				"(" + repeticion.getValor() + "X) "
						+ repeticion.getArticulo().getDescripcion() + " ("
						+ repeticion.getArticulo().getPrecio() + ") .... +"
						+ repeticion.getArticulo().getPrecio()
						* repeticion.getValor());
	}

	@Override
	public void operarConDescuento(Descuento descuento) {
		Impresora.getImpresoraActiva().println(
				"(" + descuento.getDescripcion() + ") "
						+ descuento.getArticulo().getDescripcion() + " ....  -"
						+ descuento.getArticulo().getPrecio());
	}

}
