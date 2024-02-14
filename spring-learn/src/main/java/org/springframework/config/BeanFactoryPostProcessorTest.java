package org.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/24 17:59
 * @Description
 */
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor{
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessorTest#开始调用 BeanFactory 后置处理器，当前 beanDefinition 数量" + beanFactory.getBeanDefinitionCount());
	}

}
