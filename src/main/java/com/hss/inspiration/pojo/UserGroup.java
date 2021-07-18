package com.hss.inspiration.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hss
 * @since 2021-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user_group")
public class UserGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户组id
     */
    @TableId("userGroupId")
    private Long userGroupId;

    /**
     * 用户名称
     */
    @TableField("userGroupName")
    private String userGroupName;

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

    private String remarks;


}
