package com.chixing.controller;

import com.chixing.pojo.Product;
import com.chixing.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("product/{id}")
    @ResponseBody
    public Product getById(@PathVariable("id") String proId){
        return productService.getById(proId);
    }


    @GetMapping("product")

    public ModelAndView getByPage(String keyword, String brand, String color, Float size, Integer pageNum) {
        System.out.println("keyword:" + keyword + ",brand:" + brand + ",color:" + color + ",pageNum :" + pageNum);
        if(pageNum == null)
            pageNum = 1;
        PageInfo<Product> pageInfo =  productService.getByMoreCondition(keyword,brand,color,size,pageNum);
        System.out.println(pageInfo);
        ModelAndView mav = new ModelAndView();

        if(pageInfo.getList().size() >0){
            mav.addObject("keyword",keyword);
            mav.addObject("productList", pageInfo.getList());
            mav.addObject("pageInfo",pageInfo);

        }else{
            mav.addObject("keyword",keyword);
            mav.addObject("msg", "暂无此商品");
        }

        mav.setViewName("product/all");
        return mav;



    }




}

