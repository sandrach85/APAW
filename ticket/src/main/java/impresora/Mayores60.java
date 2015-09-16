package impresora;

public class Mayores60 extends Decorador {

	public Mayores60(Impresora impresora) {
		super(impresora);
	}

	@Override
	public void println(String string) {
		this.getImpresora().println("---------------------");
		this.getImpresora().println(string);
	}

}
