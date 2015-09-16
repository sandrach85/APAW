package impresora;

public abstract class Decorador extends Impresora {
	private Impresora impresora;

	public Decorador(Impresora impresora) {
		this.impresora = impresora;
	}

	public Impresora getImpresora() {
		return impresora;
	}

}
