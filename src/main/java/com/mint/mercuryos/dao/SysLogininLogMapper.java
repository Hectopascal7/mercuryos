package com.mint.mercuryos.dao;

import com.mint.mercuryos.pojo.SysLogininLog;

public interface SysLogininLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLogininLog record);

    int insertSelective(SysLogininLog record);

    SysLogininLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLogininLog record);

    int updateByPrimaryKey(SysLogininLog record);
}