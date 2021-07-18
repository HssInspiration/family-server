package com.hss.inspiration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hss.inspiration.mapper.PageMapper;
import com.hss.inspiration.pojo.Page;
import com.hss.inspiration.service.IPageService;
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
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements IPageService {

}
