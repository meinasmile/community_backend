package com.projects.doubao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.projects.doubao.mapper.BmsBillboardMapper;
import com.projects.doubao.model.entity.BmsBillboard;
import com.projects.doubao.service.BmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class BmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard>
    implements BmsBillboardService {
}
