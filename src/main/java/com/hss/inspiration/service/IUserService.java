package com.hss.inspiration.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hss.inspiration.pojo.User;
import com.hss.inspiration.vo.req.UserReq;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hss
 * @since 2021-06-06
 */
public interface IUserService extends IService<User> {

    /**
     * 保存一条用户信息
     *
     * @param userReq 请求
     * @return 用户id
     */
    Long save(UserReq userReq);
}
