package th.ac.kmitl.it.community.core.exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class ExceptionResponse {
    private final Date timestamp;
    private final String message;
    private final String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
