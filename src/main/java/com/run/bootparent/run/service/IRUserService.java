package com.run.bootparent.run.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.run.bootparent.run.entity.RUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表; InnoDB free: 4096 kB 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-20
 */
@Service
public interface IRUserService extends IService<RUser> {

    public IPage<RUser> testAll();

}
