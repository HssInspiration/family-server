package com.hss.inspiration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hss.inspiration.mapper.OperationLogMapper;
import com.hss.inspiration.pojo.OperationLog;
import com.hss.inspiration.service.IOperationLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hss
 * @since 2021-06-06
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
