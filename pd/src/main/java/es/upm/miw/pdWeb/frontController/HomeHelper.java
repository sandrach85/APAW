package es.upm.miw.pdWeb.frontController;

public class HomeHelper implements Helper {

    @Override
    public String process(Model model) {
        model.put("msg", "Mensaje de HomeHelper");
        return "HomeView";
    }

}
