package br.com.sindeaux.houseofbooks.dtos;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ResponseDTO {

    private List<String> erros;
    private String mensagem;
    private Object data;
    private HttpStatus httpStatus;

    public ResponseDTO(List<String> erros, String mensagem, Object data, HttpStatus httpStatus) {
        this.erros = erros;
        this.mensagem = mensagem;
        this.data = data;
        this.httpStatus = httpStatus;
    }

    public ResponseDTO(String mensagem, Object data, HttpStatus httpStatus) {
        this.mensagem = mensagem;
        this.data = data;
        this.httpStatus = httpStatus;
    }

    public ResponseDTO(String mensagem, HttpStatus httpStatus) {
        this.mensagem = mensagem;
        this.httpStatus = httpStatus;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
