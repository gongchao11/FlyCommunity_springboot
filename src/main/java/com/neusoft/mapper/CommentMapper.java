package com.neusoft.mapper;

import com.neusoft.domain.Comment;
import com.neusoft.response.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Mapper
@Component
public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Map<String,Object>> selectByUseridAndTopicid(int id);

    List<Map<String,Object>> selectForMessage(int id);

    List<Map<String,Object>> selectForIndexHuitie();

    List<Map<String,Object>> selectForDetail(int id);

    int getTotal(int id);

    List<Map<String,Object>> getPageInfo(PageInfo pageInfo);

    List<Map<String,Object>> getForMessege(Map<String, Object> map);

    int getTotalForMessageFenye(PageInfo pageInfo);
    List<Map<String,Object>> getDataForMessageFenye(PageInfo pageInfo);

    int getWeiduMessageCount(Map<String, Object> map);

    List<Map<String,Object>> getMessageForDelete(Map<String, Object> map);
}