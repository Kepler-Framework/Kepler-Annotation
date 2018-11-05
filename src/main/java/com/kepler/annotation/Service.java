package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * @author kim 2015年8月4日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Service {

	public String version() default "1.0.0";

	public String catalog() default "";
}
