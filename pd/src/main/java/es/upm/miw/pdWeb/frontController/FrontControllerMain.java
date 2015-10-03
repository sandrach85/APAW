package es.upm.miw.pdWeb.frontController;

public class FrontControllerMain {
    private FrontController frontController;

    public FrontControllerMain() {
        frontController = new FrontController();
    }

    public void helper1(){
        Request request = new Request();
        Response response = new Response();
        request.setPath("Helper1");
        frontController.doGet(request, response);        
    }
    
    public void helper1Action1(String param1) {
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("action", "action1");
        request.getParams().put("param1", param1);
        request.setPath("Helper1");
        frontController.doPost(request, response);
    }
    
    public void helper1Action2(String param2) {
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("action", "action2");
        request.getParams().put("param2", param2);
        request.setPath("Helper1");
        frontController.doPost(request, response);
    }

    public void helper2(){
        Request request = new Request();
        Response response = new Response();
        request.setPath("Helper2");
        frontController.doGet(request, response);        
    }
    
    public void helper2Action1(String param1) {
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("action", "action1");
        request.getParams().put("param1", param1);
        request.setPath("Helper2");
        frontController.doPost(request, response);
    }
    
    public void helper3(){
        Request request = new Request();
        Response response = new Response();
        request.setPath("Helper3");
        frontController.doGet(request, response);        
    }
   

    public static void main(String[] args) {
        FrontControllerMain main = new FrontControllerMain();
        System.out.println("-------ooo  Helper1  ooo------------------------------------");
        main.helper1();
        System.out.println("-------ooo  Helper1:action1  ooo----------------------------");
        main.helper1Action1("param");
        System.out.println("-------ooo  Helper1:action2  ooo----------------------------");
        main.helper1Action2("param");
        System.out.println("-------ooo  Helper2  ooo------------------------------------");
        main.helper2();
        System.out.println("-------ooo  Helper2:action1  ooo----------------------------");
        main.helper2Action1("1");
        System.out.println("-------ooo  Helper3  ooo------------------------------------");
        main.helper3();
        System.out.println("---------------------ooooo----------------------------------");
    }

}
