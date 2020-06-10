package com.greedystar.configclient.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Author GreedyStar
 * Date   2020-6-10
 */
@RefreshScope
@Component
public class RouteProperty {
    @Value("#{${routes}}")
    private Map<String, String> routes = new HashMap<>();

    public Map<String, String> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<String, String> routes) {
        this.routes = routes;
    }
}
