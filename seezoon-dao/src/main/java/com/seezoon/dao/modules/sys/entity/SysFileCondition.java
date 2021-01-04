package com.seezoon.dao.modules.sys.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.seezoon.dao.framework.entity.PageCondition;
import com.seezoon.dao.framework.sort.annotation.SortField;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文件
 *
 * @author seezoon-generator 2021年1月2日 上午1:19:53
 */
@Getter
@Setter
@ToString
@SortField({"createTime:create_time"})
public class SysFileCondition extends PageCondition {

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称(模糊匹配)")
    private String name;
    /**
     * 相对路径
     */
    @ApiModelProperty(value = "相对路径")
    private String relativePath;

    @NotEmpty
    @Size(min = 2, max = 2)
    @ApiModelProperty(value = "上传日期")
    private String[] createDateRange;

}