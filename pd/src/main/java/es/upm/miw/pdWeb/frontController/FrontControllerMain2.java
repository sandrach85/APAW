package es.upm.miw.pdWeb.frontController;

public class FrontControllerMain2 {
    private FrontController frontController;

    public FrontControllerMain2() {
        frontController = new FrontController();
    }

    public void request1() {
        Request request = new Request();
        request.getParams().put("value", "5");
        Response response = new Response();
        request.setPath("Helper1");
        frontController.doGet(request, response);
    }

    public void request2() {
        Request request = new Request();
        Response response = new Response();
        request.setPath("Helper2");
        frontController.doGet(request, response);
    }

    public static void main(String[] args) {
        FrontControllerMain2 main = new FrontControllerMain2();
        main.request1();
        System.out.println("-------ooooo-------");
        main.request2();
        System.out.println("-------ooooo-------");
    }

}
