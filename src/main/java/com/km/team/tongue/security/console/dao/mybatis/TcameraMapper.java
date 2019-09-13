package com.km.team.tongue.security.console.dao.mybatis;

import com.km.team.tongue.security.console.beans.pojo.Tcamera;
import com.km.team.tongue.security.console.beans.pojo.TcameraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcameraMapper {
    long countByExample(TcameraExample example);

    int deleteByExample(TcameraExample example);

    int deleteByPrimaryKey(String camId);

    int insert(Tcamera record);

    int insertSelective(Tcamera record);

    List<Tcamera> selectByExample(TcameraExample example);

    Tcamera selectByPrimaryKey(String camId);

    int updateByExampleSelective(@Param("record") Tcamera record, @Param("example") TcameraExample example);

    int updateByExample(@Param("record") Tcamera record, @Param("example") TcameraExample example);

    int updateByPrimaryKeySelective(Tcamera record);

    int updateByPrimaryKey(Tcamera record);
}