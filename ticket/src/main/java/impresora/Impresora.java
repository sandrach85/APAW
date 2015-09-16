package impresora;

public abstract class Impresora {

	private static Impresora impresoraActiva = new ImpresoraIO();

	public static Impresora getImpresoraActiva() {
		return impresoraActiva;
	}

	public static void setImpresoraActiva(Impresora impresora) {
		impresoraActiva = impresora;
	}

	public abstract void println(String string);

}
