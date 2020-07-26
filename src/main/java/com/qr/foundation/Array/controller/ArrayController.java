package com.qr.foundation.Array.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qr.config.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/array")
@Api(tags = "基础集合测试")
public class ArrayController {


    @GetMapping("/test")
    @ApiOperation("测试")
    public JsonResult<?> ArrayTest(){

        return JsonResult.okJsonResult();
    }
}
