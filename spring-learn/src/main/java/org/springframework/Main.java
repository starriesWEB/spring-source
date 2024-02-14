package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author starry
 * @version 1.0
 * @date ${DATE} ${TIME}
 * @Description
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("==============================");
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName + ">>>" + context.getBean(beanDefinitionName).getClass());
		}
		System.out.println("==============================");
		//System.out.println(context.getBean(Student.class).getName());
		//System.out.println(context.getBean(Car.class).getId());
		//context.getBean("userBeanTest", UserBeanTest.class).showMe();
		//AopBean aopBean = context.getBean("aopBean", AopBean.class);
		//aopBean.test();
		//aopBean.testMethod();

		//((ClassA)context.getBean("classA")).show();
		//((ClassB)context.getBean("classB")).show();
	}
}