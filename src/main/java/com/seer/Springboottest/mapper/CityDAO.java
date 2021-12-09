package com.seer.Springboottest.mapper;

import com.seer.Springboottest.model.City;
import lombok.experimental.PackagePrivate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Mapper
public interface CityDAO{

     @Select("SELECT * FROM CITY WHERE id = #{id}")
     City findById(@Param("id") Integer id);

}