package test.mybatis.ggsuccess.mapper;

import org.apache.ibatis.annotations.*;
import test.mybatis.ggsuccess.entity.Idolgroup;
import test.mybatis.ggsuccess.entity.Members;

import java.util.List;

@Mapper
public interface GroupMapper {

    @Select("Select * from idolgroup")
    List<Idolgroup> getAll();

    @Select("SELECT * FROM members")
    List<Members> getAllMember();
//    @Select("select * from idolgroup where groupname=#{groupname}")
//    Idolgroup getByGroupname(@Param{"groupname"} String groupname);
//    @Insert("INSERT INTO idolgroup(groupname,numberofmembers,debutyear,agency,leader) values(#{})")
}
