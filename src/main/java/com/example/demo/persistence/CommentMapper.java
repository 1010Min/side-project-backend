package com.example.demo.persistence;

import com.example.demo.domain.CommentVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert({"<script>",
            "INSERT INTO comment(content, board_id)",
            "VALUES(#{content}, #{board_id})",
            "</script>"})
    int insertComment(CommentVO commentVO);

    @Select({"<script>",
            "SELECT * from comment",
            "where id = #{id}",
            "</script>"})
    CommentVO findOneComment(int id);

    @Select({"<script>",
            "SELECT * from comment",
            "where board_id = #{board_id}",
            "order by id desc",
            "</script>"})
    List<CommentVO> findComment(int board_id);

    @Delete({"<script>",
            "DELETE FROM comment",
            "WHERE id = #{id}",
            "</script>"})
    int deleteComment(int id);
}
