package com.tt.aopdemo;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.printf("保存信息");
    }

    @Override
    public void delete() {
        System.out.printf("删除信息");
    }
}
