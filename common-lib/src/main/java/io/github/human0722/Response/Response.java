package io.github.human0722.Response;

import lombok.Data;

/**
 * @author xueliang
 * @description 响应类
 * @date 2023-03-16 17:58
 */
@Data
public class Response<T> {

    private Integer code;
    private String message;
    private T data;

    Response() { }
    Response(Integer code,T data) {
        this.code = code;
        this.data = data;
    }
    Response(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }


    public static<T> Response<T> success(T data) {
        return new Response(ResponseStatus.SUCCESS.getCode(), data);
    }

    public static<T> Response<T> success(T data, String message) {

        return new Response(ResponseStatus.SUCCESS.getCode(), data, message);
    }

}
