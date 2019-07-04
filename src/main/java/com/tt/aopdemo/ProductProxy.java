package com.tt.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 定义通知
 */
@Aspect
public class ProductProxy {
    //定义通知
    @Before(value = "myPointCut1()")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知...."+joinPoint);
    }

    @AfterThrowing(value = "execution(* com.tt.aopdemo.ProductDaoImpl.delete(..))", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        System.out.println("异常通知..."+ex.getClass().getSimpleName()+" joinPoint: "+joinPoint);
    }

    @AfterReturning(value = "execution(* com.tt.aopdemo.ProductDaoImpl.update(..))", returning = "result")
    public void afterReturning(Object result){
        System.out.println("返回结果通知，返回结果为："+result);
    }

    //定义切面
    @Pointcut(value = "execution(* com.tt.aopdemo.ProductDaoImpl.save(..))")
    public void myPointCut1(){}
}
