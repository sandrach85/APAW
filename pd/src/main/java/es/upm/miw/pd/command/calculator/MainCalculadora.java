package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.solution.ComandoImprimir;
import es.upm.miw.pd.command.calculator.solution.ComandoIniciar;
import es.upm.miw.pd.command.calculator.solution.ComandoRestar;
import es.upm.miw.pd.command.calculator.solution.ComandoSumar;
import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        Calculadora calc = new Calculadora();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
    }

    public void ejecutar() {
        String key = (String) IO.getIO().select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculadora());
    }
}
