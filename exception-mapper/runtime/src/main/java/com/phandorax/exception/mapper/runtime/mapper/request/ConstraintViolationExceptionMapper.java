package com.phandorax.exception.mapper.runtime.mapper.request;

import com.phandorax.exception.mapper.runtime.model.Error;
import com.phandorax.exception.mapper.runtime.model.ExceptionDetail;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.List;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException e) {
        List<ExceptionDetail> errorMessages = e.getConstraintViolations().stream()
                .map(constraintViolation -> new ExceptionDetail(
                        constraintViolation.getPropertyPath().toString(),
                        constraintViolation.getMessage(),
                        constraintViolation.getInvalidValue().toString()))
                .toList();
        return Response.
                status(Response.Status.BAD_REQUEST).
                entity(new Error(errorMessages)).
                build();
    }
}