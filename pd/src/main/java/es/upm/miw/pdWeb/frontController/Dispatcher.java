package es.upm.miw.pdWeb.frontController;

public class Dispatcher {

    public void process(String controller, Model model) {
        Helper helper;
        try {
            helper = (Helper) Class.forName("es.upm.miw.pdWeb.frontController." + controller).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("Error... " + e);
            helper = new HomeHelper();
        }
        String nextView = helper.process(model);
        View view;
        try {
            view = (View) Class.forName("es.upm.miw.pdWeb.frontController." + nextView).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("Error... " + e);
            view = new HomeView();
        }
        view.show(model);
    }

}
