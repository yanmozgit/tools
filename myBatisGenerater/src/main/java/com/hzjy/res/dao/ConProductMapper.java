package com.hzjy.res.dao;

import com.hzjy.res.entity.ConProduct;
import java.math.BigDecimal;

public interface ConProductMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ConProduct record);

    int insertSelective(ConProduct record);

    ConProduct selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ConProduct record);

    int updateByPrimaryKey(ConProduct record);
}