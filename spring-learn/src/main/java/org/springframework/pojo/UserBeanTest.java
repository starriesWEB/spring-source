package org.springframework.pojo;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/25 14:46
 * @Description
 */
public abstract class UserBeanTest {

	public void showMe() {
		this.getBean().showMe();
	}

	public abstract AbstractUser getBean();
}
