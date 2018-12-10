package com.lf.oa.service.impl;

import com.lf.oa.dao.TestDao;
import com.lf.oa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public String getStr() {
        return testDao.getStr();
    }
}
