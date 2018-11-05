package com.kepler.annotation;

import com.kepler.queue.QueuePolicy;

import java.lang.annotation.*;

/**
 * @author KimShen
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Queue {

	public QueuePolicy policy() default QueuePolicy.ABORT;

	public int queue() default 0;

	public int core() default 0;

	public int max() default 0;
}
