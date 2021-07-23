package io.supportportal.domain;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
public class HttpResponse {
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy'T'hh:mm:ss.SSSXXX", timezone = "Europe/Berlin")
    private Date timeStamp;
    private int httpStatusCode; // 200, 201, 404, 500
    private HttpStatus httpStatus;
    private String reason;
    private String message;

    public HttpResponse(Integer httpStatusCode, HttpStatus httpStatus, String reason, String message) {
        this.timeStamp = new Date();
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }
}
