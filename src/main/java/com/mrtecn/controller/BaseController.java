package com.mrtecn.controller;

import com.mrtecn.dao.MysqlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buildgreatdragon
 */
@RestController
@RequestMapping("/say")
public class BaseController {
    @Autowired
    MysqlDao mysqlDao;
    @GetMapping("/hello")
    public String sayHi(){
        JdbcTemplate jdbcTemplate = mysqlDao.getJdbcTemplate();
        return "hello word!";
    }
}
