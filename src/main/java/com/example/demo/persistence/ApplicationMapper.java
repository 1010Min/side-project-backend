package com.example.demo.persistence;

import com.example.demo.domain.ApplicationVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ApplicationMapper {
    @Select({
            "SELECT * from Application",
            "order by id"
    })
    List<ApplicationVO> findAppTable();
}