package com.example.demo.persistence;

import com.example.demo.domain.BoardVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    @Insert({"<script>",
            "INSERT INTO board(id,password,title,contents)",
            "VALUES(#{id}, #{password}, #{title}, #{contents})",
            "</script>"})
    int insertBoard(BoardVO boardVO);
}
