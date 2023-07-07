package br.com.springboottest.ProjectSpringBootTest.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date timestamp;
    private String messagem;
    private String details;

    public ExceptionResponse(Date timestamp, String messagem, String details) {
        this.timestamp = timestamp;
        this.messagem = messagem;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessagem() {
        return messagem;
    }

    public String getDetails() {
        return details;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
