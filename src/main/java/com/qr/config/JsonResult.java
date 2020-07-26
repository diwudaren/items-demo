package com.qr.config;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.exception.ExceptionUtils;

public class JsonResult<T> {


    public static final String ERROR = "error";
    public static final String OK = "ok";
    public static final String NEED_LOGIN = "needLogin";
    public static final String PERMISSION_DENY = "permissionDeny";



    private String status;
    private String message;

    private String debugInfo;

    private T data;


    public String getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }


    public static <T> JsonResult<T> okJsonResultWithData(T data) {
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult<?> okJsonResult() {
        return okJsonResultWithMsg("");
    }

    public static JsonResult<?> okJsonResultWithMsg(String message) {
        JsonResult<?> jsonResult = new JsonResult<>();
        jsonResult.setMessage(message);
        return jsonResult;
    }



    public static JsonResult<?> failJsonResult(String message) {
        JsonResult<?> jsonResult = new JsonResult<>();
        jsonResult.setStatus(ERROR);
        jsonResult.setMessage(message);
        return jsonResult;
    }
    public static JsonResult<?> failJsonResult(Throwable wrapped) {

        String msg = "";

        if (wrapped != null) {
            msg = wrapped.getMessage();
        }

        JsonResult<?> jsonResult = failJsonResult(msg);
        jsonResult.setDebugInfo(ExceptionUtils.getStackTrace(wrapped));
        return jsonResult;
    }


    public static <T> JsonResult<T> failJsonResultWithData(T data) {
        JsonResult<T> jsonResult = new JsonResult<T>();
        jsonResult.setStatus(ERROR);
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult<?> needLoginJsonResult() {
        JsonResult<?> jsonResult = new JsonResult<>();
        jsonResult.setStatus(NEED_LOGIN);
        jsonResult.setMessage("need login!");
        return jsonResult;
    }

    public static JsonResult<?> permissionDeny(){
        JsonResult<?> jsonResult = new JsonResult<>();
        jsonResult.setStatus(PERMISSION_DENY);
        jsonResult.setMessage("permission deny!");
        return jsonResult;
    }

    public String toJSONString() {
       return JSONObject.toJSONString(this);
    }


    public JsonResult() {
        this.setStatus(OK);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
