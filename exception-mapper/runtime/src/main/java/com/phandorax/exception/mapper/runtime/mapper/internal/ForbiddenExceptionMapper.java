package com.phandorax.exception.mapper.runtime.mapper.internal;

import com.phandorax.exception.mapper.runtime.model.Error;
import jakarta.ws.rs.ForbiddenException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ForbiddenExceptionMapper implements ExceptionMapper<ForbiddenException> {

    @Override
    public Response toResponse(ForbiddenException e) {
        return Response.
                status(Response.Status.FORBIDDEN).
                entity(new Error()).
                build();
    }
}