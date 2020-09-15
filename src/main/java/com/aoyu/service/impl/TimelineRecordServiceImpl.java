package com.aoyu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aoyu.mapper.TimelineRecordMapper;
import com.aoyu.domain.TimelineRecord;
import com.aoyu.service.TimelineRecordService;
@Service
public class TimelineRecordServiceImpl extends ServiceImpl<TimelineRecordMapper, TimelineRecord> implements TimelineRecordService{

}
