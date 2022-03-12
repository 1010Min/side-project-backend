package com.example.demo.persistence;
import com.example.demo.domain.TableVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TablesMapper {
    @Select({"<script>",
            "SELECT * from IT",
            "order by id",
            "</script>"})
    List<TableVO> findITTable();

}
