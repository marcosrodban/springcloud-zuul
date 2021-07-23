package org.sanidadmadrid.cloud.zuul.config;

import org.sanidadmadrid.cloud.zuul.filters.CustomZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;

@Configuration
public class ZuulConfiguration {
	

    public ZuulConfiguration(){
        //For Spring
    }
 
    @Bean
    public ZuulFilter buildZuulFilter(){
        return new CustomZuulFilter();
    }

}
