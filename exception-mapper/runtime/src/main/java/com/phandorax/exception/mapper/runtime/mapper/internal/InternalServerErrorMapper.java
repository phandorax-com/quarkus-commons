package com.phandorax.exception.mapper.runtime.mapper.internal;

import com.phandorax.exception.mapper.runtime.model.Error;
import jakarta.ws.rs.InternalServerErrorException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class InternalServerErrorMapper implements ExceptionMapper<InternalServerErrorException> {

    @Override
    public Response toResponse(InternalServerErrorException e) {
        return Response.
                status(Response.Status.INTERNAL_SERVER_ERROR).
                entity(new Error()).
                build();
    }
}