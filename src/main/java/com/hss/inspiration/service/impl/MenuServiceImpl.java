package com.hss.inspiration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hss.inspiration.mapper.MenuMapper;
import com.hss.inspiration.pojo.Menu;
import com.hss.inspiration.service.IMenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
