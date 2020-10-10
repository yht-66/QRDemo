package com.chixing.service.impl;


import com.chixing.mapper.ProductMapper;
import com.chixing.pojo.Product;
import com.chixing.pojo.ProductExample;
import com.chixing.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getById(String proId) {
        return productMapper.selectByPrimaryKey(proId);
    }

    @Override
    public List<Product> getAll() {

        return null;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(String proId) {
        return false;
    }

    @Override
    public PageInfo<Product> getAllByPage(Integer pageNum) {
        return null;
    }

    @Override
    public PageInfo<Product> getByMoreCondition(String keyword, String brand, String color, Float size, Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        ProductExample example =  new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        if(keyword !=null && !keyword.equals(""))
            criteria.andProNameLike("%"+ keyword + "%");
        if(brand !=null && !brand.equals(""))
            criteria.andProNameLike("%"+ brand + "%");
        if(color !=null && !color.equals(""))
            criteria.andProColorLike("%"+ color + "%");
        if(size !=null && !size.equals(""))
            criteria.andProSizeEqualTo(size);

        List<Product> productList =  productMapper.selectByExample(example);
        PageInfo<Product> productPageInfo = new PageInfo<>(productList);
        return productPageInfo;
    }


}
