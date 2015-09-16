package ticket;

import java.util.HashMap;

public class FactoriaArticulos implements Actualizar {
	// Singleton
	private static FactoriaArticulos factoria;

	public static FactoriaArticulos getFactoria() {
		if (factoria == null)
			factoria = new FactoriaArticulos();
		return factoria;
	}

	private final ListaArticulos articulos;
	private final HashMap<Integer, Articulo> mapa;

	public FactoriaArticulos() {
		this.mapa = new HashMap<Integer, Articulo>();
		// Observer
		this.articulos = new ListaArticulos(this);
	}

	public Articulo get(Integer codigoBarras) {
		if (mapa.containsKey(codigoBarras))
			return mapa.get(codigoBarras);
		Articulo articulo = this.articulos.getArticulo(codigoBarras);
		this.mapa.put(codigoBarras, articulo);
		return articulo;
	}

	@Override
	public void articuloModificado(Articulo articulo) {
		this.mapa.put(articulo.getCodigoBarras(), articulo);
	}
}
