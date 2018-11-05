package com.kepler.annotation;

import java.lang.annotation.*;

/**
 * @author kim
 *
 * 2016年2月17日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Broadcast {
}
