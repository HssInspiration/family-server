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
@TableName("t_operation_authority_connect")
public class OperationAuthorityConnect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id-主键
     */
    private Long id;

    /**
     * 用户组id
     */
    @TableField("authorityId")
    private Long authorityId;

    /**
     * 操作功能id
     */
    @TableField("operationId")
    private Long operationId;


}
