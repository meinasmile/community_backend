package com.projects.doubao.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data
@Builder
@Accessors(chain = true)
@TableName("bms_promotion")
@NoArgsConstructor
@AllArgsConstructor
public class BmsPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 显示标题
     */
    @TableField("title")
    private String title;

    /**
     * 链接
     */
    @TableField("link")
    private String link;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

}