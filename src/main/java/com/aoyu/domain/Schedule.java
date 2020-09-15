package com.aoyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-aoyu-domain-Schedule")
@Data
@TableName(value = "schedule")
public class Schedule {
	/**
	 * id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "id")
	private Long id;

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
	 * 总结
	 */
	@TableField(value = "summary")
	@ApiModelProperty(value = "总结")
	private String summary;

	/**
	 * 数据状态
	 */
	@TableField(value = "status")
	@ApiModelProperty(value = "数据状态")
	private String status;

	public static final String COL_ID = "id";

	public static final String COL_CREATE_DATE = "create_date";

	public static final String COL_UPDATE_DATE = "update_date";

	public static final String COL_SUMMARY = "summary";

	public static final String COL_STATUS = "status";
}