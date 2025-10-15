package com.noelmathen.taskmanager.domain.dto;

public record ErrorResponse(
    int status,
    String message,
    String details
) {

}
