package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class FaqVO {
    private Integer questionid;
    private String category;
    private String question;
    private String answer;
}
