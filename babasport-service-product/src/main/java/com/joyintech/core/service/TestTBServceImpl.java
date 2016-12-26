package com.joyintech.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joyintech.core.TestTB;
import com.joyintech.core.dao.TestTbMapper;


@Service
public class TestTBServceImpl implements TestTBServce{

    @Autowired
    private TestTbMapper testTbMapper;
    
    @Override
    public Integer insertTb(TestTB model) {
        return testTbMapper.insertTb(model);
    }

}
