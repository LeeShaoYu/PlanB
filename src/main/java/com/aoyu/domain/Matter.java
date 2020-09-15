package com.aoyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-aoyu-domain-Matter")
@Data
@TableName(value = "matter")
public class Matter {
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "")
	private Long id;

	/**
	 * 标题
	 */
	@TableField(value = "title")
	@ApiModelProperty(value = "标题")
	private String title;

	/**
	 * 内容
	 */
	@TableField(value = "content")
	@ApiModelProperty(value = "内容")
	private String content;

	/**
	 * 上一级id
	 */
	@TableField(value = "parent_id")
	@ApiModelProperty(value = "上一级id")
	private Long parentId;

	/**
	 * 优先级
	 */
	@TableField(value = "priority")
	@ApiModelProperty(value = "优先级")
	private String priority;

	/**
	 * 频度
	 */
	@TableField(value = "frequency")
	@ApiModelProperty(value = "频度")
	private Long frequency;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_date")
	@ApiModelProperty(value = "创建时间")
	private Date createDate;

	/**
	 * 更新时间
	 */
	@TableField(value = "update_date")
	@ApiModelProperty(value = "更新时间")
	private Date updateDate;

	/**
	 * 数据状态
	 */
	@TableField(value = "status")
	@ApiModelProperty(value = "数据状态")
	private String status;

	public static final String COL_ID = "id";

	public static final String COL_TITLE = "title";

	public static final String COL_CONTENT = "content";

	public static final String COL_PARENT_ID = "parent_id";

	public static final String COL_PRIORITY = "priority";

	public static final String COL_FREQUENCY = "frequency";

	public static final String COL_CREATE_DATE = "create_date";

	public static final String COL_UPDATE_DATE = "update_date";

	public static final String COL_STATUS = "status";
}