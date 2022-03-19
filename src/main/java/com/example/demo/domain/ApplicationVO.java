package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class ApplicationVO {
    private Integer id;
    private String lectureForm;
    private String lectureName;
    private Integer lectureNumber;
    private Integer lectureSubClass;
    private String plan;
    private String classType;
    private String lectureTime;
    private String professor;
    private String step;
    private String lecturePoint;
    private String lectureType;
    private String reason;
    private String applyDate;
    private String retake;
    private String lectureLanguage;
    private Integer cancel;
}
