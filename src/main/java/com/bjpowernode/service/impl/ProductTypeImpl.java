package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.ProductTypeMapper;
import com.bjpowernode.pojo.ProductType;
import com.bjpowernode.pojo.ProductTypeExample;
import com.bjpowernode.service.ProductTypeService;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeImpl implements ProductTypeService {
    //业务逻辑层一定有数据访问层的对象
    @Autowired
    ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> getALL() {
        return productTypeMapper.selectByExample(new ProductTypeExample());
    }
}
