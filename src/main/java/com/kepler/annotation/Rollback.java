package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 事务回滚标记
 * 
 * @author KimShen
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Rollback {

	public Class<?> clazz();

	public String method();
}
