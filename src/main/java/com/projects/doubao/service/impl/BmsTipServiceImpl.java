package com.projects.doubao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.projects.doubao.mapper.BmsTipMapper;
import com.projects.doubao.model.entity.BmsTip;
import com.projects.doubao.service.BmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BmsTipServiceImpl extends ServiceImpl<BmsTipMapper, BmsTip>
    implements BmsTipService {

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try{
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e){
            log.info("tip转化失败");
        }
        return todayTip;
    }
}
