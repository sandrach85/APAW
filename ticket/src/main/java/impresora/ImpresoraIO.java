package impresora;

import upm.jbb.IO;

public class ImpresoraIO extends Impresora {

	@Override
	public void println(String string) {
		IO.getIO().println(string);
	}

}
