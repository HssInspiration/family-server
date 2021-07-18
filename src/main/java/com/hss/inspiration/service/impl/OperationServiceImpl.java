package com.hss.inspiration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hss.inspiration.mapper.OperationMapper;
import com.hss.inspiration.pojo.Operation;
import com.hss.inspiration.service.IOperationService;
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
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation> implements IOperationService {

}
