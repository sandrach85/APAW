package es.upm.miw.pd.command;

public class OrdenConcreta1 implements Orden {
    private Receptor receptor;

    public OrdenConcreta1(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "OrdenConcreta1";
    }

    @Override
    public void ejecutar() {
        this.receptor.accion1();
    }

}
