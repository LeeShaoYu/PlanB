package com.aoyu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aoyu.domain.Schedule;
import com.aoyu.mapper.ScheduleMapper;
import com.aoyu.service.ScheduleService;
@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule> implements ScheduleService{

}
