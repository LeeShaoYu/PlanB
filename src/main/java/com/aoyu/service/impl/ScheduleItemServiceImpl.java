package com.aoyu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aoyu.mapper.ScheduleItemMapper;
import com.aoyu.domain.ScheduleItem;
import com.aoyu.service.ScheduleItemService;
@Service
public class ScheduleItemServiceImpl extends ServiceImpl<ScheduleItemMapper, ScheduleItem> implements ScheduleItemService{

}
