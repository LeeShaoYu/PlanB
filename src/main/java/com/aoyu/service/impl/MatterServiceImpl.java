package com.aoyu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aoyu.mapper.MatterMapper;
import com.aoyu.domain.Matter;
import com.aoyu.service.MatterService;
@Service
public class MatterServiceImpl extends ServiceImpl<MatterMapper, Matter> implements MatterService{

}
