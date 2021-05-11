package com.hxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxy.domain.Guest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GuestMapper extends BaseMapper<Guest> {
}
