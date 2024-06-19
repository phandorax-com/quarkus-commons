package com.phandorax.exception.mapper.runtime.mapper.access;

import com.phandorax.exception.mapper.runtime.model.Error;
import io.quarkus.security.UnauthorizedException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class UnauthorizedExceptionMapper implements ExceptionMapper<UnauthorizedException> {

    @Override
    public Response toResponse(UnauthorizedException unauthorizedException) {
        return Response.
                status(Response.Status.UNAUTHORIZED).
                entity(new Error()).
                build();
    }
}