package com.qr.frame.controller;

import com.qr.config.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aaaa")
@Api(tags = "swaggerBBBBBBB测试")
public class BBBBBBBBBBTokeController {


    @PostMapping("/bbb")
    @ApiOperation("bbb测试")
    public JsonResult aaa(){

        return JsonResult.okJsonResult();
    }
}
