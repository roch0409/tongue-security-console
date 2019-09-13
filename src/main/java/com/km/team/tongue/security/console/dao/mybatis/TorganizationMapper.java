package com.km.team.tongue.security.console.dao.mybatis;

import com.km.team.tongue.security.console.beans.pojo.Torganization;
import com.km.team.tongue.security.console.beans.pojo.TorganizationExample;
import com.km.team.tongue.security.console.beans.pojo.TorganizationWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TorganizationMapper {
    long countByExample(TorganizationExample example);

    int deleteByExample(TorganizationExample example);

    int deleteByPrimaryKey(String orgId);

    int insert(TorganizationWithBLOBs record);

    int insertSelective(TorganizationWithBLOBs record);

    List<TorganizationWithBLOBs> selectByExampleWithBLOBs(TorganizationExample example);

    List<Torganization> selectByExample(TorganizationExample example);

    TorganizationWithBLOBs selectByPrimaryKey(String orgId);

    int updateByExampleSelective(@Param("record") TorganizationWithBLOBs record, @Param("example") TorganizationExample example);

    int updateByExampleWithBLOBs(@Param("record") TorganizationWithBLOBs record, @Param("example") TorganizationExample example);

    int updateByExample(@Param("record") Torganization record, @Param("example") TorganizationExample example);

    int updateByPrimaryKeySelective(TorganizationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TorganizationWithBLOBs record);

    int updateByPrimaryKey(Torganization record);
}