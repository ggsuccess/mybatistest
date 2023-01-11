package test.mybatis.ggsuccess.mapper;

import org.apache.ibatis.annotations.*;
import test.mybatis.ggsuccess.entity.Idolgroup;

import java.util.List;

@Mapper
public interface GroupMapper {

    @Select("Select * from idolgroup")
    List<Idolgroup> getAll();
//    @Insert("INSERT INTO idolgroup(groupname,numberofmembers,debutyear,agency,leader) values(#{})")
}
