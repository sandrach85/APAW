package es.upm.miw.pdWeb.frontController;

public class ErrorView implements View {

    @Override
    public void show(Model model) {
        System.out.println("ErrorView \n   msg: error");
    }

}
