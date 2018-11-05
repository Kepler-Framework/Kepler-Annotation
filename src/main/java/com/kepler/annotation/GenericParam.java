package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * @author KimShen
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Inherited
public @interface GenericParam {

	public Class<?>[] value();
}
