package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * 是否自动发布
 * 
 * @author kim
 *
 * 2016年2月18日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Autowired {

	public String catalog() default "";

	/**
	 * Profile逻辑名
	 * 
	 * @return
	 */
	public String profile() default "";

	/**
	 * 实际发布版本, 覆盖@Service. 支持多版本
	 * 
	 * @return
	 */
	public String[] version() default "";

	public String[] aliases() default "";
}
