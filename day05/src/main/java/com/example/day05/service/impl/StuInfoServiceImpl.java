package com.example.day05.service.impl;

import com.example.day05.dao.StuInfoDao;
import com.example.day05.pojo.StuInfo;
import com.example.day05.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuInfoServiceImpl implements StuInfoService {

    @Autowired
    private StuInfoDao stuInfoDao;

    @Override
    public List<StuInfo> stuInfoAll() {
        return stuInfoDao.stuInfoAll();
    }

    @Override
    public int addStuInfo(StuInfo stuInfo) {
        return stuInfoDao.addStuInfo(stuInfo);
    }

}
