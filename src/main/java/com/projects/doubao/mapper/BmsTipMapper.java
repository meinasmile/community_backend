package com.projects.doubao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.projects.doubao.model.entity.BmsBillboard;
import com.projects.doubao.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
