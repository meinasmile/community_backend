package com.projects.doubao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.doubao.model.entity.BmsBillboard;
import com.projects.doubao.model.entity.BmsTip;

public interface BmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
