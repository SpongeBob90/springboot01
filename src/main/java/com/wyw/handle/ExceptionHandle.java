package com.wyw.handle;

import com.wyw.domain.Result;
import com.wyw.exception.GirlException;
import com.wyw.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/18.
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            return ResultUtil.faild(((GirlException) e).getCode(), e.getMessage());
        }else {
            logger.info("【系统异常】{}", e.getMessage());
            return ResultUtil.faild(103, "未知错误");
        }
    }
}
