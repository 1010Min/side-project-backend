package com.example.demo.persistence;
import com.example.demo.domain.TableVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TableMapper {
    @Select({"<script>",
            "SELECT * from table",
            "order by id desc",
            "</script>"})
    List<TableVO> findTable();

}
