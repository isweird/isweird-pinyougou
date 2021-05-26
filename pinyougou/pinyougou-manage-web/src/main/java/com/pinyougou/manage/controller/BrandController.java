package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RequestMapping("/brand")
@RestController
public class BrandController {

    @Reference(interfaceClass = BrandService.class)
    private BrandService brandService;

    @RequestMapping("/findAll")
    public @ResponseBody List<TbBrand> findAll(){
        List<TbBrand> result = brandService.queryAll();
        return result;
    }
}
