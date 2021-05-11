package com.hxy.dao;

import com.hxy.domain.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GuestDao {
    @Select("select * from guest")
    List<Guest> reList();
}
