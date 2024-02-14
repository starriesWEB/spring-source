package org.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/24 17:48
 * @Description
 */
public class BeanDefinitionRegistryPostProcessorTest implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("开始调用 BeanDefinition 后置处理器，当前 beanDefinition 数量" + registry.getBeanDefinitionCount());
		// 可以添加 beanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Object.class);
		registry.registerBeanDefinition("newBean", beanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("开始调用 BeanFactory 后置处理器，当前 beanDefinition 数量" + beanFactory.getBeanDefinitionCount());
	}
}
