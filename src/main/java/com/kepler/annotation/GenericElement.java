package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * @author KimShen
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface GenericElement {

	public Class<?>[] value();
}
