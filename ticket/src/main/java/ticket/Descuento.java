package ticket;

import operaciones.Operacion;

public class Descuento extends Linea {
	private int descuento;
	private String descripcion;

	public Descuento(Articulo articulo, int descuento, String descripcion) {
		super(articulo);
		this.descuento = descuento;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getDescuento() {
		return descuento;
	}

	@Override
	public void aceptar(Operacion operacion) {
		operacion.operarConDescuento(this);
	}

}
