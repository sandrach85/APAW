package ticket;

public class ListaArticulos {

	private Actualizar oyente;

	public ListaArticulos(Actualizar oyente) {
		this.oyente = oyente;
	}

	public Articulo getArticulo(int codigoBarras) {
		// Se accede a la BD por TCP/IP
		if (codigoBarras == 0)
			return new Articulo(codigoBarras, "Azucar 1kg Azucarera", "Azucar",
					100, 1);
		else if (codigoBarras == 1)
			return new Articulo(codigoBarras, "Sal yodada 1Kg Marina", "Sal",
					40, 0);
		else if (codigoBarras == 2)
			return new Articulo(codigoBarras, "Tomate 1Kg Orlando", "Tomate",
					80, 0);
		else
			return new Articulo(codigoBarras, "Varios...", "Varios", 100, 0);
	}

	public void modificarArticulo() {
		oyente.articuloModificado(new Articulo(1, "Sal yodada 1Kg Marina",
				"Sal", 10, 1));
	}
}