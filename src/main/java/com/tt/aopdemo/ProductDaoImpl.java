package com.tt.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao{

    @Override
    public void save() {
        System.out.println("保存信息");
    }


    @Override
    public void delete() {
        System.out.println("删除信息");
        throw new ArithmeticException();
    }

    @Override
    public String update(){
        System.out.println("修改信息");
        return "我是update的返回结果";
    }
}
