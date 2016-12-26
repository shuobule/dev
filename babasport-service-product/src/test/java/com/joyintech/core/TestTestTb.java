/*package com.joyintech.core;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.joyintech.core.dao.TestTbMapper;
import com.joyintech.core.service.TestTBServce;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={
"classpath:application-context.xml"                         
})
public class TestTestTb {

    @Autowired
    private TestTbMapper testTbMapper;
    
    @Autowired
    private TestTBServce testTBServce;
    
    //@Test
    public void testDaoAdd() throws Exception {
        TestTB testTb = new TestTB();
        testTb.setName("AK122");
        testTb.setAge(25);
        testTb.setBirthday(new Date());
        testTbMapper.insertTb(testTb);
    }
    
    //@Test
    public void testServiceAdd() throws Exception {
        TestTB testTb = new TestTB();
        testTb.setName("AK1");
        testTb.setAge(25);
        testTb.setBirthday(new Date());
        testTBServce.insertTb(testTb);
    }
}
*/