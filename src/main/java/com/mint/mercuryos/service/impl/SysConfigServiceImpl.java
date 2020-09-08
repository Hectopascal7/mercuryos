package com.mint.mercuryos.service.impl;

import com.mint.mercuryos.dao.SysConfigMapper;
import com.mint.mercuryos.pojo.SysConfig;
import com.mint.mercuryos.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : SysConfigServiceImpl
 * @Description :
 * @Author : Jeanne d' Arc
 * @Date : 2020-09-05 20:49
 */
@Service
public class SysConfigServiceImpl implements ISysConfigService {

    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Override
    public List<SysConfig> findAll() {
        return sysConfigMapper.findAll();
    }
}
