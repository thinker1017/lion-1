package com.lion.vip.api.spi;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Spi {

    String value() default "";    //SPI名称

    int order() default 0;        //SPI排序顺序

}
