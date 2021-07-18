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
@TableName("t_file")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id-主键
     */
    @TableId("fileId")
    private Long fileId;

    /**
     * 文件名称
     */
    @TableField("fileName")
    private String fileName;

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
     * 文件路径
     */
    @TableField("fileUrl")
    private String fileUrl;

    private String remarks;


}
