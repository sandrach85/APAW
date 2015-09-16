package ticket;

public class Articulo {
	private int codigoBarras;
	private String descripcion;
	private String descripcionCorta;
	private int precio;
	private int oferta;

	public Articulo(int codigoBarras, String descripcion,
			String descripcionCorta, int precio, int oferta) {
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.descripcionCorta = descripcionCorta;
		this.precio = precio;
		this.oferta = oferta;
	}

	public int getOferta() {
		return oferta;
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

}
