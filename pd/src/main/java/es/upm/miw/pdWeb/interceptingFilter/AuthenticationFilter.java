package es.upm.miw.pdWeb.interceptingFilter;

public class AuthenticationFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("Authenticating pre-process: " + request + ", " + response);
        if (!request.getPath().isEmpty()) {
            filterChain.doFilter(request, response);
        }
        response.getHeaders().put("a", "AuthenticationFilter");
        System.out.println("Authenticating post-process: " + request + ", " + response);
    }
}
