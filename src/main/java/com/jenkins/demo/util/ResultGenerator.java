package com.jenkins.demo.util;

import com.jenkins.demo.enums.ResultCode;
import com.jenkins.demo.model.Result;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:38
 */
public class ResultGenerator {

    public static Result success() {
        return success(null);
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result error(ResultCode resultCode) {
        Result result = new Result();
        result.setCode(resultCode.getCode());
        result.setMsg(resultCode.getMsg());
        result.setData(null);
        return  result;
    }
}
