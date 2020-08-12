package com.kdzs.cszl.datasource.mapper;

import com.kdzs.cszl.datasource.domain.OrderConfigDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderConfigMapper {

    OrderConfigDO selectById(@Param("id") Integer id);

}
