package org.springframework.config;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/24 22:59
 * @Description
 */
public class StudentMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		return "byReimplement";
	}
}
