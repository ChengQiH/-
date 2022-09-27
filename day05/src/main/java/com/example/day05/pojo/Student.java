package com.example.day05.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    /*private Integer stuClsId;*/
    private Classes cls;
    private String stuOrigin;
    private String stuAddress;
    private String stuPhone;
}
