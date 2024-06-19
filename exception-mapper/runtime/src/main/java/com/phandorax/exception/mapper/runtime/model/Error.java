package com.phandorax.exception.mapper.runtime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Error implements Serializable {

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;
    @JsonProperty("exception_details")
    private List<ExceptionDetail> exceptionDetails;

    public Error(List<ExceptionDetail> exceptionDetails){
        this.timestamp = LocalDateTime.now();
        this.exceptionDetails = exceptionDetails;
    }

    public Error(){
        this(new ArrayList<>());
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public List<ExceptionDetail> getExceptionDetails() {
        return exceptionDetails;
    }
}