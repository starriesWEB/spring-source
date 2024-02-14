package org.springframework.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author starry
 * @version 1.0
 * @date 2023/12/30 21:24
 * @Description
 */
public class Student implements InitializingBean, DisposableBean {

	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Student#destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student#afterPropertiesSet");
	}

}
