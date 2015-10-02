package es.upm.miw.pdWeb.frontController;

public class Helper1 implements Helper {

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String process(Model model) {
        model.put("msg", "Mensaje de Helper1, con value=" + value);
        model.put("service", new BusinessService().service());
        return "Helper1View";
    }

}
