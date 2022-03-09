package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class TableVO {
    private Integer id;
    private String 강의형태;
    private String 강의명;
    private String lectureNum;
    private String lectureClass;
    private String plan;
    private String lectureCheck;
    private String lectureTime;
    private String professor;
    private String step;
    private String lecturePoint;
    private String lecturePeople;
    private String application;
    private String seat;
    private String lectureType;
    private String language;
    private String withComp;
    private String lectureCerf;
    private String lectureWarn;
    private String snowboard;
    private String dept;
    private String pf;
    private String schoolExchange;
    private String difficulty;
    private String specification1;
    private String specification2;
    private String specification3;
}
