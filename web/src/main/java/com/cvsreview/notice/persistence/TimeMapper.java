package com.cvsreview.notice.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by ranian129@gmail.com on 2019-03-14
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Mapper
@Repository
public interface TimeMapper {

    @Select("select CURRENT_DATE")
    public String getTime();

    public String getTimeXML();
}
