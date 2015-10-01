package es.upm.miw.pdWeb.interceptingFilter;

public interface Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain);
}
