package es.upm.miw.pdWeb.frontController;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void doGet(Request request, Response response) {
        dispatcher.get(request, response);
    }
    
    public void doPost(Request request, Response response) {
        dispatcher.post(request, response);
    }

}
