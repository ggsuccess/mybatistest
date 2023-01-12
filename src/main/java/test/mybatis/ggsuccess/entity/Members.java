package test.mybatis.ggsuccess.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Members {
    private Integer idmembers;
    private String name;
    private Date birthday;
    private Integer height;
    private Date debutdate;
    private String hometown;
    private String nationality;
    private String groupname;
}
