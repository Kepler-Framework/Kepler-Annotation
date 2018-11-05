package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 内部使用
 * 
 * @author kim 2016年1月4日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Internal {

}
