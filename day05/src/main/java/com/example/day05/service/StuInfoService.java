package com.example.day05.service;

import com.example.day05.pojo.StuInfo;

import java.util.List;

public interface StuInfoService {

    List<StuInfo> stuInfoAll();

    int addStuInfo(StuInfo stuInfo);
}
