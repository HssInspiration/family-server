package com.hss.inspiration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hss.inspiration.constants.RespEnum;
import com.hss.inspiration.exception.GlobalException;
import com.hss.inspiration.mapper.UserMapper;
import com.hss.inspiration.pojo.User;
import com.hss.inspiration.service.IUserService;
import com.hss.inspiration.vo.req.UserReq;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hss
 * @since 2021-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public Long save(UserReq userReq) {
        if(userReq == null){
            throw new GlobalException(RespEnum.DATA_CANNOT_BE_NULL);
        }
        Long id = UUID.randomUUID().getMostSignificantBits() & Integer.MAX_VALUE;
        User user = User.builder().userId(id)
                .userName(userReq.getUserName())
                .nickName(userReq.getNickName())
                .address(userReq.getAddress())
                .createBy(userReq.getCreateBy())
                .password(userReq.getPassword())
                .createTime(userReq.getCreateTime())
                .updateBy(userReq.getUpdateBy())
                .updateTime(userReq.getUpdateTime())
                .email(userReq.getEmail())
                .remarks(userReq.getRemarks())
                .build();
        boolean result = save(user);
        if(!result){
            throw new GlobalException(RespEnum.INSERT_FAILED);
        }
        return user.getUserId();
    }
}
