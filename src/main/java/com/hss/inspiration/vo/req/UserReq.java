package com.hss.inspiration.vo.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hss
 * @create 2021-06-13 23:20
 * @Desc
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 创建时间（精确到秒）
     */
    private Date createTime;

    /**
     * 创建人名称
     */
    private String createBy;

    /**
     * 更新时间（精确到秒）
     */
    private Date updateTime;

    /**
     * 更新人名称
     */
    private String updateBy;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 昵称（可重复）
     */
    private String nickName;

    /**
     * 备注
     */
    private String remarks;
}
