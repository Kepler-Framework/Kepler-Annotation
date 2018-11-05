package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 标记后异常将被Collector判断为正常返回(For Class)
 * 
 * @author kim 2015年12月15日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface QuietThrowable {
}
