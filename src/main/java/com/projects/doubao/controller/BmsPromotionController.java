package com.projects.doubao.controller;


import com.projects.doubao.common.api.ApiResult;
import com.projects.doubao.model.entity.BmsPromotion;
import com.projects.doubao.model.entity.BmsTip;
import com.projects.doubao.service.BmsPromotionService;
import com.projects.doubao.service.BmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/promotion")
public class BmsPromotionController extends BaseController{

    @Resource
    private BmsPromotionService bmsPromotionService;

    @GetMapping("/all")
    public ApiResult<List<BmsPromotion>> getPromotion(){
        List<BmsPromotion> list = bmsPromotionService.list();
        return ApiResult.success(list);
    }
}
