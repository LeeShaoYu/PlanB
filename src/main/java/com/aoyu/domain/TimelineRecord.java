package com.aoyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-aoyu-domain-TimelineRecord")
@Data
@TableName(value = "timeline_record")
public class TimelineRecord {
	/**
	 * id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "id")
	private Long id;

	/**
	 * 计划表id
	 */
	@TableField(value = "schedule_id")
	@ApiModelProperty(value = "计划表id")
	private Long scheduleId;

	/**
	 * 内容
	 */
	@TableField(value = "content")
	@ApiModelProperty(value = "内容")
	private String content;

	/**
	 * 开始时间
	 */
	@TableField(value = "start_time")
	@ApiModelProperty(value = "开始时间")
	private Date startTime;

	/**
	 * 结束时间
	 */
	@TableField(value = "end_time")
	@ApiModelProperty(value = "结束时间")
	private Date endTime;

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

	public static final String COL_SCHEDULE_ID = "schedule_id";

	public static final String COL_CONTENT = "content";

	public static final String COL_START_TIME = "start_time";

	public static final String COL_END_TIME = "end_time";

	public static final String COL_CREATE_DATE = "create_date";

	public static final String COL_UPDATE_DATE = "update_date";

	public static final String COL_STATUS = "status";
}