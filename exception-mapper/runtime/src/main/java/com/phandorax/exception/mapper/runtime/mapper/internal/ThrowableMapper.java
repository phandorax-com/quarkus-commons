package com.phandorax.exception.mapper.runtime.mapper.internal;

import com.phandorax.exception.mapper.runtime.model.Error;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ThrowableMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        return Response.
                status(Response.Status.INTERNAL_SERVER_ERROR).
                entity(new Error()).
                build();
    }
}