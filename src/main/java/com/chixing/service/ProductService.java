package com.chixing.service;

import com.chixing.pojo.Product;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ProductService {
    public Product getById(String proId);
    public List<Product> getAll();
    public boolean save(Product product);
    public boolean update(Product product);
    public boolean delete(String proId);
    // 分页查询
    public PageInfo<Product> getAllByPage(Integer pageNum);
//筛选
    public PageInfo<Product> getByMoreCondition(String keyword,String brand,String color,Float size,Integer pageNum);


}
