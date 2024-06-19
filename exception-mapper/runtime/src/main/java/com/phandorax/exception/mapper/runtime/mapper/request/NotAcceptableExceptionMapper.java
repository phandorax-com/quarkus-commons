package com.phandorax.exception.mapper.runtime.mapper.request;

import com.phandorax.exception.mapper.runtime.model.Error;
import jakarta.ws.rs.NotAcceptableException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotAcceptableExceptionMapper implements ExceptionMapper<NotAcceptableException> {

    @Override
    public Response toResponse(NotAcceptableException notAcceptableException) {
        return Response.
                status(Response.Status.NOT_ACCEPTABLE).
                entity(new Error()).
                build();
    }
}