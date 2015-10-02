package es.upm.miw.pdWeb.frontController;

public class FrontControllerMain {

    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        request.setPath("Helper1");
        new FrontController().doGet(request, response);
    }

}
