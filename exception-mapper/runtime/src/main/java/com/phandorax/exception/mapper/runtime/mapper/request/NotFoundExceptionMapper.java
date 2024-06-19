package com.phandorax.exception.mapper.runtime.mapper.request;

import com.phandorax.exception.mapper.runtime.model.Error;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException e) {
        return Response.
                status(Response.Status.NOT_FOUND).
                entity(new Error()).
                build();
    }
}