package es.upm.miw.pdWeb.frontController;

public class Dispatcher {

    public void get(Request request, Response response) {
        Model model = new Model();
        String controller = request.getPath() + "Controller";
        String nextView = request.getPath() + "View";

        switch (controller) {
        case "Helper1Controller":
            Helper1Controller helper1Controller = new Helper1Controller();
            nextView = helper1Controller.process(model);
            break;
        case "Helper2Controller":
            Helper2Controller helper2Controller = new Helper2Controller();
            nextView = helper2Controller.process(model);
            break;
        }
        this.show(nextView, model);
    }

    public void post(Request request, Response response) {
        Model model = new Model();
        String controller = request.getPath() + "Controller";
        String action = request.getParams().get("action");
        String nextView = request.getPath() + "View";

        switch (controller) {
        case "Helper1Controller":
            Helper1Controller helper1Controller = new Helper1Controller();
            if ("action1".equals(action)) {
                helper1Controller.setParam1((request.getParams().get("param1")));
                nextView = helper1Controller.action1(model);
            } else if ("action2".equals(action)) {
                helper1Controller.setParam2((request.getParams().get("param2")));
                nextView = helper1Controller.action2(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        case "Helper2Controller":
            Helper2Controller helper2Controller = new Helper2Controller();
            if ("action1".equals(action)) {
                helper2Controller.setParam1(Integer.valueOf(request.getParams().get("param1")));
                nextView = helper2Controller.action1(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        }
        this.show(nextView, model);
    }

    private void show(String nextView, Model model) {
        View view;
        switch (nextView) {
        case "Helper1View":
            view = new Helper1View();
            break;
        case "Helper2View":
            view = new Helper2View();
            break;
        case "Helper3View":
            view = new Helper3View();
            break;
        default:
            view = new ErrorView();
            model.put("error", "Vista no encontrada: " + nextView);
        }
        view.show(model);
    }

}
