package es.upm.miw.pdWeb.interceptingFilter;

import java.util.Date;

public class TimeFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        long requestTime = new Date().getTime();
        System.out.println("Time pre-process: " + new Date());
        filterChain.doFilter(request, response);
        response.getHeaders().put("t", "Time");
        System.out.println("Time post-process: " + (new Date().getTime() - requestTime) + "ms");
    }
}
