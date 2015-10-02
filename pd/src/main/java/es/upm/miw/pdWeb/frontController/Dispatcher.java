package es.upm.miw.pdWeb.frontController;

public class Dispatcher {

    public void process(String controller, Model model) {
        String nextView;
        Helper helper;
        try {
            helper = (Helper) Class.forName("es.upm.miw.pdWeb.frontController." + controller).newInstance();
            nextView = helper.process(model);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("[INFO] No se encuentra el helper: " + controller);
            nextView = controller + "View";
        }
        View view;
        try {
            view = (View) Class.forName("es.upm.miw.pdWeb.frontController." + nextView).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("Error... " + e);
            new HomeHelper().process(model);
            view = new HomeView();
        }
        view.show(model);
    }

}
