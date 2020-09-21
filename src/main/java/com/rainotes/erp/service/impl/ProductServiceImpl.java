package com.rainotes.erp.service.impl;

import com.rainotes.erp.entity.Product;
import com.rainotes.erp.mapper.ProductMapper;
import com.rainotes.erp.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-09-21
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
