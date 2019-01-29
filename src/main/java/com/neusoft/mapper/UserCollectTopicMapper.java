package com.neusoft.mapper;

import com.neusoft.domain.UserCollectTopic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Mapper
@Component
public interface UserCollectTopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCollectTopic record);

    int insertSelective(UserCollectTopic record);

    UserCollectTopic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCollectTopic record);

    int updateByPrimaryKey(UserCollectTopic record);

    List<Map<String,Object>> selectByUseridAndTopicid(Integer id);

    int deleteByUserIdAndTopicId(Map<String, Object> map);

    Map<String,Object> selectForCollect(Map<String, Object> map);
}