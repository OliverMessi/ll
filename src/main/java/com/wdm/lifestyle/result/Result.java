package com.wdm.lifestyle.result;

/**
 * @author wdm
 * @create 2020-06-30 19:43
 **/
public class Result {
    //响应码
    private int code;

    public Result(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}