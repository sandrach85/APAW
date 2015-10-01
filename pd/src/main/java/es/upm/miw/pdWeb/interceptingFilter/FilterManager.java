package es.upm.miw.pdWeb.interceptingFilter;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain(target);
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(Request request, Response response) {
        filterChain.doFilter(request, response);
    }
}
