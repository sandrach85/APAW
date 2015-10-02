package es.upm.miw.pdWeb.frontController;

public class Helper1 implements Helper {

    @Override
    public String process(Model model) {
        model.put("msg", "Mensaje de Helper1");
        model.put("service", new BusinessService().service());
        return "Helper1View";
    }

}
