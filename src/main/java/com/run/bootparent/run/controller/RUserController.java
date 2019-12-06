package com.run.bootparent.run.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.run.bootparent.common.RunJsonUtil;
import com.run.bootparent.run.entity.RUser;
import com.run.bootparent.run.mapper.RUserMapper;
import com.run.bootparent.run.service.IRUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表; InnoDB free: 4096 kB 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-20
 */
@Controller
@RequestMapping(value="run/RUserController")
public class RUserController {

    private static final Logger LOG = LoggerFactory.getLogger(RUserController.class);

   @Autowired
    private IRUserService irUserService;

    @RequestMapping(value="/a")
    public String a() {
        LOG.info("aaaaaaaaaaaaaaaaa");
        LOG.error("bbbbbbbbbbbbbbbb");
      //  RUser rUser= rUserMapper.selectById("1");
      //  RUser rUser2=new RUser();
     //   rUser2.setId("aaa");
      //  rUser2.setName("你怎么样");
      // int a= rUserMapper.insert(rUser2);
        irUserService.testAll();
        return "hello spring boot!";
    }


    @RequestMapping(value="/test")
    public String test() {
        return "web/a/2";
    }

}
