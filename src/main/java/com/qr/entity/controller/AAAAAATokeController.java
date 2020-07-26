package com.qr.entity.controller;

import com.qr.config.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toke")
@Api(tags = "swaggerAAAAAA测试")
public class AAAAAATokeController {


    @PostMapping("/aaa")
    @ApiOperation("aaa测试")
    public JsonResult aaa(){

        return JsonResult.okJsonResult();
    }
}
