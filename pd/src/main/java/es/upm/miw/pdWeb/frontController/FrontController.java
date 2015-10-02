package es.upm.miw.pdWeb.frontController;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void doGet(Request request, Response response) {
        dispatcher.process(request, response);
    }

}
