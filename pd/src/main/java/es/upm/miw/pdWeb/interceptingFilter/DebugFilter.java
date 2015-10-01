package es.upm.miw.pdWeb.interceptingFilter;

public class DebugFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("Debuging pre-process: " + request + "," + response);
        filterChain.doFilter(request, response);
        response.addValue("DebugFilter");
        System.out.println("Debuging post-process: " + request + "," + response);
    }
}
