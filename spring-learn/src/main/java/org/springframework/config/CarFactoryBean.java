package org.springframework.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.pojo.Car;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/24 22:59
 * @Description
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setId(id);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}


}
