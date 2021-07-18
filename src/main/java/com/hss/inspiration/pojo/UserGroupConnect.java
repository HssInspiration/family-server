package com.hss.inspiration.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
@TableName("t_user_group_connect")
public class UserGroupConnect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id-主键
     */
    private Long id;

    /**
     * 用户组id
     */
    @TableField("userGroupId")
    private Long userGroupId;

    /**
     * 用户id
     */
    @TableField("userId")
    private Long userId;


}
