package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 参数回调
 * 
 * @author kim 2015年12月27日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Config {

	public String value();

	/**
	 * 是否启动时初始化
	 * 
	 * @return
	 */
	public boolean init() default false;
}
