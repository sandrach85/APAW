package es.upm.miw.pdWeb.interceptingFilter;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new TimeFilter());
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        Request request = new Request();
        request.setPath("demo");
        client.sendRequest(request, new Response());
    }
}
