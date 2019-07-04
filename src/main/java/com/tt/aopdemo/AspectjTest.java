package com.tt.aopdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AspectjTest {
    @Resource(name = "productDaoImpl")
    private ProductDaoImpl productDao;

    @Test
    public void test1(){
        productDao.save();

        try {
            productDao.delete();
        } catch (Exception e) {
            System.out.println("抛出异常");
        }

        productDao.update();
    }
}
