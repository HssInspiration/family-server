package com.hss.inspiration.exception;

import com.hss.inspiration.constants.RespEnum;
import com.hss.inspiration.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.Serializable;

/**
 * @author hss
 * @create 2021-06-12 10:34
 * @Desc
 */
@Slf4j
public class GlobalException extends RuntimeException{
    /**
     * 错误码
     */
    protected String errorCode;

    /**
     * 错误信息
     */
    protected String errorMsg;

    public GlobalException() {
        super();
    }

    public GlobalException(RespBean respBean) {
        super(respBean.getCode());
        this.errorCode = respBean.getCode();
        this.errorMsg = respBean.getMsg();
    }

    public GlobalException(RespBean respBean, Throwable cause) {
        super(respBean.getCode(), cause);
        this.errorCode = respBean.getCode();
        this.errorMsg = respBean.getMsg();
    }

    public GlobalException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public GlobalException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public GlobalException(String errorCode, String errorMsg, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public GlobalException(RespEnum respEnum){
        this.errorCode = respEnum.getCode();
        this.errorMsg = respEnum.getMsg();
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getMessage() {
        return errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
