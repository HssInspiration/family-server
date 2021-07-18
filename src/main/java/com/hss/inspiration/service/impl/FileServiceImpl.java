package com.hss.inspiration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hss.inspiration.mapper.FileMapper;
import com.hss.inspiration.pojo.File;
import com.hss.inspiration.service.IFileService;
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
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
