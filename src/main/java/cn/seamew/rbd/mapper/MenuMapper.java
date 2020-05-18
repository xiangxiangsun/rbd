package cn.seamew.rbd.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {

    String selectUrlById(String menu);
}
