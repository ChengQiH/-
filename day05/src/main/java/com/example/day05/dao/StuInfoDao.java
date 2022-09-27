package com.example.day05.dao;

import com.example.day05.pojo.StuInfo;

import java.util.List;

public interface StuInfoDao {

    List<StuInfo> stuInfoAll();

    int addStuInfo(StuInfo stuInfo);
}
