package com.example.demo.persistence;

import com.example.demo.domain.FaqVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FAQMapper {
    @Select({
            "SELECT * from FAQ",
            "order by questionid desc"})
    List<FaqVO> findAll();
}
