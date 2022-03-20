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

    @Select({"<script>",
            "SELECT * from Gyoyang",
            "order by id",
            "</script>"})
    List<TableVO> findGyoTable();

    @Select({"<script>",
            "SELECT * from Jinro",
            "order by id",
            "</script>"})
    List<TableVO> findJinroTable();

    @Select({"<script>",
            "SELECT * from BusinessAdministration",
            "order by id",
            "</script>"})
    List<TableVO> findBATable();

}
