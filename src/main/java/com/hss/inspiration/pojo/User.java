package com.hss.inspiration.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户信息实体类
 * </p>
 *
 * @author hss
 * @since 2021-06-06
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("userId")
    private Long userId;

    /**
     * 用户密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户名称
     */
    @TableField("userName")
    private String userName;

    /**
     * 创建时间（精确到秒）
     */
    @TableField("createTime")
    private Date createTime;

    /**
     * 创建人名称
     */
    @TableField("createBy")
    private String createBy;

    /**
     * 更新时间（精确到秒）
     */
    @TableField("updateTime")
    private Date updateTime;

    /**
     * 更新人名称
     */
    @TableField("updateBy")
    private String updateBy;

    /**
     * 地址
     */
    @TableField("address")
    private String address;

    /**
     * 邮箱地址
     */
    @TableField("email")
    private String email;

    /**
     * 昵称（可重复）
     */
    @TableField("nickName")
    private String nickName;

    /**
     * 备注
     */
    @TableField("remarks")
    private String remarks;
}
