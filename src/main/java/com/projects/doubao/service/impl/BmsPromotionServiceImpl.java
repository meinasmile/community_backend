package com.projects.doubao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.projects.doubao.mapper.BmsBillboardMapper;
import com.projects.doubao.mapper.BmsPromotionMapper;
import com.projects.doubao.model.entity.BmsBillboard;
import com.projects.doubao.model.entity.BmsPromotion;
import com.projects.doubao.service.BmsBillboardService;
import com.projects.doubao.service.BmsPromotionService;
import org.springframework.stereotype.Service;

@Service
public class BmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper, BmsPromotion>
    implements BmsPromotionService {
}
