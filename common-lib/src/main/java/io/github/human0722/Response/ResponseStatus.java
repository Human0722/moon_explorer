package io.github.human0722.Response;

import lombok.Data;
import lombok.Getter;

/**
 * @author xueliang
 * @date 2023-03-17 9:20
 */
@Getter
public enum ResponseStatus {

    /**
     * 请求成功
     */
    SUCCESS(200, "success"),

    /**
     * 重定向
     */
    REDIRECTION(301, "redirection"),

    /**
     * 禁止访问
     */
    FORBIDDEN(403, "forbidden"),


    /**
     * 服务器内部错误
     */
    INNER_ERROR(500, "inner_error");


    /**
     *  状态码
     */
    private Integer code;
    /**
     * 详细信息
     */
    private String msg;

    ResponseStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
