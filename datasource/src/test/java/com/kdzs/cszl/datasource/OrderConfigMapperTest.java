package com.kdzs.cszl.datasource;

import com.alibaba.fastjson.JSONObject;
import com.kdzs.cszl.datasource.domain.OrderConfigDO;
import com.kdzs.cszl.datasource.mapper.OrderConfigMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liuManDong on 2020/8/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatasourceApplication.class)
public class OrderConfigMapperTest {

    @Autowired
    private OrderConfigMapper orderConfigMapper;

    @Test
    public void testSelectById() {
        OrderConfigDO orderConfig = orderConfigMapper.selectById(1);
        System.out.println(JSONObject.toJSON(orderConfig));
    }

}