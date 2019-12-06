package com.run.bootparent.run.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.run.bootparent.common.RunJsonUtil;
import com.run.bootparent.run.entity.RUser;
import com.run.bootparent.run.mapper.RUserMapper;
import com.run.bootparent.run.service.IRUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表; InnoDB free: 4096 kB 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-20
 */
@Service
public class RUserServiceImpl extends ServiceImpl<RUserMapper, RUser> implements IRUserService {


    @Autowired
    private RUserMapper rUserMapper;

    @Override
    public IPage<RUser> testAll() {


        Page<RUser> page = new Page<>(0,2);

        QueryWrapper<RUser> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("id");

        //  RUser student = new RUser();
        //  student.setId("aaa");
        //  wrapper.setEntity(student);
        //分页查询
        IPage<RUser>  pp= rUserMapper.selectPage(page,wrapper);
        // String reqJson = JsonUtil.writeValue(pp);
        System.out.println(RunJsonUtil.writeValue(pp));
        return  null;
    }
}
