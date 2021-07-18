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
@TableName("t_operation")
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id-主键
     */
    @TableId("operationId")
    private Long operationId;

    /**
     * 操作功能名称
     */
    @TableField("operationName")
    private String operationName;

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
     * 拦截前缀url
     */
    @TableField("interceptorPrefixUrl")
    private String interceptorPrefixUrl;

    /**
     * 操作功能序号
     */
    @TableField("operationCode")
    private Integer operationCode;

    private String remarks;


}
