package es.upm.miw.pdWeb.frontController;

public class FrontControllerMain {

    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        FrontController frontController = new FrontController();
        request.setPath("Helper1");
        frontController.doGet(request, response);
        System.out.println("-------ooooo-------");
        request.setPath("Helper2");
        frontController.doGet(request, response);
    }

}
