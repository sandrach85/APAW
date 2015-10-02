package es.upm.miw.pdWeb.frontController;

public class Helper2View implements View {

    @Override
    public void show(Model model) {
        System.out.println("Helper2 \n   msg: estático, no tiene helper");
    }

}
