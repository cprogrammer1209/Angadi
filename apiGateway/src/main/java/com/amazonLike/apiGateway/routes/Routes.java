package com.amazonLike.apiGateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class Routes {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange(exchange -> exchange
                        .anyExchange().permitAll()  // Allow all requests
                )
                .csrf(csrf -> csrf.disable());
        return http.build();
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // User Service Routes
                .route("user-service-route", r -> r
                        .path("/user/**")
                        .uri("lb://USERSERVICE"))
                .build();
    }

    @Bean
    public RouteLocator orderServiceRouter(RouteLocatorBuilder builder){

        return builder.routes()
                .route("order-service",r -> r
                        .path("/order/**")
                        .uri("lb://ORDERSERVICE"))
                .build();


    }
}