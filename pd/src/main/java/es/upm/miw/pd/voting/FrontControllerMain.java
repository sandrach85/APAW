package es.upm.miw.pd.voting;

import es.upm.miw.pd.voting.solution.business.models.daos.DaoFactory;
import es.upm.miw.pd.voting.solution.business.models.daos.memory.DaoFactoryMemory;
import es.upm.miw.pd.voting.solution.presentation.frontController.FrontController;
import es.upm.miw.pd.voting.solution.presentation.frontController.Request;
import es.upm.miw.pd.voting.solution.presentation.frontController.Response;

public class FrontControllerMain {
    private FrontController frontController;

    public FrontControllerMain() {
        frontController = new FrontController();
    }

    public void requestVerTemas() {
        Request request = new Request();
        Response response = new Response();
        request.setPath("Themes");
        frontController.doGet(request, response);
    }

    public void requestCrearTema(String theme) {
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("theme", theme);
        request.setPath("Themes");
        frontController.doPost(request, response);
    }

    public void requestVotarTema(String theme, int value) {
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("value", "" + value);
        request.getParams().put("theme", theme);
        request.setPath("Themes/vote");
        frontController.doPost(request, response);
    }

    public static void main(String[] args) {
        DaoFactory.setFactory(new DaoFactoryMemory());
        FrontControllerMain main = new FrontControllerMain();
        System.out.println("-------ooo Ver temas ooo----------------------------");
        main.requestVerTemas();
        System.out.println("-------ooo Crear Temas ooo----------------------------");
        main.requestCrearTema("Tema 1");
        main.requestCrearTema("Tema 2");
        System.out.println("-------ooo Votar Temas ooo----------------------------");
        main.requestVotarTema("Tema 1", 2);
        main.requestVotarTema("Tema 1", 5);
        main.requestVotarTema("Tema 1", 2);
        main.requestVotarTema("Tema 2", 2);
        System.out.println("---------------------ooooo----------------------------");
    }

}
