package com.phandorax.exception.mapper.deployment;

import com.phandorax.exception.mapper.runtime.mapper.access.UnauthorizedExceptionMapper;
import com.phandorax.exception.mapper.runtime.mapper.internal.ForbiddenExceptionMapper;
import com.phandorax.exception.mapper.runtime.mapper.request.ConstraintViolationExceptionMapper;
import com.phandorax.exception.mapper.runtime.mapper.internal.InternalServerErrorMapper;
import com.phandorax.exception.mapper.runtime.mapper.internal.ThrowableMapper;
import com.phandorax.exception.mapper.runtime.mapper.request.MethodNotAllowedExceptionMapper;
import com.phandorax.exception.mapper.runtime.mapper.request.NotAcceptableExceptionMapper;
import com.phandorax.exception.mapper.runtime.mapper.request.NotFoundExceptionMapper;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.resteasy.reactive.spi.ExceptionMapperBuildItem;
import io.quarkus.security.UnauthorizedException;
import jakarta.el.MethodNotFoundException;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.*;

class ExceptionMapperProcessor {

    private static final String FEATURE = "exception-mapper";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    ExceptionMapperBuildItem unauthorizedExceptionMapper() {
        return new ExceptionMapperBuildItem(UnauthorizedExceptionMapper.class.getName(),
                UnauthorizedException.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem forbiddenExceptionMapper() {
        return new ExceptionMapperBuildItem(ForbiddenExceptionMapper.class.getName(),
                ForbiddenException.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem internalServerErrorMapper() {
        return new ExceptionMapperBuildItem(InternalServerErrorMapper.class.getName(),
                InternalServerErrorException.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem exception() {
        return new ExceptionMapperBuildItem(ThrowableMapper.class.getName(),
                Exception.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem constraintViolationExceptionMapper() {
        return new ExceptionMapperBuildItem(ConstraintViolationExceptionMapper.class.getName(),
                ConstraintViolationException.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem methodNotAllowedExceptionMapper() {
        return new ExceptionMapperBuildItem(MethodNotAllowedExceptionMapper.class.getName(),
                MethodNotFoundException.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem notAcceptableExceptionMapper() {
        return new ExceptionMapperBuildItem(NotAcceptableExceptionMapper.class.getName(),
                NotAcceptableException.class.getName(), Priorities.USER + 100, false);
    }

    @BuildStep
    ExceptionMapperBuildItem notFoundExceptionMapper() {
        return new ExceptionMapperBuildItem(NotFoundExceptionMapper.class.getName(),
                NotFoundException.class.getName(), Priorities.USER + 100, false);
    }
}