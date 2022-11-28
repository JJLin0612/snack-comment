package com.example.snack_comment.exceptions;

import com.example.snack_comment.dto.Result;
import com.example.snack_comment.utils.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JJLin
 * @date 2022/11/14
 */
@Slf4j
@ControllerAdvice
public class GlobalControllerHandle {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handleException(Exception e) {
        ExceptionUtil.getMessage(e);
        return Result.error().setMessage("出现异常");
    }

    @ResponseBody
    @ExceptionHandler(value = CustomException.class)
    public Result handleCustomException(CustomException e) {
        log.error(ExceptionUtil.getMessage(e));
        return Result.error().setMessage("自定义异常");
    }
}
