package es.upm.miw.pdWeb.frontController;

public class FrontController {
    private Model model;

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
        model = new Model();
    }

    public void doGet(Request request, Response response) {
        String[] helper = request.getPath().split("/");
        dispatcher.process(helper[0], model);
    }

}
