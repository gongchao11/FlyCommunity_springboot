package com.neusoft.mapper;

import com.neusoft.domain.Topic;
import com.neusoft.response.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Mapper
@Component
public interface TopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKeyWithBLOBs(Topic record);

    int updateByPrimaryKey(Topic record);

    List<Map<String,Object>> selectByUserID(int id);

    List<Map<String,Object>> selectForIndex();

    List<Topic> selectForReyi();

    List<Map<String,Object>> selectForPage();

    List<Map<String,Object>> selectForZhiding();

    Map<String,Object> selectByTopicID(int id);

    List<Map<String,Object>> selectForFenye(PageInfo pageInfo);

    int getTotalCount(PageInfo pageInfo);


}