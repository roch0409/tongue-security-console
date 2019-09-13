package com.km.team.tongue.security.console.dao.mybatis;

import com.km.team.tongue.security.console.beans.pojo.PushMessage;
import com.km.team.tongue.security.console.beans.pojo.PushMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMessageMapper {
    long countByExample(PushMessageExample example);

    int deleteByExample(PushMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(PushMessage record);

    int insertSelective(PushMessage record);

    List<PushMessage> selectByExample(PushMessageExample example);

    PushMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PushMessage record, @Param("example") PushMessageExample example);

    int updateByExample(@Param("record") PushMessage record, @Param("example") PushMessageExample example);

    int updateByPrimaryKeySelective(PushMessage record);

    int updateByPrimaryKey(PushMessage record);
}