package com.neusoft.mapper;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByEmail(String email);
    User selectByEmailAndPass(User user);
    User selectByNickname(String nickname);
    User selectByActiveCode(String ActiveCode);
    User selectByWeibo(String weibo);
}