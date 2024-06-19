package com.phandorax.exception.mapper.runtime.mapper.request;

import com.phandorax.exception.mapper.runtime.model.Error;
import jakarta.el.MethodNotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class MethodNotAllowedExceptionMapper implements ExceptionMapper<MethodNotFoundException> {

    @Override
    public Response toResponse(MethodNotFoundException methodNotFoundException) {
        return Response.
                status(Response.Status.METHOD_NOT_ALLOWED).
                entity(new Error()).
                build();
    }
}