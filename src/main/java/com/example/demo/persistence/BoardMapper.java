package com.example.demo.persistence;

import com.example.demo.domain.BoardVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Insert({"<script>",
            "INSERT INTO board(id,password,title,contents)",
            "VALUES(#{id}, #{password}, #{title}, #{contents})",
            "</script>"})
    int insertBoard(BoardVO boardVO);

    @Select({"<script>",
            "SELECT * from board",
            "where questionid = #{questionid}",
            "</script>"})
    BoardVO findOneBoard(int questionid);

    @Select({"<script>",
            "SELECT * from board",
            "order by id desc",
            "</script>"})
    List<BoardVO> findBoard();

    @Select({"<script>",
            "SELECT count(*) from board",
            "</script>"})
    Integer countBoard();

    @Delete({"<script>",
            "DELETE FROM board",
            "WHERE questionid = #{questionid}",
            "</script>"})
    int deleteBoard(int questionid);
}
