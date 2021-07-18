package com.hss.inspiration.controller;


import com.hss.inspiration.pojo.User;
import com.hss.inspiration.service.IUserService;
import com.hss.inspiration.vo.RespBean;
import com.hss.inspiration.vo.req.UserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hss
 * @since 2021-06-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public IUserService userService;

    /**
     * 新增一个用户数据
     *
     * @param userReq 用户信息
     * @return 响应信息
     */
    @PostMapping("/insert")
    public RespBean insert(@RequestBody UserReq userReq) {
        RespBean respBean = RespBean.success();
        Map<String, Object> resultMap = new HashMap<>(16);
        resultMap.put("id", userService.save(userReq));
        respBean.setData(resultMap);
        return respBean;
    }

    /**
     * 查询用户列表
     *
     * @return 用户列表
     */
    @GetMapping("/list")
    public RespBean listUser() {
        List<User> userList = userService.list();
        return RespBean.success(userList);
    }

    /**
     * 查询单个用户
     *
     * @param id 用户id
     * @return RespBean
     */
    @GetMapping("/{id}")
    public RespBean getUserById(@PathVariable Long id) {
        return RespBean.success(userService.getById(id));
    }

    /**
     * 修改单个用户信息
     *
     * @param user 用户对象
     * @return RespBean
     */
    @PostMapping("/update")
    public RespBean update(@RequestBody User user) {
        return RespBean.success(userService.updateById(user));
    }

    /**
     * 删除单个用户信息
     *
     * @param id 用户id
     * @return RespBean
     */
    @DeleteMapping("/{id}")
    public RespBean delete(@PathVariable Long id) {
        return RespBean.success(userService.removeById(id));
    }


}
