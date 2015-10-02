package es.upm.miw.pdWeb.frontController;

public class Dispatcher {

    public void process(Request request, Response response) {
        Model model= new Model();
        String controller = request.getPath().split("/")[0];
        String nextView;
        
        switch (controller) {
        case "Helper1":
            Helper1 helper1 = new Helper1();
            helper1.setValue(Integer.parseInt(request.getParams().get("value")));
            nextView = helper1.process(model);
            break;
        case "HomeHelper":
            HomeHelper homeHelper = new HomeHelper();
            nextView = homeHelper.process(model);
            break;
        default:
            nextView = controller + "View";
        }

        View view;
        switch (nextView) {
        case "Helper1View":
            view = new Helper1View();
            break;
        case "Helper2View":
            view = new Helper2View();
            break;
        default:
            view = new HomeView();
        }
        view.show(model);
    }

}
