package com.wyw;

import com.wyw.domain.Girl;
import com.wyw.repository.GirlRepository;
import com.wyw.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/4/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOne(){
        Girl girl = girlService.findOne(5);
        Assert.assertEquals(new Integer(11), new Integer(girl.getAge()));
    }
}
