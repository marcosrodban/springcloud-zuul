package org.sanidadmadrid.cloud.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class CustomZuulFilter extends ZuulFilter{
	private static Logger LOGGER = LoggerFactory.getLogger(CustomZuulFilter.class);
	 
    private static final String FILTERTYPE = "pre";
 
    private static final Integer FILTERORDER = 1;
 
    public CustomZuulFilter(){
        //For Spring
    }
 
    @Override
    public String filterType() {
        return FILTERTYPE;
    }
 
    @Override
    public int filterOrder() {
        return FILTERORDER;
    }
 
    @Override
    public boolean shouldFilter() {
        return true;
    }
 
    @Override
    public Object run() {
        final HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        LOGGER.info("{} petición a {}", request.getMethod(), request.getRequestURL().toString());
        return null;
    }

}
