package com.example.demo.persistence;

import com.example.demo.domain.ApplicationVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ApplicationMapper {
    @Select({
            "SELECT * from Application",
            "order by id"
    })
    List<ApplicationVO> findAppTable();

    @Delete({
            "DELETE FROM Application",
            "WHERE id = #{id}"
    })
    int deleteTable(int id);
}