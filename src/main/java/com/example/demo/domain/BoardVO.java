package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class BoardVO {
    private Integer questionid;
    private String id;
    private String password;
    private String title;
    private String contents;
}
