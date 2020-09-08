package com.mint.mercuryos.service;

import com.mint.mercuryos.pojo.SysConfig;

import java.util.List;

/**
 * @ClassName : ISysConfigService
 * @Description :
 * @Author : Jeanne d' Arc
 * @Date : 2020-09-05 20:45
 */
public interface ISysConfigService {

    /**
     * 查找全部
     */
    List<SysConfig> findAll();
}
