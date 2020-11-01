package com.mrtecn.controller;

import com.mrtecn.dao.MysqlDao;
import com.mrtecn.mq.MyBeanReceiver;
import com.mrtecn.mq.MyBeanSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buildgreatdragon
 */
@RestController
@RequestMapping( "/say" )
public class BaseController {
    @Autowired
    MysqlDao mysqlDao;
    @Autowired
    MyBeanSender myBeanSender;
    @Autowired
    MyBeanReceiver myBeanReceiver;

    @GetMapping( "/hello" )
    public String sayHi() {
        JdbcTemplate jdbcTemplate = mysqlDao.getJdbcTemplate();
        return "hello word!";
    }

    @GetMapping( "/mq" )
    public String mq( @RequestParam String args ) {
        myBeanSender.send( args );
        return args;
    }


}
