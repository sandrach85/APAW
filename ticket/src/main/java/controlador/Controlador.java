package controlador;

import impresora.Impresora;
import impresora.ImpresoraIO;
import impresora.Mayores60;
import ticket.Anulacion;
import ticket.Compra;
import ticket.FactoriaArticulos;
import ticket.Repeticion;
import ticket.Ticket;
import upm.jbb.IO;

public class Controlador {
	private int t = 1;
	private Ticket ticket = new Ticket(this.t++);

	public void nuevaCompra() {
		this.ticket = new Ticket(this.t++);
	}

	public void comprar() {
		this.ticket.add(new Compra(FactoriaArticulos.getFactoria().get(
				IO.getIO().readInt("C�digo de barras"))));
	}

	public void repetir() {
		String[] clases = { "Integer", "Integer" };
		String[] msgs = { "C�digo de barras", "Num. de articulos" };
		Object[] r = IO.getIO().readForm(clases, msgs);
		this.ticket.add(new Repeticion(FactoriaArticulos.getFactoria().get(
				(Integer) r[0]), (Integer) r[1]));
	}

	public void anular() {
		this.ticket.add(new Anulacion(FactoriaArticulos.getFactoria().get(
				IO.getIO().readInt("C�digo de barras"))));
	}

	public void finalizar() {
		this.ticket.finalizar();
		IO.getIO().clear();
		this.ticket.imprimir();
		this.nuevaCompra();
	}

	public void activarMayor60() {
		Impresora.setImpresoraActiva(new Mayores60(new ImpresoraIO()));
	}

	public void desactivarMayor60() {
		Impresora.setImpresoraActiva(new ImpresoraIO());
	}

}
