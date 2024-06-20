package com.phandorax.transaction.id.runtime;

import io.quarkus.vertx.web.RouteFilter;
import io.vertx.ext.web.RoutingContext;
import jakarta.ws.rs.ext.Provider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.UUID;

@Provider
public class FilterTransaction  {

    @ConfigProperty(name = "quarkus.commons.transaction.header", defaultValue = "X-Transaction-Id")
    String headerName;

    @RouteFilter
    public final void filterTransaction(RoutingContext routingContext) {
        String id = routingContext.request().getHeader(headerName) == null ?
                UUID.randomUUID().toString() : routingContext.request().getHeader(headerName);
        routingContext.response().putHeader(headerName, id);
        routingContext.next();
    }
}