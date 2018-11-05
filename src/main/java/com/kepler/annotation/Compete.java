package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 
 * @author kim 2016年1月19日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Compete {

	/**
	 * 请求数量
	 * 
	 * @return
	 */
	public int span();
}
