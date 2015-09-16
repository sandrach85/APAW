package ticket;

import impresora.Impresora;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import operaciones.Imprimir;
import operaciones.Oferta3x2;
import operaciones.Operacion;
import operaciones.PrecioTotal;

public class Ticket {
	private int codigo;
	private Date fecha;
	private List<Linea> lineas;
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Ticket(int codigo) {
		this.codigo = codigo;
		this.fecha = new Date();
		this.lineas = new ArrayList<Linea>();
	}

	public int getCodigo() {
		return codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void add(Linea linea) {
		this.lineas.add(linea);
	}

	public void finalizar() {
		Oferta3x2 oferta3x2 = new Oferta3x2();
		for (Linea linea : this.lineas) {
			linea.aceptar(oferta3x2);
		}
		oferta3x2.añadirDescuento(this);

		PrecioTotal suma = new PrecioTotal();
		for (Linea linea : this.lineas) {
			linea.aceptar(suma);
		}
		this.total = suma.getTotal();
	}

	public void imprimir() {
		Impresora impresora = Impresora.getImpresoraActiva();
		impresora.println(this.fecha.toString());
		impresora.println("Ticket: " + this.getCodigo());
		impresora.println("");
		Operacion imprimir = new Imprimir();
		for (Linea linea : this.lineas) {
			linea.aceptar(imprimir);
		}
		impresora.println("");
		impresora.println("Total....." + this.total);
		impresora.println("");
		impresora.println("Gracias por su visita");
	}

}