package com.greedystar.configclient.common;

import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author GreedyStar
 * Date   2020-06-10
 */
public class CustomRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {
    private RouteProperty routeProperty;

    public CustomRouteLocator(String servletPath, ZuulProperties properties, RouteProperty routeProperty) {
        super(servletPath, properties);
        this.routeProperty = routeProperty;
    }

    @Override
    protected Map<String, ZuulProperties.ZuulRoute> locateRoutes() {
        LinkedHashMap<String, ZuulProperties.ZuulRoute> routesMap = new LinkedHashMap();
        routesMap.putAll(super.locateRoutes());
        for (Map.Entry<String, String> entry : routeProperty.getRoutes().entrySet()) {
            routesMap.put(entry.getValue(), new ZuulProperties.ZuulRoute(entry.getKey(), entry.getValue(), entry.getKey(), null, true
                    , true, null));
        }
        return routesMap;
    }

    @Override
    public void refresh() {
        doRefresh();
    }
}
