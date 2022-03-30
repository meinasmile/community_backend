package com.projects.doubao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.doubao.model.dto.LoginDTO;
import com.projects.doubao.model.dto.RegisterDTO;
import com.projects.doubao.model.entity.UmsUser;

public interface IUmsUserService extends IService<UmsUser> {
    /**
     * register function
     *
     * @param dto
     * @return register object
     */

    UmsUser executeRegister(RegisterDTO dto);
    String executeLogin(LoginDTO dto);
    UmsUser getUserByUsername(String name);
}
