package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class TableVO {
    private Integer id;
    private String lectureForm;
    private String lectureName;
    private Integer lectureNumber;
    private Integer lectureSubClass;
    private String plan;
    private String movie;
    private String classType;
    private String lectureTime;
    private String professor;
    private String step;
    private String lecturePoint;
    private Integer lecturePeople;
    private Integer lectureApply;
    private String lectureSeat;
    private String lectureType;
    private String lectureLanguage;
    private String withComp;
    private String lectureClassfi;
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
