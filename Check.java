package cn.itcast.annotation.demo;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//指定运行的时间
@Retention(RetentionPolicy.RUNTIME)
//指定注解加载函数上
@Target(ElementType.METHOD)
public @interface Check {
}
