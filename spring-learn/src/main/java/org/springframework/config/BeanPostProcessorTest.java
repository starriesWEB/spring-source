package org.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/24 17:46
 * @Description
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessorTest#postProcessBeforeInitialization()");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessorTest#postProcessAfterInitialization()");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
