package com.mint.mercuryos.controller;

import com.mint.mercuryos.pojo.SysConfig;
import com.mint.mercuryos.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : SysConfigController
 * @Description :
 * @Author : Jeanne d' Arc
 * @Date : 2020-09-05 20:51
 */
@RestController
@RequestMapping("config")
public class SysConfigController {

    @Autowired
    ISysConfigService iSysConfigService;

    @GetMapping(value = "/findAll")
    public List<SysConfig> findAll() {
        return iSysConfigService.findAll();
    }
}
