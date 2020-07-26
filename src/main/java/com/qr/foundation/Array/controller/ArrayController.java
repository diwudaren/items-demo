package com.qr.foundation.Array.controller;

import com.qr.config.JsonResult;
import com.qr.foundation.Array.service.ArrayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/array")
@Api(tags = "基础集合测试")
public class ArrayController {

    private final ArrayService arrayService;

    public ArrayController(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @GetMapping("/test")
    @ApiOperation("自定义集合Array测试")
    public JsonResult<?> arrayTest(){
        arrayService.myArrayListTest();
        return JsonResult.okJsonResult();
    }

    @GetMapping("/singleList")
    @ApiOperation("自定义单项列表singleList测试")
    public JsonResult<?> singleList(){
        arrayService.MySingleListTest();
        return JsonResult.okJsonResult();
    }
}
