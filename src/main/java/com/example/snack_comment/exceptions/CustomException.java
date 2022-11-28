package com.example.snack_comment.exceptions;


import lombok.Data;

/**
 * @author JJLin
 * @date 2022/11/14
 */
public class CustomException extends RuntimeException{
    private String code;
    private String exceptionMessage;

    public CustomException() {}

    public CustomException(String code, String exceptionMessage) {
        this.code = code;
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "code='" + code + '\'' +
                ", exceptionMessage='" + exceptionMessage + '\'' +
                '}';
    }
}
