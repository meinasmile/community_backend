package com.projects.doubao.controller;


import com.projects.doubao.common.api.ApiResult;
import com.projects.doubao.model.entity.BmsTip;
import com.projects.doubao.service.BmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController{

    @Resource
    private BmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip(){
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);

    }
}
