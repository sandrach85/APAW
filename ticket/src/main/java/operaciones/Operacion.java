 package operaciones;

import ticket.Anulacion;
import ticket.Compra;
import ticket.Descuento;
import ticket.Repeticion;

public abstract class Operacion {

	public abstract void operarConCompra(Compra compra);

	public abstract void operarConAnulacion(Anulacion anulacion);

	public abstract void operarConRepeticion(Repeticion repeticion);

	public abstract void operarConDescuento(Descuento descuento);
	
}
