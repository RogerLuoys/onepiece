package com.luoys.onepiece.dal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select user_name from `user` where phone = #{phone}")
    String queryByTel(@Param("phone") String phone);

}
