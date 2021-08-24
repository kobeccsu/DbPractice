package com.leizhou.mapper;

import com.leizhou.dto.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {
    List<Users> selectAll();

    Users selectOne(@Param("id") int id);
}
