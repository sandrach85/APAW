package operaciones;

import java.util.HashMap;
import java.util.Map;

import ticket.Anulacion;
import ticket.Articulo;
import ticket.Compra;
import ticket.Descuento;
import ticket.FactoriaArticulos;
import ticket.Repeticion;
import ticket.Ticket;

public class Oferta3x2 extends Operacion {
	public static final int Oferta3X2 = 1;
	private Map<Integer, Integer> articulos;

	public Oferta3x2() {
		this.articulos = new HashMap<Integer, Integer>();
	}

	@Override
	public void operarConAnulacion(Anulacion anulacion) {
		if (anulacion.getArticulo().getOferta() == Oferta3X2)
			this.operar(anulacion.getArticulo().getCodigoBarras(), -1);
	}

	@Override
	public void operarConCompra(Compra compra) {
		if (compra.getArticulo().getOferta() == Oferta3X2)
			this.operar(compra.getArticulo().getCodigoBarras(), +1);
	}

	@Override
	public void operarConDescuento(Descuento descuento) {
	}

	@Override
	public void operarConRepeticion(Repeticion repeticion) {
		if (repeticion.getArticulo().getOferta() == Oferta3X2)
			this.operar(repeticion.getArticulo().getCodigoBarras(), repeticion
					.getValor());
	}

	private void operar(int codBarras, int valor) {
		int actual = 0;
		if (this.articulos.containsKey(codBarras))
			actual = this.articulos.get(codBarras);
		this.articulos.put(codBarras, actual + valor);
	}

	public void añadirDescuento(Ticket ticket) {
		for (int codBarras : this.articulos.keySet()) {
			Articulo articulo = FactoriaArticulos.getFactoria().get(codBarras);
			for (int i = this.articulos.get(codBarras) / 3; i > 0; i--)
				ticket
						.add(new Descuento(articulo, articulo.getPrecio(),
								"3x2"));
		}
		this.articulos.clear();
	}
}
