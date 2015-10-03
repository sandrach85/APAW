package es.upm.miw.pdWeb.frontController;

public class Helper1View implements View {

    @Override
    public void show(Model model) {
        System.out.println("Helper1View \n   msg: " + model.get("msg"));
    }

}
