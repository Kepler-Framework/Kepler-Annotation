package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 异步标签
 * 
 * @author kim 2015年10月31日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Async {

}
