package com.aoyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-aoyu-domain-ScheduleItem")
@Data
@TableName(value = "schedule_item")
public class ScheduleItem {
	/**
	 * id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "id")
	private Long id;

	/**
	 * 日程表id
	 */
	@TableField(value = "schedule_id")
	@ApiModelProperty(value = "日程表id")
	private Long scheduleId;

	/**
	 * 表项id
	 */
	@TableField(value = "matter_id")
	@ApiModelProperty(value = "表项id")
	private Long matterId;

	public static final String COL_ID = "id";

	public static final String COL_SCHEDULE_ID = "schedule_id";

	public static final String COL_MATTER_ID = "matter_id";
}