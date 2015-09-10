package es.upm.miw.pd.memento;

import upm.jbb.IO;

public final class MainMemento {
    private GestorMementos<Memento> gm;

    private Mementable<Memento> o;

    private MainMemento() {
        this.gm = new GestorMementos<Memento>();
        this.o = new Originador(666);
        IO.in.addModel(this.o);
        IO.in.addController(this);
    }

    public void createMemento() {
        this.gm.addMemento(IO.in.readString("Nombre del Memento"), o.createMemento());
    }

    public void restoreMemento() {
        this.o.restoreMemento(this.gm.getMemento((String) IO.in.select(gm.keys(), "Restaurar")));
    }

    public static void main(String[] args) {
        new MainMemento();
    }

}
