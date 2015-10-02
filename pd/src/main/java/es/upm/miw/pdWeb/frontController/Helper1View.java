package es.upm.miw.pdWeb.frontController;

public class Helper1View implements View {

    @Override
    public void show(Model model) {
        System.out.println("Helper1 \n   msg: " + model.get("msg"));
    }

}
