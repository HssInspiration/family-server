package com.hss.inspiration.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 响应枚举
 *
 * @author hss
 * @create 2021-05-04 14:36
 * @Desc 响应枚举
 */
@AllArgsConstructor
@ToString
@Getter
public enum RespEnum {
    SUCCESS("0", "Success"),
    ERROR("-1", "Error"),
    BODY_NOT_MATCH("400", "请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("401", "鉴权失败!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    DATA_CANNOT_BE_NULL("1001000", "数据不能为空"),
    INSERT_FAILED("1001001", "新增失败，请重试！"),
    SERVER_BUSY("503", "服务器正忙，请稍后再试!");
    private final String code;
    private final String msg;


}
