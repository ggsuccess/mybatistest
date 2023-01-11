package test.mybatis.ggsuccess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.mybatis.ggsuccess.entity.Idolgroup;
import test.mybatis.ggsuccess.mapper.GroupMapper;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private GroupMapper groupMapper;

    @GetMapping("/")
    public String respo() {
        return "hello hahahaha";
    }

    @GetMapping("/group")
    public List<Idolgroup> getAll() {
        return groupMapper.getAll();
    }
}
